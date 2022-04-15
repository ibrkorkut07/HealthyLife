package stepdefinitions.API_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import utilities.ApiUtils;
import utilities.Authentication;
import utilities.Authentication2;
import utilities.ConfigReader;

import static org.hamcrest.CoreMatchers.hasItems;

public class US019_Api {
    Response response;


    @Given("user sends the get request for Staff data")
    public void userSendsTheGetRequestForStaffData() {
        response= ApiUtils.getRequest(Authentication.generateToken("Team94Admin","Batch44+"), ConfigReader.getProperty("staff_endpoint"));
        response.prettyPrint();
    }

    @And("user deserializes data to Java for Staff")
    public void userDeserializesDataToJavaForStaff() {
        response.then().assertThat().body("firstName",hasItems("John"));
        response.then().assertThat().body("lastName",hasItems("Steinbeck"));
    }

    @And("user saves the users data to correspondent files for Staff")
    public void userSavesTheUsersDataToCorrespondentFilesForStaff() {
    }

    @Given("user connects to the Staff database")
    public void userConnectsToTheStaffDatabase() {
    }

    @And("user selects all Staff {string} column data")
    public void userSelectsAllStaffColumnData(String arg0) {
    }

    @And("user verify Staff {string} with the database")
    public void userVerifyStaffWithTheDatabase(String arg0) {
    }

    @Then("close the connection")
    public void closeTheConnection() {
    }
}
