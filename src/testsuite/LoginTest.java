package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //1 Enter Admin name - Admin
        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys(("Admin"));
        //2 Enter Admin Password - admin123
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        //Click on Login button
        WebElement loginButton = driver.findElement(By.xpath("//button"));
        loginButton.click();
        //Verify the 'Dashboard' text is display
        String expectedMessage = "Dashboard";
        WebElement actualTextElement = driver.findElement(By.xpath("//h6"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Dashboard not displayed", expectedMessage, actualMessage);
    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}
