package core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public static WebDriver getDriver(String browser) {
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			option.addArguments("start-maximized");
			option.addArguments("--incognito");
			return new ChromeDriver(option);
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
			
		default:
			return new ChromeDriver();
		}
	}
}
