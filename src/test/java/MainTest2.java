package test.java;

import main.java.utils.Navigator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.List;
import java.util.Random;

import static org.testng.AssertJUnit.assertEquals;

public class MainTest2 {

    @FindBy(xpath = "//*[contains(@class,'y2')]")
    List<WebElement> mails;
////*[contains(@class,'xY a4W')]
////*[contains(@class,'zA zE')]
    private WebDriver browser;
    protected WebDriver driver;

    @BeforeMethod (alwaysRun = true)
    public void before() {
       // System.setProperty("webdriver.chrome.driver", "I:/Projects/chromedriver.exe");
       // browser = new ChromeDriver();
        driver = Navigator.getDriver();
    }
    @BeforeTest (alwaysRun = true)
    public void beforeTest() {

    }

    @BeforeSuite
            (groups = {"smoke"})
    public void smokeGroup(){System.setProperty("testGroup", "SMOKE CHECH");}

    @Test(groups = {"smoke"})


    public void challangeOneTest() throws InterruptedException {
        Random random = new Random();
        int randomNumber = random.nextInt(10000);
        driver.navigate().to("https://accounts.google.com/AccountChooser/identifier?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser&theme=glif");

        browser.navigate().to("https://accounts.google.com/AccountChooser/identifier?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser&theme=glif");
        browser.findElement(By.id("identifierId")).sendKeys("epamwebdriver1@gmail.com");
        browser.findElement(By.id("identifierNext")).click();
        WebDriverWait wait = new WebDriverWait(browser, 10); // Максимальное время ожидания в секундах
        By nextButtonLocator = By.id("passwordNext");
        wait.until(ExpectedConditions.elementToBeClickable(nextButtonLocator));

        browser.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("32u62388");
        browser.findElement(By.id("passwordNext")).click();
        By sendButtonLocator = By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div/div");
        wait.until(ExpectedConditions.elementToBeClickable(sendButtonLocator));
        browser.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div/div")).click();
        String createMessageTitle = browser.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div/div")).getText();
        By toLocator = By.xpath("/html/body/div[23]/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[1]/div/div[2]/div[1]");
        wait.until(ExpectedConditions.elementToBeClickable(toLocator));
        browser.findElement(By.xpath("/html/body/div[23]/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[1]/table/tbody/tr[1]/td[2]/div/div/div[1]/div/div[3]/div/div/div/div/div/input")).sendKeys("epamwebdriver2@gmail.com");
        browser.findElement(By.xpath("/html/body/div[23]/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[3]/input")).sendKeys("Test " + randomNumber);
        browser.findElement(By.xpath("/html/body/div[23]/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[1]/td/div/div[1]/div[2]/div[3]/div/table/tbody/tr/td[2]/div[2]/div")).sendKeys("Test " + randomNumber + " Test Data");
        browser.findElement(By.xpath("/html/body/div[23]/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[1]/div/div[2]/div[1]")).click();
        By messageSendWindow = By.xpath("/html/body/div[7]/div[3]/div/div[1]/div/div[3]/div[4]/div/div/div[2]/span/span[1]");
        wait.until(ExpectedConditions.presenceOfElementLocated(messageSendWindow));
          String text = browser.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div/div[3]/div[4]/div/div/div[2]/span/span[1]")).getText();
          assertEquals("Value is incorrect", "Отправка…", text);
        By newMsgSendWindow = By.xpath("/html/body/div[7]/div[3]/div/div[1]/div/div[3]/div[4]/div/div/div[2]/span/span[2]/span[2]");
        wait.until(ExpectedConditions.presenceOfElementLocated(newMsgSendWindow));
        String textSended = browser.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div/div[3]/div[4]/div/div/div[2]/span/span[1]")).getText();
        assertEquals("Value is incorrect", "Сообщение отправлено.", textSended);





        // String counter = browser.findElement(By.className("Xb9hP")).getText();
        // String text = browser.findElement(By.className("whsOnd zHQkBf")).getText();
        //  System.out.println(text);
        //   assertEquals("1", counter);
        //   assertEquals("Value is incorrect", "Average value", text);

    }

    @Test

    public void challangeOneTest2() {

        browser.navigate().to("https://accounts.google.com/AccountChooser/identifier?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser&theme=glif");
        browser.findElement(By.id("identifierId")).sendKeys("epamwebdriver2@gmail.com");
        browser.findElement(By.id("identifierNext")).click();
        WebDriverWait wait = new WebDriverWait(browser, 10); // Максимальное время ожидания в секундах
        By nextButtonLocator = By.id("passwordNext");
        wait.until(ExpectedConditions.elementToBeClickable(nextButtonLocator));

        browser.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("32u62388");
        browser.findElement(By.id("passwordNext")).click();
        By sendButtonLocator = By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div/div");
        wait.until(ExpectedConditions.elementToBeClickable(sendButtonLocator));
        String messageStatus = browser.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div/div[9]/div/div[1]/div[2]/div/table/tbody/tr[1]/td[4]/div[2]")).getText();
        assertEquals("Value is incorrect", "Новое", messageStatus);
        String firstMessage = browser.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div/div[9]/div/div[1]/div[2]/div/table/tbody/tr[1]/td[5]/div/div")).getText();
        assertEquals("Value is incorrect", "Test 2976\nTest 2976 Test Data", firstMessage);
        String messageFrom = browser.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div/div[9]/div/div[1]/div[2]/div/table/tbody/tr[1]/td[4]/div[2]/span")).getText();

        System.out.println(messageFrom);
        System.out.println(messageStatus);
        System.out.println(firstMessage);




    }

    @AfterMethod (alwaysRun = true)
    public void closeBrowser() {
     //   browser.quit()
          Navigator.closeDriver();
    }
}