import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClickElementExample {

    public static void main(String[] args) {

        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.google.com/");

        driver.findElement(By.xpath("//div[@class='XDyW0e']")).click();
    }
}

/*
In this example, we're finding an element by its Xpath using
driver.findElement(By.xpath("myElement")). Once we have the element,
 we can use the click() method to perform the click action.
 */