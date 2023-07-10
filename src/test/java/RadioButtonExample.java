import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.example.com");

        // Find the radio button by its value and click it
        WebElement radioButton = driver.findElement(By.cssSelector("input[value='option1']"));
        radioButton.click();

        // Close the browser
        driver.quit();
    }
}

/*
In the radio button example, we find the radio button element
using driver.findElement(By.cssSelector("input[value='option1']"))
and then perform a click action using radioButton.click().
 */