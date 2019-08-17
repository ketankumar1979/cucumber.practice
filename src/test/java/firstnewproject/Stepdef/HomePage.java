package firstnewproject.Stepdef;

import firstnewproject.Stepdef.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactory {

    @FindBy(id = "searchTerm")
    WebElement searchbox;

    @FindBy(css = "._2mKaC")
    WebElement magnifierglass;

    public void doSearch(String item){

        searchbox.sendKeys(item);
        magnifierglass.click();
    }
}
