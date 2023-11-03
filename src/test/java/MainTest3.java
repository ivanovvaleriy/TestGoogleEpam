package test.java;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import main.java.pages.ChallangeOnePage;
import main.java.utils.BrowserManager;
import main.java.utils.Navigator;
import utils.UserDataCollection;

import static org.testng.AssertJUnit.assertEquals;

public class MainTest3 {


    @BeforeMethod (alwaysRun = true)
    public void before() {
        BrowserManager.openBrowser();
    }

    @BeforeSuite
            (groups = {"smoke"})
    public void smokeGroup(){System.setProperty("testGroup", "SMOKE CHECH");}

    @Test

    public void challangeOneTest() throws InterruptedException {

        var challangeOnePage = Navigator.openChallengeOnePage().submitFormWithValue();

        assertEquals(1, challangeOnePage.getCounter());
        assertEquals("Value is incorrect", "Average value", challangeOnePage.getTextValue());

        challangeOnePage.submitFormWithSecondUser();
        assertEquals(2, challangeOnePage.getCounter());

        challangeOnePage.submitFormWithThirdUser();
        assertEquals(3, challangeOnePage.getCounter());

        challangeOnePage.submitFormWithFourUser();
        assertEquals(4, challangeOnePage.getCounter());

        challangeOnePage.submitFormWithFiveUser();
        assertEquals(5, challangeOnePage.getCounter());

        challangeOnePage.submitFormWithSixUser();
        assertEquals(6, challangeOnePage.getCounter());

        challangeOnePage.submitFormWithSevenUser();
        assertEquals(7, challangeOnePage.getCounter());

        challangeOnePage.submitFormWithEightUser();
        assertEquals(8, challangeOnePage.getCounter());

        challangeOnePage.submitFormWithNineUser();
        assertEquals(9, challangeOnePage.getCounter());

        challangeOnePage.submitFormWithTenUser();
        assertEquals(10, challangeOnePage.getCounter());

    }

    @Test(groups = {"smoke"})
    public void mailOneSendTest() {

        var mailOneSendTest = Navigator.openGooglePage().sendusernameFieldValue("epamwebdriver1@gmail.com")
                .sendpasswordFieldValue("32u62388").toLocatorFieldValue("epamwebdriver2@gmail.com")
                .subjectFieldValue("Test").dataFieldValue("Test Data");

        assertEquals("Send mes is incorrect", "Отправка…", mailOneSendTest.getMessageSendedValue());
       // assertEquals("Password is incorrect", "Сообщение отправлено.", challangeTenPage.textSendedValue());

    }

    @AfterMethod (alwaysRun = true)
    public void closeBrowser() {
        BrowserManager.closeBrowser();
    }
}
