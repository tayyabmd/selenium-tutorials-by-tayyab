import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage with a file upload form
        driver.get("https://www.example.com");

        // Find the file input element and provide the file path
        WebElement fileInput = driver.findElement(By.id("fileInput"));
        fileInput.sendKeys("path/to/file.txt");

        // Submit the file upload form if necessary
        driver.findElement(By.id("uploadButton")).click();

        // Close the browser
        driver.quit();
    }
}
/*
In this example, we follow similar steps as before to set up the ChromeDriver and navigate to a webpage with a file upload form.

We find the file input element using a suitable locator method, such as By.id(), and then use the sendKeys() method to provide the file path. In this example, we provide the path to the file.txt file.

If necessary, you can submit the file upload form by finding and clicking the appropriate submit button or triggering the submission action using JavaScript
 */