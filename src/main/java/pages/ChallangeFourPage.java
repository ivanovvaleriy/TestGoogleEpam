package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.UUID;



public class ChallangeFourPage {


    @FindBy(id = "firstname")
    public WebElement firstNameField;

    @FindBy(name = "formSubmit")
    public WebElement submitButton;

    @FindBy(className = "values-tested")
    public WebElement counterValue;

    @FindBy(xpath = "//ul[@class='values-description t10']/li")
    public WebElement checkValue;


    public ChallangeFourPage submitFormWithValue(Integer CharSequence) {


        firstNameField.sendKeys(new CharSequence[]{});

        submitButton.click();
        return this;
    }

    public ChallangeFourPage randomValue(Integer value) {


        Math.floor((Math.random() * 16) + 1);

        return this;
    }

    public ChallangeFourPage randomValue2(String uuid) {

        firstNameField.sendKeys(uuid);

        submitButton.click();
        return this;



        }


    public int getCounter() {
        return Integer.parseInt(counterValue.getText());
    }

    public String getTextValue() {
        return checkValue.getText();
    }

private void RandomInt () {
    Math.floor((Math.random() * 16) + 1);

}
    String uuid = UUID.randomUUID().toString();

}
