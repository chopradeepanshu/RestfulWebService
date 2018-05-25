package com.qa.sdet;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ResponseParser {

	public void parseAndDisplayResults(String inline) throws ParseException {
		JSONParser parse = new JSONParser();
		JSONObject jobj = (JSONObject) parse.parse(inline);
		JSONObject restResponse = (JSONObject) jobj.get("RestResponse");
		String message = retrieveMessageStringFromResponse(restResponse);

		if (message.startsWith("State")) {
			JSONObject resultObject = (JSONObject) restResponse.get("result");
			if (resultObject != null) {
				System.out.println("Capital of " + resultObject.get("name") + " is " + resultObject.get("capital")
						+ " and its Largest City is " + resultObject.get("largest_city"));
			} 
		} else {
			JSONArray resultArray = (JSONArray) restResponse.get("result");
			if (resultArray != null) {
				for (int i = 0; i < resultArray.size(); i++) {
					JSONObject filteredResults = (JSONObject) resultArray.get(i);
					System.out.println(
							"Capital of " + filteredResults.get("name") + " is " + filteredResults.get("capital")
									+ " and its Largest City is " + filteredResults.get("largest_city"));
				}
			} else {
				JSONArray errorMessage = (JSONArray) restResponse.get("messages");
				System.out.println("Error Message Received :: " + errorMessage);
			}
		}
	}

	private String retrieveMessageStringFromResponse(JSONObject restResponse) {
		return restResponse.get("messages").toString().substring(2, 10);
	}

}
