package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeAppointmentPozitivTest extends BaseTest {

    @Test(description = "Scenariu test pozitiv de rezervare")

    public void testPozitivRezervare() {

        driver.findElement(By.id("btn-make-appointment")).click();
        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();

       // driver.findElement(By.cssSelector("select#combo_facility")).click();

       // driver.findElement(By.cssSelector("#chk_hospotal_readmission")).click();

        driver.findElement(By.id("txt_visit_date")).click();
        driver.findElement(By.id("txt_visit_date")).sendKeys("22/08/2022");

        driver.findElement(By.cssSelector("textarea#txt_comment.form-control")).click();
        driver.findElement(By.cssSelector("textarea#txt_comment.form-control")).clear();
        driver.findElement(By.cssSelector("textarea#txt_comment.form-control")).sendKeys("confirmare ora 18");

        driver.findElement(By.id("btn-book-appointment")).click();

        String expectedURL = "https://katalon-demo-cura.herokuapp.com/appointment.php#summary";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }
}

