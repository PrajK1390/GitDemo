package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
	
	 @Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
        System.out.println("Chrome browser is validated.");
    } 

    @When("^Browser is triggered$")
    public void browser_is_trigeered() throws Throwable {
        System.out.println("Chrome browser is triggered.");
    }

    @Then("^Check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
        System.out.println("Chrome browser is started.");
    }
	
	@Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
		//Code to navigate to Login URL
		
		System.out.println("Welcome to home page...");
        
    }

	@When("^user login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {

        
        System.out.println(strArg1); System.out.println(strArg2);
	}
	
	@When("^user sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
		List<List<String>> obj = data.asLists();
      System.out.println(obj.get(0).get(0));
      System.out.println(obj.get(0).get(1));
      System.out.println(obj.get(0).get(2));
      System.out.println(obj.get(0).get(3));
      System.out.println(obj.get(0).get(4));
    }
	
	 @When("^user login in to application with (.+) and password (.+)$")
	    public void user_login_in_to_application_with_and_password(String username, String password) throws Throwable {
	        System.out.println(username);
	        System.out.println(password);
	    }
	
    @Then("^home page is populated$")
    public void home_page_is_populated() throws Throwable {
       //Home page validation 
    	
    	System.out.println("Home page is validated..");
    }

    @And("^cards displayed are \"([^\"]*)\"$")
        public void cards_displayed_are_something(String strArg1) throws Throwable {
            System.out.println(strArg1);
    }
   
    


}
