package testTD;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends MobileAPI {
    HomePage homePage;
    @BeforeMethod
    public void setHomePage(){
        homePage= PageFactory.initElements(appiumDriver,HomePage.class);
    }
    @Test
    public void testUIvalidation(){
        homePage.UIvalidations();
    }
    @Test
    public void testOnUpperButtons(){
        homePage.validateUpperButtons();
    }
    @Test
    public void testOnAccounts(){
        homePage.clickOnAccountt();
    }
    @Test
    public void testLogin(){
        homePage.validateButton();
    }
    @Test
    public void testSwipeDown(){
        homePage.swipeDown();
    }
}