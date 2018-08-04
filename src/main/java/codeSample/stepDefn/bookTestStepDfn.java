package codeSample.stepDefn;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class bookTestStepDfn 
{
	@Given("^a book exists with an isbn of \"([^\"]*)\"$")
	public void a_book_exists_with_an_isbn_of(String arg1) throws Throwable 
	{
	
	}

	@When("^a user retrieves the book by isbn number$")
	public void a_user_retrieves_the_book_by_isbn_number() throws Throwable 
	{

	}

	@Then("^the status code is \"([^\"]*)\"$")
	public void the_status_code_is(String arg1) throws Throwable 
	{

	}

	@Then("^response includes the following in any order$")
	public void response_includes_the_following_in_any_order(DataTable arg1) throws Throwable 
	{
	
	}
}
