package Base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver browserLaunch(String value) {
		if (value.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (value.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if (value.equalsIgnoreCase("gecko")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	public static void geturl(String url) {
		driver.get(url);
	}
	public static void userInput(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void clickOnElement(WebElement element) {
		element.click();
	}
}
