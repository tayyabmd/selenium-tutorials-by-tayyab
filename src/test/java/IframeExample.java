import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage containing an iframe
        driver.get("https://www.example.com");

        // Switch to the iframe by its index or name
        driver.switchTo().frame(0); // Using index: 0-based index of the iframe
        // or
        // driver.switchTo().frame("iframeName"); // Using name attribute of the iframe

        // Find and interact with elements within the iframe
        WebElement element = driver.findElement(By.id("myElement"));
        element.click();

        // Switch back to the main content
        driver.switchTo().defaultContent();

        // Find and interact with elements in the main content
        WebElement mainElement = driver.findElement(By.id("mainElement"));
        mainElement.click();

        // Close the browser
        driver.quit();
    }
}

/*
An iframe (Inline Frame) is an HTML element that allows you to embed another HTML document within the current document. When working with iframes in Selenium WebDriver with Java, you need to switch the focus to the iframe before interacting with its contents.

In this example, we first set the path to the chromedriver executable using System.setProperty().

We create a new instance of the ChromeDriver and navigate to a webpage that contains an iframe.

To switch to the iframe, you can use either the switchTo().frame(int index) method by providing the 0-based index of the iframe, or you can use switchTo().frame(String nameOrId) by providing the name or id attribute of the iframe.

Once inside the iframe, you can find and interact with elements within it, such as finding an element by its id using driver.findElement(By.id("myElement")).

To switch back to the main content, you can use switchTo().defaultContent().

After switching back to the main content, you can find and interact with elements in the main content using regular WebDriver commands.
 */

