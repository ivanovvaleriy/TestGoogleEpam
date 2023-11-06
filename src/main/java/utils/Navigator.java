package main.java.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import main.java.pages.ChallangeOnePage;
import main.java.pages.ChallangeTenPage;
import main.java.pages.MailSendTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.openqa.selenium.support.PageFactory.initElements;
import static main.java.utils.BrowserManager.browser;

public class Navigator {
    public static ChallangeOnePage openChallengeOnePage() {
        browser.navigate().to("http://testingchallenges.thetestingmap.org");
        return initElements(browser, ChallangeOnePage.class);
    }


    public static ChallangeTenPage openChallengeTenPage() {
        browser.navigate().to("http://testingchallenges.thetestingmap.org/challenge10.php");
        return initElements(browser, ChallangeTenPage.class);

    }

    public static MailSendTest openGooglePage() {
        browser.navigate().to("https://accounts.google.com/AccountChooser/identifier?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser&theme=glif");
        return initElements(browser, MailSendTest.class);

    }
    private static WebDriver driver;
    public static WebDriver getDriver(){

                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();



        return driver;
    }
    public static void closeDriver(){
        driver.quit();
        driver = null;
    }
}

