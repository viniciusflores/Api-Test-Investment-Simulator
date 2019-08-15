package test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import core.BaseTest;

/**
 * 
 * @author vinicius.flores
 *
 */
public class SimuladorTest extends BaseTest {
	ArrayList<String> months = new ArrayList<>(Arrays.asList("112", "124", "136", "148"));
	ArrayList<String> values = new ArrayList<>(Arrays.asList("2.802", "3.174", "3.564", "3.971"));

	@Test
	public void checkStatusTrue() {
		given()
		.when()
			.get("/simulador")
		.then()
			.statusCode(200)
			.assertThat();
	}

	@Test
	public void checkSizeMonthAndValue() {
		int sizeMonths = given()
		.when()
			.get("/simulador")
		.then()
			.statusCode(200)
			.extract().path("meses.findAll().size()");
		int sizeValues = given()
		.when()
			.get("/simulador")
		.then()
			.statusCode(200)
			.extract().path("valor.findAll().size()");
		Assert.assertEquals(sizeMonths, sizeValues);
	}

	@Test
	public void checkSequenceOfMonths() {
		ArrayList<String> responseOfMonths = given()
		.when()
			.get("/simulador")
		.then()
			.statusCode(200)
			.extract().path("meses.findAll()");
		assertEquals(responseOfMonths, months);
	}

	@Test
	public void checkSequenceOfValues() {
		ArrayList<String> responseOfValues = given()
		.when()
			.get("/simulador")
		.then()
			.statusCode(200)
			.extract().path("valor.findAll()");
		assertEquals(responseOfValues, values);
	}
}
