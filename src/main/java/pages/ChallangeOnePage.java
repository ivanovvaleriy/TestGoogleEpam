package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.UserDataCollection;
import utils.UserModel;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import static utils.BrowserManager.browser;

public class ChallangeOnePage extends UserDataCollection {

    @FindBy(id = "firstname")
    public WebElement firstNameField;

    @FindBy(name = "formSubmit")
    public WebElement submitButton;

    @FindBy(className = "values-tested")
    public WebElement counterValue;

    @FindBy(xpath = "//ul[@class='values-description t10']/li")
    public WebElement checkValue;


    public ChallangeOnePage submitFormWithValue() throws InterruptedException {


        UserModel userModel = new UserModel();
        String user1 = userModel.user1();
        firstNameField.sendKeys(user1);
        submitButton.click();
        Thread.sleep(1000);
        return this;

    }

    public ChallangeOnePage submitFormWithSecondUser() throws InterruptedException {


        UserModel userModel = new UserModel();
        String user2 = userModel.user2();
        firstNameField.sendKeys(user2);
        submitButton.click();
        Thread.sleep(3000);
        return this;

    }

    public ChallangeOnePage submitFormWithThirdUser() throws InterruptedException {


        UserModel userModel = new UserModel();
        String user3 = userModel.user3();
        firstNameField.sendKeys(user3);
        submitButton.click();
        Thread.sleep(1000);
        return this;

    }
  public ChallangeOnePage submitFormWithFourUser() throws InterruptedException {


        UserModel userModel = new UserModel();
        String user4 = userModel.user4();
        firstNameField.sendKeys(user4);
        submitButton.click();
        Thread.sleep(1000);
        return this;

    }

  public ChallangeOnePage submitFormWithFiveUser() throws InterruptedException {


        UserModel userModel = new UserModel();
        String user5 = userModel.user5();
        firstNameField.sendKeys(user5);
        submitButton.click();
        Thread.sleep(1000);
        return this;

    }
public ChallangeOnePage submitFormWithSixUser() throws InterruptedException {


        UserModel userModel = new UserModel();
        String user6 = userModel.user6();
        firstNameField.sendKeys(user6);
        submitButton.click();
        Thread.sleep(1000);
        return this;

    }

public ChallangeOnePage submitFormWithSevenUser() throws InterruptedException {


        UserModel userModel = new UserModel();
        String user7 = userModel.user7();
        firstNameField.sendKeys(user7);
        submitButton.click();
        Thread.sleep(1000);
        return this;

    }

public ChallangeOnePage submitFormWithEightUser() throws InterruptedException {


        UserModel userModel = new UserModel();
        String user8 = userModel.user8();
        firstNameField.sendKeys(user8);
        submitButton.click();
        Thread.sleep(1000);
        return this;

    }
public ChallangeOnePage submitFormWithNineUser() throws InterruptedException {


        UserModel userModel = new UserModel();
        String user9 = userModel.user9();
        firstNameField.sendKeys(user9);
        submitButton.click();
        Thread.sleep(1000);
        return this;

    }

public ChallangeOnePage submitFormWithTenUser() throws InterruptedException {


        UserModel userModel = new UserModel();
        String user10 = userModel.user10();
        firstNameField.sendKeys(user10);
        submitButton.click();
        Thread.sleep(1000);
        return this;

    }


    public int getCounter() {
        return Integer.parseInt(counterValue.getText());
    }

    public String getTextValue() {
        return checkValue.getText();
    }


    List<String> collection = new ArrayList<>();

    public void Users(String s) {

        collection.add("Valerii");
        collection.add("Anatolii");


    }


}