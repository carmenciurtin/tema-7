package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeAppointmentButtonTest extends BaseTest {

        @Test(description = "Make Appointment button va redirectiona userul la pasul de login, dacă el nu este logat în momentul in care apasă pe buton")

        public void testMakeAppointmentButton() {

                driver.findElement(By.id("btn-make-appointment")).click();

                String expectedURL = "https://katalon-demo-cura.herokuapp.com/";
                String actualURL = driver.getCurrentUrl();
                Assert.assertEquals(expectedURL, actualURL);
        }
}
