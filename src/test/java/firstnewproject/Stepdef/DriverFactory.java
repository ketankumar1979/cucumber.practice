package firstnewproject.Stepdef;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.WebDriverManager.*;

public class DriverFactory {
    public static WebDriver driver;
    public DriverFactory(){
        PageFactory.initElements(driver,this);
    }
    public void openBrowser(){
        //WebDriverManager.iedriver().setup();
        //driver = new InternetExplorerDriver();


       // WebDriverManager.firefoxdriver().setup();
        chromedriver().setup();
       // System.setProperty("webdriver.chrome.driver","C:\\Users\\ketan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver","C:\\Users\\ketan\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.get("https://www.argos.co.uk/");

        }


    public void maxBrowser(){
        driver.manage().window().maximize();
    }
    public void implicitewait(){
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    }
    public void closeBrowser(){
        driver.quit();
    }
}
