package ui.selenium_tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.*;

public class Test2API {
	@Test 
	public void verifyHardGoodInRestResponse() {	
		RestAssured.baseURI = "http://localhost:3030/";
		RestAssured
		.given()
		.header("Accept", "application/json")

		.when()
		.get("/products")

		.then()
		.assertThat()
		.statusCode(200)
		.and()
		.contentType(ContentType.JSON)
		.and()
		.body("data[0].type",equalTo("HardGood") );

	}
}
