package pages;

import org.openqa.selenium.WebDriver;

import core.keyword.WebKeyWord;

public class AutomationPractiseBasePage {
    public WebDriver driver;
    public WebKeyWord keyword;

    public AutomationPractiseBasePage(WebDriver driver){
        this.driver = driver;
        this.keyword = new WebKeyWord(driver);
    }


}
