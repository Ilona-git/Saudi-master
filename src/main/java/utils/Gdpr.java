package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Gdpr {

    private WebDriver driver;
    public By gdprAcceptButton = By.xpath("//button[@class='acceptButton ng-star-inserted']");

    public Gdpr(WebDriver driver){
        this.driver = driver;
    }

    public void acceptGpdr(){
        driver.findElement(gdprAcceptButton).click();
    }

}
