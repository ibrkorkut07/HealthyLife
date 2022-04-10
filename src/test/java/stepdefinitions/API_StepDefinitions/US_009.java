package stepdefinitions.API_StepDefinitions;


import baseUrl.MedunnaBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.ConfigReader;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US_009  extends MedunnaBaseUrl{
    /*
        "createdBy": "anonymousUser",
        "createdDate": "2022-01-01T14:31:36.539261Z",
        "id": 4862,
        "firstName": "Omer",
        "lastName": "Nadercikli",
        "birthDate": "1010-02-01T18:38:00Z",
        "phone": "4387221874",
        "gender": "FEMALE",
        "bloodGroup": "Bnegative",
        "adress": "Fettek",
        "email": "elroy.mitchell@gmail.com",
        "description": "We are conducting Medunna",
        "user": {
        "createdBy": "anonymousUser",
        "createdDate": "2021-12-25T17:00:55.695854Z",
        "id": 3314,
        "login": "apl",
        "firstName": "Pl",
        "lastName": "Ali",
        "email": "apl@email.com",
        "activated": true,
        "langKey": "en",
        "imageUrl": null,
        "resetDate": null,
        "ssn": "888-88-8766"
        },
        "appointments": null,
        "inPatients": null,
        "country": {
        "id": 1201,
        "name": "US"
        },
        "cstate": {
        "id": 1251,
        "name": "Alaska",
        "country": {
        "id": 1201,
        "name": "US"
        }
        }
        } */


    Response response;
    Map<String, Object> expectedData;
    RequestSpecification spec;



    @Given("staff gerekli path params ayarlar")
    public void staff_gerekli_path_params_ayarlar() {

        spec=new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("base_url")).build();
        spec.pathParams("first","api","second","patients","three",4862);

    }

    @Given("expected datalari girer")
    public void expected_datalari_girer() {

       /* StaffContryPojo staffContryDate=new StaffContryPojo("1201","US");
        StaffCstatePojo staffCstateDate=new StaffCstatePojo("1251","Alaska",staffContryDate);
        StaffUserPojo staffUserDate=new StaffUserPojo("anonymousUser","2021-12-25T17:00:55.695854Z",
                "3314","apl","Ali","apl@email.com",true,"en",null,null,"888-88-8766",staffCstateDate);
        StaffApiPojo expectedData=new StaffApiPojo("anonymousUser","2022-01-01T14:31:36.539261Z",
                "4862","Omer","Nadercikli","1010-02-01T18:38:00Z","4387221874",
                "FEMALE","Bnegative","Fettek","elroy.mitchell@gmail.com","We are conducting Medunna",staffUserDate); */



        expectedData = new HashMap<>();
        expectedData.put("firstName","Omer");
        expectedData.put("lastName","Nadercikli");
        expectedData.put("email","elroy.mitchell@gmail.com");



    }

    @When("request gonderir ve response alir")
    public void request_gonderir_ve_response_alir() {

        response = given().contentType(ContentType.JSON)
                    .spec(spec).header("Authorization","Bearer " + generateToken()).
                     when().
                get("/{first}/{second}/{three}");
        response.prettyPrint();
    }


    @When("hasta bilgilerini dogrular")
    public void hasta_bilgilerini_dogrular() {

        JsonPath jsonPath=response.jsonPath();



        assertEquals(expectedData.get("firstName"),jsonPath.getString("firstName"));
        assertEquals(expectedData.get("lastName"),jsonPath.getString("lastName"));
        assertEquals(expectedData.get("email"),jsonPath.getString("email"));




      /* StaffApiPojo actualData = response.as(StaffApiPojo.class);

        assertEquals(expectedData.getFirstName(),actualData.getFirstName());
        assertEquals(expectedData.getLastName() ,actualData.getLastName());
        assertEquals(expectedData.getBirthDate(), actualData.getBirthDate());
        assertEquals(expectedData.getPhone(), actualData.getPhone());
        assertEquals(expectedData.getGender(), actualData.getGender());
        assertEquals(expectedData.getBloodGroup(), actualData.getBloodGroup());
        assertEquals(expectedData.getAdress(), actualData.getAdress());  */

    }

}





