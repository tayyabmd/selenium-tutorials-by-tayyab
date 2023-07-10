package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownAndUpExample {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.example.com");

        // Find the element to perform the keydown and keyup actions
        WebElement element = driver.findElement(By.id("myElement"));

        // Create an Actions object
        Actions actions = new Actions(driver);

        // Perform the keydown action
        actions.keyDown(element, Keys.SHIFT).build().perform();

        // Perform other actions while the key is held down...

        // Perform the keyup action
        actions.keyUp(element, Keys.SHIFT).build().perform();

        // Close the browser
        driver.quit();
    }
}

/*
In this example, we first locate the element on the webpage using driver.findElement(By.id("myElement")).

We create an Actions object by passing the WebDriver instance to it. Then, we perform the keydown action using the keyDown(element, key) method of the Actions class. In this example, we simulate holding down the SHIFT key by passing Keys.SHIFT as the key.

You can perform other actions while the key is held down, such as clicking, typing, or interacting with other elements.

Finally, we perform the keyup action using the keyUp(element, key) method of the Actions class to release the key. Again, we pass Keys.SHIFT as the key in this example.
 */