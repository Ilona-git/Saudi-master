package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ContentNavigationPage {

    private WebDriver driver;
    private By contentLinks = By.xpath("//a[@class='nav-category nav-linkAnchor']");
    private By contentContainer = By.xpath("//div[@class=\"navigationMenu noNavigation openedNav\"]");

    public ContentNavigationPage(WebDriver driver){
        this.driver = driver;
        System.out.println("Content Dropdown Created");
    }

    public ArrayList<String> getContentLinksText(){
        List<WebElement> contentLinkElements = driver.findElements(contentLinks);
        System.out.println(contentLinkElements.size());
        ArrayList<String> contentLinkNames = new ArrayList<>();
        for(WebElement el : contentLinkElements) {
            contentLinkNames.add(el.getText());
        }
        return contentLinkNames;
    }

    public Games clickGamesLink() {
        System.out.println("Inside clickgameslink");
        clickLink("//a[@class='nav-linkAnchor ng-star-inserted' and contains(text(), 'Games')]");
        System.out.println("Games link found");
        return new Games(driver);
    }

    //method to click any link from the menu
    private void clickLink(String link){
        //new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(contentContainer));
        By linkXpath = By.xpath(link);
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(linkXpath)).click();
        //driver.findElement(linkXpath).click();
    }


}
