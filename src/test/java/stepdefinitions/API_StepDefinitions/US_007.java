package stepdefinitions.API_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.Appointment;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US_007 {
    RequestSpecification spec;
    Appointment appointment=new Appointment();
    Response response;

    @Given("kullanici randevu icin pathparams ayarlamasini yapar")
    public void kullaniciRandevuIcinPathparamsAyarlamasiniYapar() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("base_url")).build();
        spec.pathParams("first", "api", "second", "appointments","third","request");
    }


    @And("randevu icin expected datalari girer {string}, {string} {string} {string} {string}  and {string}")
    public void randevuIcinExpectedDatalariGirerAnd(String firstname, String lastname, String SSN, String email, String phone, String date) {

        appointment.setFirstname(firstname);
        appointment.setLastname(lastname);
        appointment.setSsn(SSN);
        appointment.setEmail(email);
        appointment.setPhoneNumber(phone);
        appointment.setDate(date);}
    @Then("request gonderir ve response alir")
    public void request_gonderir_ve_response_alir() {
        response = given().spec(spec).contentType(ContentType.JSON).header("Authorization","Bearer "+generateToken("team94admin","Batch44+")).body(appointment).when().post("/{first}/{second}/{third}");
        response.prettyPrint();
    }
    @Then("api kayitlarini dogrular")
    public void api_kayitlarini_dogrular() {

    }











    }

