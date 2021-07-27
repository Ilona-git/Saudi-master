package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;


public class Footer {
    private WebDriver driver;
    private By saudiLink = By.xpath("//body/app-root[1]/footer[1]/div[1]/div[3]/span[1]/a[1]");
    private By privacyLink = By.xpath("//body/app-root[1]/footer[1]/div[1]/div[3]/span[2]/a[1]");
    private By loyaltyProgramLink = By.xpath("//body/app-root[1]/footer[1]/div[1]/div[3]/span[3]/a[1]");
    // private By loyaltyProgramLink = ByPartialLinkText ("Loyalty Progr");


    public String expectedText2 = "© 2021 Saudia Airlines";
    public String expectedText = "Some of the content featured may not be available on your flight";


    public Footer(WebDriver driver) {
        this.driver = driver;
    }

    public String getFooterText() {
        return driver.findElement(By.xpath("//p[contains(text(),'Some of the content featured may not be available ')]")).getText();
    }
    public String getFooterText2() {
        return driver.findElement(By.xpath("//p[contains(text(),'© 2021 Saudia Airlines')]")).getText();
    }



    public void checkSaudiaLink() {
        driver.findElement(saudiLink).click();
//get window handlers as list
        List<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//switch to new tab
        String title =  driver.switchTo().window(tabs.get(1)).getCurrentUrl();
        System.out.println("No. of tabs: " + tabs.size() + "new Tab title: " + title);
//then close tab and get back
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }


    public void checkLoyaltyLink() {

        driver.findElement(loyaltyProgramLink).click();
//get window handlers as list
        List<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//switch to new tab
        String title =  driver.switchTo().window(tabs.get(1)).getCurrentUrl();
        System.out.println("No. of tabs: " + tabs.size() + "new Tab title: " + title);
//then close tab and get back
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }


    public void checkPrivacyLink() {

        driver.findElement(privacyLink).click();
//get window handlers as list
        List<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//switch to new tab
        String title =  driver.switchTo().window(tabs.get(1)).getCurrentUrl();
        System.out.println("No. of tabs: " + tabs.size() + "new Tab title: " + title);
//then close tab and get back
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }



}
