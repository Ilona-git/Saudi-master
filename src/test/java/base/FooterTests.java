package base;

import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;

public class FooterTests extends BaseTests {

    @Test
    public void checkFooterText(){
        var footer  = homePage.scroolToFooter();
        assertEquals(footer.getFooterText(),footer.expectedText);
        assertEquals(footer.getFooterText2(),footer.expectedText2);
    }

    @Test
    public void ifLinksOpen(){
        var footer  = homePage.scroolToFooter();
        //getNumber of tabs and urls
        footer.checkSaudiaLink();
        footer.checkLoyaltyLink();
        footer.checkPrivacyLink();
    }
}



//    public void checkMultipleWindows() {
//
//        //switch to new window
//        getDriver().getWindowHandles().forEach(h -> getDriver().switchTo().window(h));
//
//        //save original window before you click
//        Set<String> originalWindows = getDriver().getWindowHandles();
//
//        //click on button
//        getDriver().findElement(saudia).click();
//
//        //take new windows
//        Set<String> newWindows = getDriver().getWindowHandles();
//
//        //remove from new Windows - original windows and switch
//        newWindows.removeAll(originalWindows);//subtract one set from another
//        String newHandle = newWindows.iterator().next();
//        getDriver().switchTo().window(newHandle);
//
//        //switch to this window
////    getDriver().getWindowHandles().forEach(h -> getDriver().switchTo().window(h));
//
//        getWait(10).until(ExpectedConditions.titleContains("Sign In"));
//
//        //switch back to the first window
//        getDriver().switchTo().window(getDriver().getWindowHandles().iterator().next());
//        //click on track and manage
//        WebElement manage = getDriver().findElement(By.xpath("//a[contains(text(),'Track & Manage')]"));
//        getActions()
//                .moveToElement(mail)
//                .keyDown(Keys.COMMAND)//hold button
//                .click()
//                .keyUp(Keys.COMMAND) //release
//                .perform();
//
//        //switch to new window
//        getDriver().getWindowHandles().forEach(h -> getDriver().switchTo().window(h));
//
//        //check element visible
//        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.id("track-package--input")));
//
//        //switch back to the first window
//        getDriver().switchTo().window(getDriver().getWindowHandles().iterator().next());
//    }
//
//    }

