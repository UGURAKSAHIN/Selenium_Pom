package Tests;

import Base.testsBase;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoSearchPageTest extends testsBase {

    @Test
    public void testInvalidLogin(){
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("locked_out_user", "secret_sauce");
        String expectedErrorMessage = "Epic sadface: Sorry, this user has been locked out.";
        Assert.assertEquals(loginPage.getErrorMessage(), expectedErrorMessage, "Error message does not match!");
    }
}



