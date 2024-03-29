package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static Hooks.Hooks.spec;
import static io.restassured.RestAssured.given;

public class Authentication {



    public static String generateToken(String username, String password){

        //Set the base url
        //api/authenticate
        spec.pathParams("first", "api", "second", "authenticate");

        //Set the expected data

        Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("username", username);
        expectedData.put("password", password);
        expectedData.put("rememberMe","true" );

        //Send the Post request and get the data
        Response response = given().spec(spec).contentType(ContentType.JSON).
                body(expectedData).when().post("/{first}/{second}");

        response.prettyPrint();
        JsonPath json = response.jsonPath();



        return json.getString("id_token");

    }



}