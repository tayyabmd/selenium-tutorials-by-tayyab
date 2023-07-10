import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.example.com");

        // Find the checkbox by its ID and toggle its state
        WebElement checkbox = driver.findElement(By.id("myCheckbox"));
        if (!checkbox.isSelected()) {
            checkbox.click();
        }

        // Close the browser
        driver.quit();
    }
}

/*
In the checkbox example, we find the checkbox element using
driver.findElement(By.id("myCheckbox")) and check its state using
isSelected(). If it's not selected, we toggle its state by clicking
on it using checkbox.click().
 */