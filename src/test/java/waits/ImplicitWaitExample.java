package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class ImplicitWaitExample {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Set the implicit wait time to 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Navigate to a website
        driver.get("https://www.example.com");

        // Find an element using implicit wait
        WebElement element = driver.findElement(By.id("myElement"));

        // Perform actions on the element
        element.click();

        // Close the browser
        driver.quit();
    }
}
/*
Implicit wait is a mechanism in Selenium WebDriver that instructs the WebDriver to wait for a certain amount of time before throwing an exception if an element is not immediately available. It is applied globally to the WebDriver instance and is set using the implicitlyWait() method. Here's an example of how to use implicit wait in Selenium WebDriver with Java

In this example, we first set the path to the chromedriver executable using System.setProperty().

We create a new instance of the ChromeDriver and then set the implicit wait time to 10 seconds using driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS). This means that WebDriver will wait for up to 10 seconds for an element to be available before throwing an exception.

After setting the implicit wait, we navigate to a website and find an element using driver.findElement(By.id("myElement")). The WebDriver will wait for up to 10 seconds for the element to be found before throwing an exception.

Once the element is found, we can perform actions on it, such as clicking it.
 */