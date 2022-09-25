package tests;

import driver.WebdriverSet;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    protected ChromeDriver driver = null;

    @BeforeMethod
    public void AccesareURL(){
        driver = WebdriverSet.getChromedriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
    }

    @AfterMethod (alwaysRun = true)
    public void InchidereURL(){
        if(driver != null){
            //driver.quit();
        }
    }
}
