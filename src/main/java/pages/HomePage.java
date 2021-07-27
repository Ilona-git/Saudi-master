package pages;
//With no duplication of code on the pageObjects, and a logical hierarchy of pages -> widget -> html elements.

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    private By languageButton = By.id("languageButton");
    private By spinner = By.cssSelector(".loadingContainer .ng-star-inserted");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public String getCurrentLanguage(){
        new WebDriverWait(driver, 20).until(ExpectedConditions.invisibilityOfElementLocated(spinner));
        return driver.findElement(languageButton).getText();
    }

    public LanguagesDropdown openLanguageDropdown(){
        driver.findElement(languageButton).click();
        return new LanguagesDropdown(driver);
    }

    public void closeLanguageDropdown(){
        //change - check if it is opened - then if true - click
        driver.findElement(languageButton).click();
    }

    public  Footer scroolToFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("http://sva-microsite-staging.globaleagle.io/");
        //This will scroll the web page till end.
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        return new Footer(driver);
    }


//check html lang !!!!!!!!!!!!!!!1
    //pull languages from other resource. to save it in local




//return a dropdown menu with the languages
    /*public LanguagesDropdown clickLanguageButton(){
        try {
            driver.findElement(changeLanguageButton).click();
            return new LanguagesDropdown(driver);
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex){
            driver.findElement(changeLanguageButton).click();
            return new LanguagesDropdown(driver);
        }
    }*/


    //return a dropdown with the links from the Hamburger menu
    //public ContentNavigationPage clickHamburgerMenuButton() {
        //try {
            //driver.findElement(hamburgerMenuButton).click();
            //return new ContentNavigationPage(driver);
        //} catch (org.openqa.selenium.StaleElementReferenceException ex) {
           //driver.findElement(hamburgerMenuButton).click();
           //return new ContentNavigationPage(driver);
        //}
    //}


/*    Use Actions class function moveToElement to perform Mouse Over then call click function to click element using its Locator
            Example
           Actions actions = new Actions(driver);
    WebElement mainMenu = driver.findElement(By.linkText("menulink")); actions.moveToElement(mainMenu).build().perform();
    WebElement subMenu = driver.findElement(By.cssSelector("subLinklocator")); subMenu.click();
    Change locate style in Find Element according to Locator type*/

    //public void checkIfPageIsLoaded(){



}
