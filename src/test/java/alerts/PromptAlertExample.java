package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertExample {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website with a prompt alert
        driver.get("https://www.example.com");

        // Click a button or perform an action that triggers the prompt alert
        // For example, let's assume there is a button with id "myButton"
        driver.findElement(By.id("myButton")).click();

        // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Get the text of the alert
        String alertText = alert.getText();
        System.out.println("Alert Text: " + alertText);

        // Enter text into the prompt alert
        String inputText = "Selenium WebDriver";
        alert.sendKeys(inputText);

        // Accept the alert (click OK)
        alert.accept();

        // Close the browser
        driver.quit();
    }
}

/*
In this example, we follow similar steps as handling a simple alert. After switching to the alert using driver.switchTo().alert(), we can get the text of the alert using alert.getText().

To enter text into the prompt alert, we can use the sendKeys() method of the Alert class. We pass the desired input text as a parameter. In this example, we enter "Selenium WebDriver" into the prompt alert.

Finally, we accept the alert (click OK) using alert.accept().
 */