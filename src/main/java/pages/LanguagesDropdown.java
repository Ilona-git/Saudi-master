package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class LanguagesDropdown {

    private WebDriver driver;
    private By dropdown = By.xpath("//div[@class='ng-tns-c15-6 linkWrapper ng-star-inserted'] ");
    private By dropdownElement = By.cssSelector(".language .linkWrapper");
    private By spinner  = By.cssSelector(".loadingContainer .ng-star-inserted");

    public LanguagesDropdown(WebDriver driver){
        this.driver = driver;
    }


    public ArrayList<String> getLanguagesList(){
        List<WebElement> items = driver.findElements(dropdown);
        ArrayList<String> listOfLanguages = new ArrayList<>();
        for(WebElement item:items){
            listOfLanguages.add(item.getText());
        }
        return listOfLanguages;
    }

    public void chooseLanguageFromDropdown(String desiredLanguage) {

        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(dropdownElement));
        List<WebElement> languages = driver.findElements(dropdownElement);
        for (int i = 0; i< languages.size(); i++) {
            languages = driver.findElements(dropdownElement);
            WebElement we = languages.get(i);
            if (we.getText().equals(desiredLanguage)) {
                we.click();
                new WebDriverWait(driver, 20).until(ExpectedConditions.invisibilityOfElementLocated(spinner));
                break;
            }
        }
    }
}










