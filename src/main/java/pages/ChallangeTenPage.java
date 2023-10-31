package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.BrowserManager.browser;
import static utils.BrowserManager.closeBrowser;

public class ChallangeTenPage {

    @FindBy(name = "username")
    public WebElement usernameField;

    @FindBy(xpath = "/html/body/div/div[2]/form/input[1]")
    public static WebElement username2Field;

    @FindBy(name = "password")
    public WebElement passwordField;

    @FindBy(name = "password")
    public static WebElement password2Field;

    @FindBy(name = "firstname")
    public WebElement firstnameField;

    @FindBy(name = "lastname")
    public WebElement lastnameField;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[2]/th[1]")
    public WebElement indexValue;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[2]/th[2]")
    public WebElement usernameValue;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[2]/th[3]")
    public WebElement passwordValue;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[2]/th[4]")
    public WebElement FirstNameValue;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/table/tbody/tr[2]/th[5]")
    public WebElement LastNameValue;

@FindBy(xpath = "/html/body/table/tbody/tr/th/h1")
    public WebElement loginValue;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/form/input[5]")
    public WebElement submitButton;

    @FindBy(xpath = "/html/body/div/div[2]/form/button")
    public static WebElement submit2Button;


@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[1]/p[6]/a")
    public WebElement NextPagelink;


    public ChallangeTenPage sendusernameFieldValue(String value) {
        usernameField.sendKeys(value);
        return this;
    }

    public ChallangeTenPage sendpasswordFieldValue(String value) {
        passwordField.sendKeys(value);
        return this;
    }

    public ChallangeTenPage sendfirstnameFieldValue(String value) {
        firstnameField.sendKeys(value);
        return this;
    }

    public ChallangeTenPage sendSubmitlastnameFieldValue(String value) throws InterruptedException {
        lastnameField.sendKeys(value);
        submitButton.click();
        Thread.sleep(1000);
        return this;

    }



    public int getIndex() {
        return Integer.parseInt(indexValue.getText());
    }

    public String getTextValue() {
        return usernameValue.getText();
    }
    public String getPasswordValue() {
        return passwordValue.getText();
    }
    public String getFirstNameValue() {
        return FirstNameValue.getText();
    }
    public String getLastNameValue() {
        return LastNameValue.getText();

    }

    public String getLoginValue() {
        return loginValue.getText();

    }


    public ChallangeTenPage NextPagelink() throws InterruptedException {
        NextPagelink.click();
        Thread.sleep(1000);


        return this;
    }



    public static void EnterUsernameFieldValue(String value) {
        username2Field.sendKeys(value);

    }
    public static void EnterPasswordFieldValue(String value) throws InterruptedException {
        password2Field.sendKeys(value);
        submit2Button.click();
        Thread.sleep(1000);


    }



}
