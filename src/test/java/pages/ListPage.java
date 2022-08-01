package pages;


import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class ListPage extends BasePage{
    public ListPage() {
        super(driver);
    }

    String searchField = "//body/form[1]/input[1]",
    //URL sandbox_page
    listpage = "https://andreidbr.github.io/JS30/06AjaxTypeAhead/index.html";

    public void openListPage(){
        OpenURL(listpage);
    }
    public void enterSearchCriteria(String search) throws InterruptedException {
         Thread.sleep(2000);//no usar por buenas practicas
         WriteElement(searchField, "Washington");
    }

    public List<String> getAllSearchResults() {
        List<WebElement> listElements = bringMeAllElements("name"); //grab the elements by classname
        List<String> listNames = new ArrayList<String>();
        for (WebElement e :listElements) {
            listNames.add(e.getText());
        }
        return listNames;
    }
}
