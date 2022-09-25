package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeButtonTests extends BaseTest {

    @Test(description = "Accesare butonul Home din pagina https://katalon-demo-cura.herokuapp.com/")
    public void testHomeButton1() {

        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.cssSelector("a[href=\"./\"]")).click();

        String expectedURL= "https://katalon-demo-cura.herokuapp.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }
    @Test(description = "Accesare butonul Home din pagina https://katalon-demo-cura.herokuapp.com/profile.php#login")
    public void testHomeButton2() {

        driver.findElement(By.id("btn-make-appointment")).click();
        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.cssSelector("a[href=\"./\"]")).click();

        String expectedURL = "https://katalon-demo-cura.herokuapp.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }
    @Test(description = "Accesare butonul Home din pagina https://katalon-demo-cura.herokuapp.com/#appointment")
    public void testHomeButton3(){

         driver.findElement(By.id("menu-toggle")).click();
         driver.findElement(By.cssSelector("a[href=\"profile.php#login\"]")).click();
         driver.findElement(By.id("txt-username")).sendKeys("John Doe");
         driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
         driver.findElement(By.id("btn-login")).click();
         driver.findElement(By.id("menu-toggle")).click();
         driver.findElement(By.cssSelector("a[href=\"./\"]")).click();

         String expectedURL = "https://katalon-demo-cura.herokuapp.com/";
         String actualURL = driver.getCurrentUrl();
         Assert.assertEquals(expectedURL, actualURL);
    }
}

