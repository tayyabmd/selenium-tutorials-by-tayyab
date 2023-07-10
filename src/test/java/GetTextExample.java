import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextExample {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.example.com");

        // Find an element by its ID and retrieve the text
        WebElement element = driver.findElement(By.id("myElement"));
        String text = element.getText();
        System.out.println("Element Text: " + text);

        // Close the browser
        driver.quit();
    }
}
/*
In this example, we first locate an element using driver.findElement(By.id("myElement")). Then, we use the getText() method on the WebElement object to retrieve the text content of the element.

Finally, we print the retrieved text using System.out.println("Element Text: " + text);.
 */