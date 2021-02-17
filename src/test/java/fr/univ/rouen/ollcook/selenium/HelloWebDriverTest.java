package fr.univ.rouen.ollcook.selenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class HelloWebDriverTest {

    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "target/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void helloWebDriver() throws Exception {

        driver.get("http://localhost:8080/SeleniumTest/");

        WebElement pageHeading = driver.findElement(By.tagName("p"));

        assertEquals("Welcome to the first example!", pageHeading.getText());
    }
}