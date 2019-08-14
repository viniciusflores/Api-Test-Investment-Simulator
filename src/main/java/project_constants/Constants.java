package project_constants;

import io.restassured.http.ContentType;

public class Constants {
	public static final String APP_BASE_URL = "http://5b847b30db24a100142dce1b.mockapi.io/api";
	public static final String APP_BASE_PATH = "/v1";

	public static final ContentType APP_CONTENT_TYPE = ContentType.JSON;

	public static final long MAX_TIMEOUT = 5000L;
}
