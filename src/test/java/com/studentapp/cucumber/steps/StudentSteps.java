package com.studentapp.cucumber.steps;

import cucumber.api.java.en.When;
import net.serenitybdd.rest.SerenityRest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
public class StudentSteps {
	
	
	@When("^Check if the status code is 200 and correct$")
	@Title("TEST 1")
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
	
	@When("^Make sure the file you want to access is available$")
	public void verify_file_exist() throws IOException {
		File f =new File("E://file.txt");
		FileReader fr= new FileReader(f);
		fr.close();
	}
	
	@When("^Do not test this its a manual test case$")
	public void test_manual_testcase()
	{
		
	}
	
	@When("^Testing negative scenario dividing by 0$")
	public void test_negative_scenario()
	{
		System.out.println("This is an error" +(5/0));
	}
	}
