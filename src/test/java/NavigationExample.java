import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationExample {

    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.google.com/");
    }
}

/*
driver.get(url):

This method is used to directly navigate to a specified URL.
It waits for the page to load completely before proceeding with the next commands.
It replaces the current page in the browser's history with the new URL.
Example: driver.get("https://www.example.com");
driver.navigate().to(url):

This method is also used to navigate to a specified URL.
It waits for the page to load completely before proceeding with the next commands.
It adds the new URL to the browser's history, creating a new entry.
It allows you to navigate forward and backward through the browser's history using driver.navigate().forward() and driver.navigate().back().
Example: driver.navigate().to("https://www.example.com");
 */