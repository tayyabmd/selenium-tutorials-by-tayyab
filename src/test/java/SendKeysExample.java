import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysExample {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.google.com/");

        // Find an input element by its ID and enter text using sendKeys()
        WebElement inputElement = driver.findElement(By.xpath("class=\"a4bIc\""));
        inputElement.sendKeys("Selenium Course by Tayyab Mohammed");

        // Close the browser
        driver.quit();
    }
}

/*
In this example, we first locate an input element using
driver.findElement(By.id("myInput")). Then, we use the sendKeys()
method on the WebElement object to enter the desired text,
which in this case is "Hello, Selenium!".
 */