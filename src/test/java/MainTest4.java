package test.java;

import org.testng.annotations.*;
import pages.ChallangeOnePage;
import pages.ChallangeTenPage;
import main.java.utils.BrowserManager;
import main.java.utils.Navigator;

import javax.annotation.CheckReturnValue;

import static org.testng.AssertJUnit.assertEquals;

public class MainTest4 {


    @BeforeMethod
    public void before() {
        BrowserManager.openBrowser();
    }

    @Test


    public void challangeTenPage() throws InterruptedException {

        var challangeTenPage = Navigator.openChallengeTenPage().sendusernameFieldValue("Valera55")
                .sendpasswordFieldValue("123456").sendfirstnameFieldValue("Valerii")
                .sendSubmitlastnameFieldValue("Ivanov").NextPagelink();


        BrowserManager.switchWindowHandle();
        ChallangeTenPage.EnterUsernameFieldValue("Valera55");
        ChallangeTenPage.EnterPasswordFieldValue("123456");
        assertEquals("Login fail", "Wellcome To Your Personal Road Assitance",
                challangeTenPage.getLoginValue());

        BrowserManager.switchWindowFirst();



        assertEquals("Index is incorrect", 1, challangeTenPage.getIndex());
        assertEquals("Username is incorrect", "Valera55", challangeTenPage.getTextValue());
        assertEquals("Password is incorrect", "123456", challangeTenPage.getPasswordValue());
        assertEquals("First Name is incorrect", "Valerii", challangeTenPage.getFirstNameValue());
        assertEquals("Last Name is incorrect", "Ivanov", challangeTenPage.getLastNameValue());


}


    @AfterMethod
    public void closeBrowser() {
        BrowserManager.closeBrowser();
    }
}

