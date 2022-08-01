package pages;

import static java.lang.Thread.sleep;

public class GooglePage extends BasePage {
           // webelements xpath
    String TextField = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]",
           SearchButton = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[5]/center[1]/input[1]",
           //pagina
           URL = "https://www.google.com"
           ;

    public GooglePage() {
        super(driver);
    }

    public void OpenGoogle(){
        OpenURL(URL);
    }

    public void CLoseGoogle(){
        CloseURL();//no...
    }

    public void ClickSearch(){
    ClickElement(SearchButton);
    }

    public void EnterSearchCriteria(String criteria){
        WriteElement(TextField,criteria);
    }

}
