package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeAppointmentNegativTest extends BaseTest {

    @Test(description = "Scenariu test negativ de rezervare")

    public void testNegativRezervare() {

        driver.findElement(By.id("btn-make-appointment")).click();
        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();

        driver.findElement(By.id("txt_visit_date")).click();
        driver.findElement(By.id("txt_visit_date")).sendKeys("30/08/1900");

        driver.findElement(By.id("btn-book-appointment")).click();

        String expectedURL = "https://katalon-demo-cura.herokuapp.com";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }
}

