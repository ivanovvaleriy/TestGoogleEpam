import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SecondTest {

    @Test

    public void challangeOneTest() {
        System.setProperty("webdriver.chrome.driver", "L:/Projects/chromedriver.exe");
        var browser = new ChromeDriver();
        browser.navigate().to("http://testingchallenges.thetestingmap.org");
        browser.findElementById("firstname").sendKeys("Pavlo");
        browser.findElementByName("formSubmit").click();
        String counter = browser.findElementByClassName("values-tested").getText();
        String text = browser.findElementByXPath("//ul[@class='values-description t10']/li").getText();

        assertEquals("1", counter);
        assertEquals("Average value", text);

    }
}
