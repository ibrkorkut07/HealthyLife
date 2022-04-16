package stepdefinitions.API_StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojo.DoctorAppointment;
import utilities.ConfigReader;


import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static utilities.Authentication2.generateToken;

public class US_010 {
    RequestSpecification spec;
    DoctorAppointment objeExpected;
    Response response;




    @Given("kullanici doktor randevu icin pathparams ayarlamasini yapar")
    public void kullanici_doktor_randevu_icin_pathparams_ayarlamasini_yapar() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("base_url")).build();
        spec.pathParams("first", "api", "second", "appointments","third",3403);
    }
    @Given("doctor randevu icin expected datalari girer")
    public void doctor_randevu_icin_expected_datalari_girer() {
        objeExpected =new DoctorAppointment(3403,"2021-12-22T17:00:00Z","2021-12-22T18:00:00Z","UNAPPROVED");

    }
    @Then("doctor randevulari icin request gonderir ve response alir")
    public void doctor_randevulari_icin_request_gonderir_ve_response_alir() {
        response = given().contentType(ContentType.JSON).spec(spec).header("Authorization","Bearer "+generateToken()).when().get("/{first}/{second}/{third}");
        //response.prettyPrint();
    }
    @Then("doctor randevulari icin api kayitlarini dogrular")
    public void doctor_randevulari_icin_api_kayitlarini_dogrular() {
        response.then().statusCode(200);
        HashMap<String,Object> actualData = response.as(HashMap.class);
        Assert.assertEquals(actualData.get("status"),objeExpected.getStatus());
        Assert.assertEquals(actualData.get("endDate"),objeExpected.getEndDate());
        Assert.assertEquals(actualData.get("startDate"),objeExpected.getStartDate());
        Assert.assertEquals(actualData.get("id"),objeExpected.getId());
       // Assert.assertEquals(response.getStatus(),objeExpected.getStatus());
    }



}
