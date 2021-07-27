package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.Gdpr;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class BaseTests {

    private WebDriver driver;
    public WebDriverWait wait;
    protected HomePage homePage;
    public static String homePageUrl = "http://sva-microsite-staging.globaleagle.io/";

    @BeforeClass
    public void setUp() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get(homePageUrl);
        driver.manage().window().maximize();
        new Gdpr(driver).acceptGpdr();
        homePage = new HomePage(driver);
    }


    public  WebDriver getDriver() {
        return driver;
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}


