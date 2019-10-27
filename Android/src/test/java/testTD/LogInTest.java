package testTD;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LogInTest extends LoginPage {
    @Test
    public void testForgetPass(){
        clickForgotPass();
    }
    @Test
    public void testFillUserPass(){
        fillUsernamePass("username","12345");
    }
    @Test
    public void testLogin(){
        clickOnLogin();
    }
}