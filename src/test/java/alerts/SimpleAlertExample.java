package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertExample {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website with a simple alert
        driver.get("https://www.example.com");

        // Click a button or perform an action that triggers the alert
        // For example, let's assume there is a button with id "myButton"
        driver.findElement(By.id("myButton")).click();

        // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Get the text of the alert
        String alertText = alert.getText();
        System.out.println("Alert Text: " + alertText);

        // Accept the alert (click OK)
        alert.accept();

        // Close the browser
        driver.quit();
    }
}

/*
In this example, we first set the path to the chromedriver executable using System.setProperty().

We create a new instance of the ChromeDriver and navigate to a website that has a simple alert (e.g., triggered by clicking a button).

We locate and perform the action that triggers the alert. In this example, we assume there is a button with the id "myButton", and we click on it.

We switch to the alert using driver.switchTo().alert(), which returns an Alert object.

We can then get the text of the alert using alert.getText(), and perform actions such as accepting the alert using alert.accept() to click OK.
 */
