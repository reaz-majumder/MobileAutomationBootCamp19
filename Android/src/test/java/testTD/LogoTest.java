package testTD;

import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Logo;

public class LogoTest extends MobileAPI {
    Logo logo;
    @BeforeMethod
    public void setLogo(){
        logo= PageFactory.initElements(appiumDriver,Logo.class);
    }
    @Test
    public void testLogo(){
        logo.validateLogo();
    }
}