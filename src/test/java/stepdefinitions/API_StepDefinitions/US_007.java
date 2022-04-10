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

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
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
   appointment=new Appointment();

        appointment.setFirstname(firstname);
       appointment.setLastname(lastname);
       appointment.setSsn(SSN);
        appointment.setEmail(email);
        appointment.setPhoneNumber(phone);
       appointment.setStartDate(date);
}
    @Then("request gonderir ve response alir")
    public void request_gonderir_ve_response_alir() {
        //response = given().contentType(ContentType.JSON).spec(spec).header("Authorization","Bearer "+generateToken("Team94Admin","Batch44+")).body(appointment).when().post("/{first}/{second}");
        response = given().contentType(ContentType.JSON).spec(spec).header("Authorization","Bearer "+generateToken("Team94Admin","Batch44+")).body(appointment).when().post("/{first}/{second}/{third}");
        response.prettyPrint();
    }
    @Then("api kayitlarini dogrular")
    public void api_kayitlarini_dogrular() {
        response.then().statusCode(201);
        HashMap<String,Object> actualData = response.as(HashMap.class);
        assertEquals(appointment.getFirstname(),((HashMap)actualData.get("patient")).get("firstName"));
        assertEquals(appointment.getSsn(),((HashMap)((HashMap)actualData.get("patient")).get("user")).get("ssn"));



    }











    }

