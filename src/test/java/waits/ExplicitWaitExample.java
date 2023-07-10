package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.example.com");

        // Create an instance of WebDriverWait with a timeout of 10 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for an element to be visible
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("myElement")));

/*
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("myElement")));


        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("myElement")));

        WebDriverWait wait = new WebDriverWait(driver, 10);
        boolean isElementInvisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("myElement")));

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("myElement")));


        WebDriverWait wait = new WebDriverWait(driver, 10);
        boolean isTextPresent = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("myElement"), "Hello, Selenium!"));


        WebDriverWait wait = new WebDriverWait(driver, 10);
        boolean isTitleMatched = wait.until(ExpectedConditions.titleIs("Page Title"));
*/

        // Perform actions on the element
        element.click();

        // Close the browser
        driver.quit();
    }
}

/*
Explicit wait is another mechanism in Selenium WebDriver that allows you to define a custom condition and wait until that condition is met before proceeding with further test execution. It provides more control and flexibility compared to implicit wait. Explicit wait is implemented using the WebDriverWait class along with expected conditions.

In this example, we first set the path to the chromedriver executable using System.setProperty().

We create a new instance of the ChromeDriver and navigate to a website.

Next, we create an instance of WebDriverWait with a timeout of 10 seconds, passing the WebDriver instance and the timeout duration.

We use the until() method of WebDriverWait along with an expected condition to wait until the element with the id "myElement" is visible using ExpectedConditions.visibilityOfElementLocated(By.id("myElement")). The explicit wait will wait for the element to be visible for a maximum of 10 seconds before throwing an exception.

Once the element is visible, we can perform actions on it, such as clicking it.


These are just a few examples of the expected conditions available in Selenium WebDriver. You can find more expected conditions in the ExpectedConditions class in the org.openqa.selenium.support.ui package.

Remember to import the necessary Selenium classes (org.openqa.selenium, org.openqa.selenium.support.ui.ExpectedConditions, and org.openqa.selenium.support.ui.WebDriverWait) and set up any additional dependencies required by your project.
 */