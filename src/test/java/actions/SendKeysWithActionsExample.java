package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithActionsExample {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.example.com");

        // Find the element to perform actions on
        WebElement element = driver.findElement(By.id("myElement"));

        // Create an Actions object
        Actions actions = new Actions(driver);

        // Perform actions on the element
        actions.moveToElement(element)
                .click()
                .sendKeys("Selenium Course by Tayyab Mohammed")
                .build()
                .perform();

        // Close the browser
        driver.quit();
    }
}

/*
In this example, we first locate the element on the webpage using driver.findElement(By.id("myElement")).

We then create an Actions object by passing the WebDriver instance to it. We chain the actions on the element using the sendKeys() method of the Actions class. In this case, we move to the element, click on it, and then send keys "Hello, Selenium!".

The build().perform() methods are used to build and execute the actions.
 */