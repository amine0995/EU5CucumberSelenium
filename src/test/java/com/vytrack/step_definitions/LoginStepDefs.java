package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("1");
    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {
        System.out.println("2");
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("3");
    }


}
