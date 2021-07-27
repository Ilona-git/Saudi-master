package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Header {

    private WebDriver driver;
    private By BeyondLogo;
    private By hamburgerMenuButton = By.xpath("//div[@class='hamburgerMenu ng-tns-c2-0 ng-star-inserted']");;
    private By lang;
    private By searchGlass;

    public Header(WebDriver driver){
        this.driver = driver;
    }

    public void clickLogoLink(){}



}
