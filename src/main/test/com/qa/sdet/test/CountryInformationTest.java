package com.qa.sdet.test;

import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;

public class CountryInformationTest {
	@BeforeClass
	public static void init() {
		RestAssured.baseURI = "http://services.groupkt.com/state/get/USA";
	}
	@Test
	public void test_Alabama_Success() {
		get("/AL")
		.then()
		.body("RestResponse.result.largest_city", equalTo("Birmingham"))
		.body("RestResponse.result.capital", equalTo("Montgomery"));
	}
	@Test
	public void test_Alaska_Success() {
		get("/AK")
		.then()
		.body("RestResponse.result.largest_city", equalTo("Anchorage"))
		.body("RestResponse.result.capital", equalTo("Juneau"));
	}
	@Test
	public void test_Arizona_Success() {
		get("/AZ")
		.then()
		.body("RestResponse.result.largest_city", equalTo("Phoenix"))
		.body("RestResponse.result.capital", equalTo("Phoenix"));
	}
	@Test
	public void test_Arkansas_Success() {
		get("/AR")
		.then()
		.body("RestResponse.result.largest_city", equalTo("Little Rock"))
		.body("RestResponse.result.capital", equalTo("Little Rock"));
	}
	@Test
	public void test_California_Success() {
		get("/CA")
		.then()
		.body("RestResponse.result.largest_city", equalTo("Los Angeles"))
		.body("RestResponse.result.capital", equalTo("Sacramento"));
	}
	@Test
	public void test_Colorado_Success() {
		get("/CO")
		.then()
		.body("RestResponse.result.largest_city", equalTo("Denver"))
		.body("RestResponse.result.capital", equalTo("Denver"));
	}
	@Test
	public void test_Connecticut_Success() {
		get("/CT")
		.then()
		.body("RestResponse.result.largest_city", equalTo("Bridgeport"))
		.body("RestResponse.result.capital", equalTo("Hartford"));
	}
	@Test
	public void test_Delaware_Success() {
		get("/DE")
		.then()
		.body("RestResponse.result.largest_city", equalTo("Wilmington"))
		.body("RestResponse.result.capital", equalTo("Dover"));
	}
	@Test
	public void test_Florida_Success() {
		get("/FL")
		.then()
		.body("RestResponse.result.largest_city", equalTo("Jacksonville"))
		.body("RestResponse.result.capital", equalTo("Tallahassee"));
	}
	@Test
	public void test_Georgia_Success() {
		get("/GA")
		.then()
		.body("RestResponse.result.largest_city", equalTo("Atlanta"))
		.body("RestResponse.result.capital", equalTo("Atlanta"));
	}
	@Test
	public void test_Hawaii_Success() {
		get("/HI")
		.then()
		.body("RestResponse.result.largest_city", equalTo("Honolulu"))
		.body("RestResponse.result.capital", equalTo("Honolulu"));
	}
	@Test
	public void test_Idaho_Success() {
		get("/ID")
		.then()
		.body("RestResponse.result.largest_city", equalTo("Boise"))
		.body("RestResponse.result.capital", equalTo("Boise"));
	}
	@Test
	public void test_Illinois_Success() {
		get("/IL")
		.then()
		.body("RestResponse.result.largest_city", equalTo("Chicago"))
		.body("RestResponse.result.capital", equalTo("Springfield"));
	}
	@Test
	public void test_Indiana_Success() {
		get("/IN")
		.then()
		.body("RestResponse.result.largest_city", equalTo("Indianapolis"))
		.body("RestResponse.result.capital", equalTo("Indianapolis"));
	}
	@Test
	public void test_Iowa_Success() {
		get("/IA")
		.then()
		.body("RestResponse.result.largest_city", equalTo("Des Moines"))
		.body("RestResponse.result.capital", equalTo("Des Moines"));
	}
	@Test
	public void test_Kansas_Success() {
		get("/KS")
		.then()
		.body("RestResponse.result.largest_city", equalTo("Wichita"))
		.body("RestResponse.result.capital", equalTo("Topeka"));
	}
	@Test
	public void test_Kentucky_Success() {
		get("/KY")
		.then()
		.body("RestResponse.result.largest_city", equalTo("Louisville"))
		.body("RestResponse.result.capital", equalTo("Frankfort"));
	}
}
