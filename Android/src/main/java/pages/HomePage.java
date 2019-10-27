package pages;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;
import reporting.TestLogger;

public class HomePage extends MobileAPI {
    @FindBy (xpath = "*//android.widget.Button[@text='ACCOUNTS']")
    WebElement accounts;
    @FindBy (xpath = "*//android.widget.Button[@text='TRANSFER']")
    WebElement transfer;
    @FindBy (xpath = "*//android.widget.Button[@text='DEPOSIT']")
    WebElement deposit;
    @FindBy (xpath = "*//android.widget.Button[@text='SEND MONEY']")
    WebElement sendMoney;
    public void validateUpperButtons(){
        sleepFor(10);
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals(accounts.isDisplayed(), true,"accounts isn't displayed");
        softAssert.assertEquals(transfer.isDisplayed(), true,"transfer isn't displayed");
        softAssert.assertEquals(deposit.isDisplayed(), true,"deposit isn't displayed");
        softAssert.assertEquals(sendMoney.isDisplayed(), true,"send money isn't displayed");
        softAssert.assertAll();
    }
    public void UIvalidations() {
        sleepFor(10);
        if (accounts.isDisplayed()) {
            System.out.println(accounts.getText() + " : is displayed");
        }
        if (transfer.isDisplayed()) {
            System.out.println(transfer.getText() + " : is displayed");
        }
        if (deposit.isDisplayed()) {
            System.out.println(deposit.getText() + " : is displayed");
        }
        if (sendMoney.isDisplayed()) {
            System.out.println(sendMoney.getText() + " : is displayed");
        }
    }
    public void clickOnAccountt() {
        sleepFor(10);
        String account = accounts.getText();
        accounts.click();
        TestLogger.log(" message ");
        System.out.println(account + ": has been clicked");
    }

    public void validateButton() {
        sleepFor(3);
        String account = accounts.getText();
        accounts.click();
        System.out.println(account + ": has been clicked");
        sleepFor(4);
    }
    public void swipeDown() {
        sleepFor(5);
        MobileAPI.functionSwipe("up", 200, 200);
    }
}