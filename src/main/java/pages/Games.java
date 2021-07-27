package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Games {

    private WebDriver driver;

    public Games(WebDriver driver){
        this.driver = driver;
    }

    public String getGamesPageUrl(){

        return driver.getCurrentUrl();
    }

}
