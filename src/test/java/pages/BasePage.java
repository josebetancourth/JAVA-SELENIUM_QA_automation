package pages;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions accion;

    static{
            ChromeOptions Chromeoptions = new ChromeOptions();
            driver = new ChromeDriver(Chromeoptions);
           wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static void OpenURL(String url){
        driver.get(url);
    }
    public static void CloseURL(){
        driver.close();
    }

    private WebElement LocateElement(String locator){
      return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
    
    public void ClickElement(String locat){
     LocateElement(locat).click();
    }

    public void WriteElement(String locat,String text){
     LocateElement(locat).clear();
     LocateElement(locat).sendKeys(text);
    }

    public void SelectDropdownByValue(String locator, String ValueSelect){
        Select dropdown = new Select(LocateElement(locator));
        dropdown.selectByValue(ValueSelect);
    }

    public void SelectDropdownByIndex(String locator, int index){
        Select dropdown = new Select(LocateElement(locator));
        dropdown.selectByIndex(index);
    }

    public void HoverOver(String locator){
       accion.moveToElement(LocateElement(locator));
    }

    public void DoubleClick(String locator){
        accion.doubleClick(LocateElement(locator));
    }

    public void ContextClick(String locator){
        accion.contextClick(LocateElement(locator));
    }

    public String getValueTable(String locator, int row, int column){
        String cellLocator = locator+"/tbody/tr["+row+"]/td["+column+"]";
        return LocateElement(cellLocator).getText();
    }

    public void switchToIframe(int index){
      driver.switchTo().frame(index);
    }
    public void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }

    public void closeAlert(){
        driver.switchTo().alert().dismiss();
    }

    public String getTextFormElement(String locator){
       return LocateElement(locator).getText();
    }

    public Boolean elementDisplayed(String locator){ return LocateElement(locator).isDisplayed();}

    public Boolean elementEnabled(String locator){ return LocateElement(locator).isEnabled();}

    public Boolean elementSelected(String locator){ return LocateElement(locator).isSelected();}

    public List<WebElement> bringMeAllElements(String locator){
        return driver.findElements(By.className(locator)); }
}
