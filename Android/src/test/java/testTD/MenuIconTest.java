package testTD;

import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MenuIcon;

public class MenuIconTest extends MobileAPI {
    MenuIcon menuIcon;
    @BeforeMethod
    public void setMenuIcon(){
        menuIcon= PageFactory.initElements(appiumDriver,MenuIcon.class);
    }
    @Test
    public void testMenuIcon(){
        menuIcon.validateMenuButton();
    }
}