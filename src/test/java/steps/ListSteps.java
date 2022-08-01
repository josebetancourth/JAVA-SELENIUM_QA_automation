package steps;

import io.cucumber.java.en.*;
import pages.ListPage;

import java.util.List;

public class ListSteps {
    ListPage pag = new ListPage();
    @Given("make a query")
    public void makeAQuery() throws InterruptedException {
      pag.openListPage();
      pag.enterSearchCriteria("Washington");
    }

    @When("select element from list")
    public void selectElementFromList() {
        List<String> names = pag.getAllSearchResults();
        boolean Q = names.contains("Burien, Washington");
        if(Q){System.out.println("Si esta: PASA!");}
        else{System.out.println("No esta: FALLA!");}
    }
}
