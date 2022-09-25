package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class InvalidLoginTest extends BaseTest {

    @Test(description = "Login din meniul din colțul dreapta sus, cu un user valid")

    public void testInvalidLogin(){

        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.cssSelector("a[href=\"profile.php#login\"]")).click();
        driver.findElement(By.id("txt-username")).sendKeys("Invalid User");
        driver.findElement(By.id("txt-password")).sendKeys("InvalidPassword");
        driver.findElement(By.id("btn-login")).click();

        WebElement textDanger = driver.findElement(By.cssSelector("p.lead.text-danger"));
        assertEquals(textDanger.getText(), "Login failed! Please ensure the username and password are valid.", "true");
    }
}
