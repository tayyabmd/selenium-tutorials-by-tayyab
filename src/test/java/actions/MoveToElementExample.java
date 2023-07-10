package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementExample {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.example.com");

        // Find the element to move the mouse to
        WebElement element = driver.findElement(By.id("myElement"));

        // Create an Actions object
        Actions actions = new Actions(driver);

        // Move the mouse to the element
        actions.moveToElement(element).build().perform();

        // Close the browser
        driver.quit();
    }
}

/*
In this example, we first locate the element on the webpage using driver.findElement(By.id("myElement")).

We create an Actions object by passing the WebDriver instance to it. Then, we use the moveToElement(element) method of the Actions class to move the mouse cursor to the specified element.

The build().perform() methods are used to build and execute the action.
 */