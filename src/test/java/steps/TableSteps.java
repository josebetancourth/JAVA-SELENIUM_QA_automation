package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.Tablepage;


public class TableSteps {
    Tablepage tab = new Tablepage();

        @Given("^Select a value from a table$")
    public void select_a_value_from_a_table(){
      tab.openCellPage();
        }

        @And("^extract them$")
    public void extract_them(){
       String expected = tab.returnCellValue(3,2);
           // Assert.assertEquals(expected,tab.firstResult());
            Assert.assertEquals(expected,"r: 2, c: 1");
            //System.out.println(tab.returnCellValue(3,2));
            Assert.assertTrue("showed element",tab.tableIsDisplayed());


        }

}
