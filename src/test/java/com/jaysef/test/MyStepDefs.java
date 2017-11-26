package com.jaysef.test;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class MyStepDefs {

	
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Exception {
		System.out.println("Given 1");
	}

	@Given("^some other precondition$")
	public void some_other_precondition() throws Exception {
		System.out.println("Given 2");
	}

	@Given("^I want to write a step with name(\\d+)$")
	public void i_want_to_write_a_step_with_name(int arg1) throws Exception {
		System.out.println("Given 3");
	}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) throws Exception {
		System.out.println("When 1");
	}
	
	
}
