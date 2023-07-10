import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class FindElementsExample {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.example.com");

        // Find a single element using findElement()
        WebElement element = driver.findElement(By.id("myElement"));
        System.out.println("Single Element Text: " + element.getText());

        // Find multiple elements using findElements()
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println("Number of Elements: " + elements.size());

        // Loop through the elements and print their texts
        for (WebElement ele : elements) {
            System.out.println("Element Text: " + ele.getText());
        }

        // Close the browser
        driver.quit();
    }
}

/*
findElement(By locator):

This method returns a single WebElement object that matches the given locator strategy.
If no element is found, it throws a NoSuchElementException.
It is suitable when you expect only one element to be present or when you want to interact with the first matching element.
Example: WebElement element = driver.findElement(By.id("myElement"));
findElements(By locator):

This method returns a list of WebElement objects that match the given locator strategy.
If no elements are found, it returns an empty list.
It is useful when you expect multiple elements to be present and you want to perform operations on each of them.
Example: List<WebElement> elements = driver.findElements(By.tagName("a"));
 */