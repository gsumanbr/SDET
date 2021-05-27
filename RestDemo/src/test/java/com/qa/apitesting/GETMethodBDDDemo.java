package com.qa.apitesting;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GETMethodBDDDemo {
	
	@Test
	public void TC_02_GET() {
		// auto assertion in rest assured using BDD style given, when then format..
		
		given().get("https://reqres.in/api/users?page=2").then().statusCode(201);
		
		
	}
	@Test
	public void TC_03_GET() {
		
		
		given().get("https://reqres.in/api/users?page=2")
		.then().statusCode(200)
		.body("data.id[0]", equalTo(8));
		
	}

}