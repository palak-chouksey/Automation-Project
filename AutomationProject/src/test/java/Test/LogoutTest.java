
// LogoutTest.java
package Test;

import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.LogoutPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

    @Test
    public void testLogoutFunctionality() {
        // Step 1: Login
        HomePage home = new HomePage(driver);
        home.signuploginclick();

        LoginPage login = new LoginPage(driver);
        login.userlogin("Amy.test@gmail.com", "Amy@123");

        // Step 2: Logout
        LogoutPage logout = new LogoutPage(driver);
        logout.clickLogout();

        // Step 3: Verify
        Assert.assertTrue(logout.isAtLoginPage(), "❌ Logout failed or login page not displayed!");
    }
}
