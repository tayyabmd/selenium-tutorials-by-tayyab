package actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropByOffset {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.example.com");

        // Find the source element for drag-and-drop
        WebElement sourceElement = driver.findElement(By.id("sourceElement"));

        // Create an Actions object
        Actions actions = new Actions(driver);

        // Perform the drag-and-drop by offset action
        actions.dragAndDropBy(sourceElement, 100, 50).build().perform();

        // Close the browser
        driver.quit();
    }
}

/*
In this example, we first locate the source element on the webpage using driver.findElement(By.id("sourceElement")).

We create an Actions object by passing the WebDriver instance to it. Then, we perform the drag-and-drop by offset action using the dragAndDropBy(sourceElement, x-offset, y-offset) method of the Actions class. In this example, the source element will be dragged by an offset of 100 pixels in the x-direction and 50 pixels in the y-direction. The build().perform() methods are used to build and execute the action.
 */