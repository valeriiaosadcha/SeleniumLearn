package izotop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class GoogleTest {
    WebDriver driver;

@BeforeClass
    public void beforeMethod() {
        driver = new ChromeDriver();
    }

@Test
    public void testMethod () {
     driver.get("https://www.google.com");
     driver.findElement(By.name("q")).sendKeys("Toyota");
     driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    WebElement element = driver.findElement(By.cssSelector("div.rc"));
    for (WebElement el: elements) 
}

@AfterClass
    public void afterMethod () {
       driver.quit();
    }

}
