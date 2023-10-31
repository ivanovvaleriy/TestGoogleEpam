package utils;

import pages.ChallangeOnePage;
import pages.ChallangeTenPage;
import pages.MailSendTest;

import static org.openqa.selenium.support.PageFactory.initElements;
import static utils.BrowserManager.browser;

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
}
