package firstnewproject.Stepdef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import firstnewproject.Stepdef.DriverFactory;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();
    @Before
    public void setup(){
        driverFactory.openBrowser();
        driverFactory.maxBrowser();
        driverFactory.implicitewait();
    }
    @After
    public void teardown(){
        driverFactory.closeBrowser();
    }
}
