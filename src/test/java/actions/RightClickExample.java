package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com");

        // Find the element to perform the context click action
        WebElement element = driver.findElement(By.id("myElement"));

        // Create an Actions object
        Actions actions = new Actions(driver);

        // Perform the context click action on the element
        actions.contextClick(element).build().perform();

        // Close the browser
        driver.quit();
    }
}

/*
In this example, we first locate the element on the webpage using driver.findElement(By.id("myElement")). Then, we create an Actions object by passing the WebDriver instance to it.

We perform the right-click (context click) action on the element using the contextClick(element) method of the Actions class. The build().perform() methods are used to build and execute the action.
 */
