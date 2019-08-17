package firstnewproject.Stepdef;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSteps {
    HomePage homePage = new HomePage();

    @Given("^user is on home page$")
    public void user_is_on_home_page()  {

    }

    @When("^user search for product \"([^\"]*)\"$")
    public void user_search_for_product(String arg1) {
        homePage.doSearch("nike");

    }

    @Then("^user can able to see respective products$")
    public void user_can_able_to_see_respective_products()  {

    }



}
