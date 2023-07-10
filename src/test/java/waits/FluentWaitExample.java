package waits;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitExample {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.example.com");

        // Create a FluentWait instance with a timeout of 10 seconds
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);

        // Define the expected condition
        Function<WebDriver, WebElement> condition = webDriver ->
                webDriver.findElement(By.id("myElement"));

        // Wait until the condition is met
        WebElement element = wait.until(condition);

        // Perform actions on the element
        element.click();

        // Close the browser
        driver.quit();
    }
}

/*
FluentWait is a dynamic wait mechanism in Selenium WebDriver that allows you to define the maximum amount of time to wait for a certain condition to be met. It provides flexibility in configuring the polling interval and ignoring certain exceptions during the wait. Here's an example of how to use FluentWait in Selenium WebDriver with Java

In this example, we first set the path to the chromedriver executable using System.setProperty().

We create a new instance of the ChromeDriver and navigate to a website.

Next, we create a FluentWait instance by passing the WebDriver and configure it with a timeout of 10 seconds using withTimeout(Duration.ofSeconds(10)). The pollingEvery(Duration.ofMillis(500)) specifies the polling interval between retries (500 milliseconds in this case). We also use ignoring(NoSuchElementException.class) to ignore the NoSuchElementException during the wait.

We define the expected condition as a Function that takes a WebDriver as input and returns the WebElement. In this example, the condition is to find the element with the id "myElement".

Finally, we use the until() method of FluentWait to wait until the condition is met. The until() method returns the WebElement that satisfies the condition.

Once the element is found, we can perform actions on it, such as clicking it.
 */
