package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage pag = new GooglePage();
    String expected = "";
    @Given("^I am on the google search page$")
    public void i_am_on_the_google_search_page() {
        pag.OpenGoogle();
    }
    @When("^I enter a search criteria$")
    public void i_enter_a_search_criteria() {
        pag.EnterSearchCriteria("java POO");
    }
    @And("^Click on the search button$")
    public void click_on_the_search_button() {
        pag.ClickSearch();
    }
    @Then("^the results match criteria$")
    public void the_results_match_criteria() {

    }

}
