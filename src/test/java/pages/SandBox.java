package pages;

import org.openqa.selenium.WebDriver;

public class SandBox extends BasePage{
            //web element xpath
    String select = "//select[@id='dropdown']",
            //URL sandbox_page
            sandboxpage = "https://the-internet.herokuapp.com/dropdown";

    public SandBox() {
        super(driver);
    }
    public void OpenSandBox(){
        OpenURL(sandboxpage);
    }
    public void SandBoxSelectByIndex(int index){
       SelectDropdownByIndex(select,index);
    }
}
