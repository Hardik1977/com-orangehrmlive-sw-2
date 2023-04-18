package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    //public static String baseUrl="";
    public void openBrowser(String baseUrl) {
        //launch the Chrome browser
        driver = new ChromeDriver();
        //Open the Url into the browser
        driver.get(baseUrl);
        //Maximise the Window
        driver.manage().window().maximize();
        //implicit timeout statement
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    public void closeBrowser() {
        //To close all the associated browser windows
        driver.quit();
    }


}
