package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.example.com");

        // Find the source and target elements for drag-and-drop
        WebElement sourceElement = driver.findElement(By.id("sourceElement"));
        WebElement targetElement = driver.findElement(By.id("targetElement"));

        // Create an Actions object
        Actions actions = new Actions(driver);

        // Perform the drag-and-drop action
        actions.dragAndDrop(sourceElement, targetElement).build().perform();

        // Close the browser
        driver.quit();
    }
}

/*
In this example, we first locate the source and target elements on the webpage using driver.findElement(By.id("sourceElement")) and driver.findElement(By.id("targetElement")), respectively.

We create an Actions object by passing the WebDriver instance to it. Then, we perform the drag-and-drop action using the dragAndDrop(sourceElement, targetElement) method of the Actions class. The build().perform() methods are used to build and execute the action.
 */