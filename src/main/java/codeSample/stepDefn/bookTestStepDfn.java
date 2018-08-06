package codeSample.stepDefn;

import static io.restassured.RestAssured.given;

import java.util.Map;

import org.junit.Assert;

import codeSample.ApiBaseTest;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
 * Book test Step definition class
 * @author saurav
 *
 */
public class bookTestStepDfn extends ApiBaseTest 
{
	private String getBookByISBNNumberEndpoint = "https://www.googleapis.com/books/v1/volumes";

	@Given("^a book exists with an isbn of \"([^\"]*)\"$")
	public void a_book_exists_with_an_isbn_of(String isbnNumber) throws Throwable 
	{
		request=given().queryParam("q",isbnNumber);
	}

	@When("^a user retrieves the book by isbn number$")
	public void a_user_retrieves_the_book_by_isbn_number() throws Throwable 
	{
		response=request.when().get(getBookByISBNNumberEndpoint);
	}

	@Then("^the status code is \"([^\"]*)\"$")
	public void the_status_code_is(String statusCode) throws Throwable 
	{
		Assert.assertEquals(response.getStatusCode(),Integer.parseInt(statusCode));
	}

	@Then("^response includes the following details$")
	public void response_includes_the_following_details(DataTable table) throws Throwable 
	{
		Map<String, String> expectedResponseMap = table.asMap(String.class,String.class);	
		Assert.assertTrue(response.jsonPath().getString("items.volumeInfo.title").contains(expectedResponseMap.get("items.volumeInfo.title")));
	}
}
