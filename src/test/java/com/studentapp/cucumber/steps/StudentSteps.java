package com.studentapp.cucumber.steps;

import cucumber.api.java.en.When;
import net.serenitybdd.rest.SerenityRest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
public class StudentSteps {
	
	
	@When("^Check if the status code is 200 and correct$")
	public void verify_status_code_200_for_listendpoints() {
		SerenityRest.rest()
		.given()
		.when()
		.get("/list")
		.then()
		.statusCode(200);
		
	}
	
	@When("^Make sure the application has the necessary requirements checked$")
	public void verify_necessary_requirements() {
		SerenityRest.rest()
		.given()
		.when()
		.get("/list")
		.then()
		.statusCode(200);
		
	}
	
}
