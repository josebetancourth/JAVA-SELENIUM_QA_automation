package pages;

public class Tablepage extends BasePage {
    public Tablepage() {
        super(driver);
    }


     String cell="//body/div[@id='root']/div[1]/table[1]"
            ,URL="https://1v2njkypo4.csb.app";

    public void openCellPage(){
        OpenURL(URL);
    }

    public String returnCellValue(int row, int col){
      return getValueTable(cell,row, col);
    }

     public Boolean tableIsDisplayed(){  return elementDisplayed(cell); }
}
