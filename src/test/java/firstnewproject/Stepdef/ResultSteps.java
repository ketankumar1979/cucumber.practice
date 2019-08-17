package firstnewproject.Stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResultSteps extends DriverFactory{

    @Given("^customer is on result page$")
    public void customer_is_on_result_page() throws Throwable {


    }

    @When("^customer select price range from filter$")
    public void customer_select_price_range_from_filter() throws Throwable {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"findability\"]/div/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div/div/ul/li[2]/label"));
          element.click();
    }

    @Then("^customer can see all products within that price range$")
    public void customer_can_see_all_products_within_that_price_range() throws Throwable {

    }

}
