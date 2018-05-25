package com.qa.sdet;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class CountryInformation {

	public static void main(String[] args) {
		ResponseParser parser = new ResponseParser();
		String inline = "";
		String baseURL = "http://services.groupkt.com/state/get/USA/";
		String countryName = "cA";
		
		try {
			if(countryName == null || "".equals(countryName)) {
				System.out.println("Error: Please provide country Abbreviation");
				return;
			}
			countryName = formatCountryNameString(countryName);
			URL url = new URL(baseURL + countryName);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			Scanner sc = new Scanner(url.openStream());
			while (sc.hasNext()) {
				inline += sc.nextLine();
			}
			System.out.println("*************************************************************");
			System.out.println("JSON Response in String format");
			System.out.println(inline);
			System.out.println("*************************************************************");
			sc.close();

			parser.parseAndDisplayResults(inline);
			conn.disconnect();
		}
		catch (Exception e) {
			System.out.println("An error occured while connecting it with the Web Service :: " + e.getMessage());
			e.printStackTrace();
		}
	}

	private static String formatCountryNameString(String countryName) {
		
		if(countryName.equalsIgnoreCase("all")) {
			countryName = "all";
		} else {
			countryName = countryName.toUpperCase();
		}
		return countryName;
	}

}