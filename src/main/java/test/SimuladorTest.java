package test;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import core.BaseTest;

public class SimuladorTest extends BaseTest {
	@Test
	public void checkStatusTrue() {
		given()
		.when()
			.get("/simulador")
		.then()
			.statusCode(200);
	}
}
