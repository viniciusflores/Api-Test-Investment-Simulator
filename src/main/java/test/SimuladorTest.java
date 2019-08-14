package test;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import core.BaseTest;

public class SimuladorTest extends BaseTest {
	@Test
	public void checkStatusTrue() {
		given().when().get("/simulador").then().statusCode(200);
	}

	@Test
	public void checkSizeMonthAndValue() {
		// ArrayList<String>
		int months = given().when().get("/simulador").then().statusCode(200).extract().path("meses.findAll().size()");
		int values = given().when().get("/simulador").then().statusCode(200).extract().path("meses.findAll().size()");
		Assert.assertEquals(months, values);
	}
	
}
