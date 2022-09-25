package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidLoginTest extends BaseTest {

    @Test(description = "Login din meniul din colțul dreapta sus, cu un user valid")

    public void testValidLogin()  {

        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.cssSelector("a[href=\"profile.php#login\"]")).click();
        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();

        String expectedURL = "https://katalon-demo-cura.herokuapp.com/#appointment";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }
}
