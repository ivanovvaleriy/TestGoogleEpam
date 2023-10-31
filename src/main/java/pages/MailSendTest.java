package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utils.BrowserManager.browser;

public class MailSendTest {

    @FindBy(id = "identifierId")
    public WebElement usernameField;

    @FindBy(id = "identifierNext")
    public WebElement nextButton;

    @FindBy(id = "passwordNext")
    public WebElement passwordNextButton;

    @FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div/div")
    public static WebElement sendButtonLocator;

    @FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
    public static WebElement passwordField;

    @FindBy(xpath = "/html/body/div[23]/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[1]/table/tbody/tr[1]/td[2]/div/div/div[1]/div/div[3]/div/div/div/div/div/input")
    public static WebElement toLocator;

    @FindBy(xpath = "/html/body/div[23]/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[3]/input")
    public static WebElement subjectLocator;

    @FindBy(xpath = "/html/body/div[23]/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[1]/td/div/div[1]/div[2]/div[3]/div/table/tbody/tr/td[2]/div[2]/div")
    public static WebElement dataLocator;

    @FindBy(xpath = "/html/body/div[23]/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[1]/div/div[2]/div[1]")
    public static WebElement sendWinButton;

    @FindBy(xpath = "/html/body/div[7]/div[3]/div/div[1]/div/div[3]/div[4]/div/div/div[2]/span/span[1]")
    public static WebElement messageSended;

    @FindBy(xpath = "/html/body/div[7]/div[3]/div/div[1]/div/div[3]/div[4]/div/div/div[2]/span/span[2]/span[2]")
    public static WebElement newMessageSended;

    @FindBy(xpath = "/html/body/div[7]/div[3]/div/div[1]/div/div[3]/div[4]/div/div/div[2]/span/span[1]")
    public static WebElement textSended;

    WebDriverWait wait = new WebDriverWait(browser, 10); // Максимальное время ожидания в секундах

    public MailSendTest sendusernameFieldValue(String value) {
        usernameField.sendKeys(value);
        nextButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(passwordNextButton));
        return this;
    }


    public MailSendTest sendpasswordFieldValue(String value) {
        passwordField.sendKeys(value);
        passwordNextButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(sendButtonLocator));
        return this;
    }

    public MailSendTest toLocatorFieldValue(String value) {
        sendButtonLocator.click();
        wait.until(ExpectedConditions.elementToBeClickable(sendWinButton));
        toLocator.sendKeys(value);
        return this;
    }

    public MailSendTest subjectFieldValue(String value) {
        subjectLocator.sendKeys(value);
        return this;
    }

    public MailSendTest dataFieldValue(String value) {
        dataLocator.sendKeys(value);
        sendWinButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(messageSended));
        wait.until(ExpectedConditions.elementToBeClickable(textSended));
        return this;
    }


   // public int getIndex() {
  //      return Integer.parseInt(indexValue.getText());
  //  }

    public String getMessageSendedValue() {
        return messageSended.getText();
    }

    public String textSendedValue() {
        return textSended.getText();
    }

   // public MailSendTest NextPagelink() throws InterruptedException {
   //     NextPagelink.click();
   //     Thread.sleep(1000);
   //     return this;
   // }



}
