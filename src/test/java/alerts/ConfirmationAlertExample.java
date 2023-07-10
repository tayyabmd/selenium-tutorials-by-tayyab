package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlertExample {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website with a confirmation alert
        driver.get("https://www.example.com");

        // Click a button or perform an action that triggers the confirmation alert
        // For example, let's assume there is a button with id "myButton"
        driver.findElement(By.id("myButton")).click();

        // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Get the text of the alert
        String alertText = alert.getText();
        System.out.println("Alert Text: " + alertText);

        // Accept the confirmation alert (click OK)
        alert.accept();

        // - OR -

        // Dismiss the confirmation alert (click Cancel)
        // alert.dismiss();

        // Close the browser
        driver.quit();
    }
}

/*
In this example, we navigate to a website with a confirmation alert triggered by clicking a button or performing an action.

After switching to the alert using driver.switchTo().alert(), we can get the text of the alert using alert.getText().

To handle the confirmation, you have two options:

Accept the confirmation alert by clicking OK using alert.accept().
Dismiss the confirmation alert by clicking Cancel using alert.dismiss().
Choose the appropriate method based on the desired action.
 */

