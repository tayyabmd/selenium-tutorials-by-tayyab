import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.example.com");

        // Find the dropdown element by its ID
        WebElement dropdown = driver.findElement(By.id("myDropdown"));

        // Create a Select object from the dropdown element
        Select select = new Select(dropdown);

        // Select an option by its visible text
        select.selectByVisibleText("Option 1");

        // Select an option by its value attribute
        select.selectByValue("option2");

        // Select an option by its index (0-based)
        select.selectByIndex(2);

        // Get the selected option
        WebElement selectedOption = select.getFirstSelectedOption();
        System.out.println("Selected Option: " + selectedOption.getText());

        // Close the browser
        driver.quit();
    }
}

/*
In this example, we first locate the dropdown element using driver.findElement(By.id("myDropdown")). Then, we create a Select object by passing the dropdown element to it.

We can select an option from the dropdown in three ways:

By visible text using selectByVisibleText("Option 1")
By value attribute using selectByValue("option2")
By index (0-based) using selectByIndex(2)
To retrieve the selected option, we use getFirstSelectedOption() to get the WebElement representing the selected option, and then use getText() to retrieve the text content.
*/