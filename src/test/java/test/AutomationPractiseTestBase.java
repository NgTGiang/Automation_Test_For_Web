package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import core.configuration.Configuration;
import core.driver.DriverFactory;
import core.keyword.WebKeyWord;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class AutomationPractiseTestBase {
    public WebDriver driver;
    public WebKeyWord keyword;
    public Configuration config;

   
	@BeforeMethod
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        this.config = new Configuration("src/test/resources/config.properties");
        this.driver = DriverFactory.getDriver(config.getProperty("browser"));
        this.keyword = new WebKeyWord(driver);
        keyword.openUrl(config.getProperty("url"));
    }

   
	@AfterMethod
    public void tearDown(){
        this.driver.quit();
    }
}
