package apiPetstore;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Pet;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetStore {
    @Test
    public void getPetById_petReturned() {
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet/200")
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
//        response.print();

//        Assert.assertTrue(true);


    }
    @Test
    public void getPetById_petReturned2() {
        // Send a GET request to the specified URI and endpoint
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet/200")
                        .when()
                        .get()
                        .then()
                        .statusCode(200)  // Verify that the status code is 200 (OK)
                        .extract()
                        .response();

        // Print the entire response as a string
        System.out.println(response.asString());

        // Parse the response into a JsonPath object
        JsonPath jsonPath = response.jsonPath();

        // Deserialize the response JSON into a Pet object
        Pet responsePet = jsonPath.getObject("$", Pet.class);
        System.out.println(responsePet.getCategory().getName());

//         Print the name of the pet
        System.out.println(responsePet.getName());
    }
}