package com.cucumber.steps;

import com.cucumber.dto.User;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserManagementSteps {

    private Response response;

    @When("the client calls users")
    public void when_uset_call_users() {
        RequestSpecification request = given();
        request.header("Content-Type", "application/json");
        response = request.get("http://localhost:8080/users");
    }

    @Then("the client receives status code of 200")
    public void client_recieve_200() {
        assertEquals(response.getStatusCode(), 200);
    }

    @And("the client receives a user list array")
    public void client_recieve_users_list() {
        List<User>  userList = response.as(List.class); //mapping
        assertTrue(!userList.isEmpty());
    }

}
