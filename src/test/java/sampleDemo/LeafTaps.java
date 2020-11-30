package sampleDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LeafTaps {

    @Test
    public void startLeaf() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElementById("username").sendKeys("DemoSalesManager");
        driver.findElementById("password").sendKeys("crmsfa");
        driver.findElementByClassName("decorativeSubmit").click();
        driver.findElementByClassName("decorativeSubmit").click();
        driver.close();
    }
}
