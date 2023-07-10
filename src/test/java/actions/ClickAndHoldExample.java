package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldExample {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.example.com");

        // Find the element to perform the click-and-hold action
        WebElement element = driver.findElement(By.id("myElement"));

        // Create an Actions object
        Actions actions = new Actions(driver);

        // Perform the click-and-hold action on the element
        actions.clickAndHold(element).build().perform();

        // Release the mouse button
        actions.release().build().perform();

        // Close the browser
        driver.quit();
    }
}

/*
In this example, we first locate the element on the webpage using driver.findElement(By.id("myElement")). Then, we create an Actions object by passing the WebDriver instance to it.

We perform the click-and-hold action on the element using the clickAndHold(element) method of the Actions class. The build().perform() methods are used to build and execute the action.

After performing the click-and-hold action, we release the mouse button using the release() method of the Actions class, followed by build().perform() to execute the release action.
 */