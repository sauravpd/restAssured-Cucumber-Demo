package codeSample;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

/**
 * API Base Test
 * @author saurav
 *
 */
public class ApiBaseTest 
{
	protected Response response;
	protected ValidatableResponse json;
	protected RequestSpecification request;
}
