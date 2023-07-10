import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadExample {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage with a file download link
        driver.get("https://www.example.com");

        // Find the download link and click it
        driver.findElement(By.linkText("Download File")).click();

        // Close the browser
        driver.quit();
    }
}
/*
In this example, we first set the path to the chromedriver executable using System.setProperty().

We create a new instance of the ChromeDriver and navigate to a webpage that contains a file download link.

We find the download link using a suitable locator method, such as By.linkText(), and then click on it using the click() method.

The browser's default behavior will handle the file download process.
 */