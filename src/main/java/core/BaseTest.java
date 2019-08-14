package core;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import project_constants.Constants;

public class BaseTest extends Constants {
	@BeforeClass
	public void setupClass() {
		RestAssured.baseURI = APP_BASE_URL;
		RestAssured.basePath = APP_BASE_PATH;

		RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
		reqBuilder.setContentType(APP_CONTENT_TYPE);
		RestAssured.requestSpecification = reqBuilder.build();

		ResponseSpecBuilder resBuilder = new ResponseSpecBuilder();
		resBuilder.expectResponseTime(Matchers.lessThan(MAX_TIMEOUT));
		RestAssured.responseSpecification = resBuilder.build();

		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	}
}
