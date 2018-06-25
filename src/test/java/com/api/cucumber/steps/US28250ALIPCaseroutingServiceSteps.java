package com.api.cucumber.steps;

import cucumber.api.java.en.When;
import net.serenitybdd.rest.SerenityRest;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import net.thucydides.core.annotations.Title;
public class US28250ALIPCaseroutingServiceSteps {

	@When("^Check if the status code is 200 and caseroutingservice$")
	@Title("TEST 1")
	public void verify_status_code_200_for_listendpoints() {
		SerenityRest.rest()
		.given()
		.when()
		.get("http://int-nbuw-caserouting.cloudhub.io/nbuw-apis/v1/caserouting-requests/caseRouting?productCode=WL&goCode=V73&caseType=New Application&policyType=BASE")
		.then()
		.statusCode(200);
		
	}
	
	@When("^check if the status code is 400 if policyType is not specified$")
	@Title("TEST 2")
	public void verify_status_code_400_for_listendpoints() {
		SerenityRest.rest()
		.given()
		.when()
		.get("http://int-nbuw-caserouting.cloudhub.io/nbuw-apis/v1/caserouting-requests/caseRouting?productCode=WL01&goCode=TC&caseType=AATC")
		.then()
		.statusCode(400);
		
	}
	
}
