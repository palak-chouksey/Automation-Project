
package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginTest extends BaseTest {

	 @Test
	    public void testLogin() {
	        HomePage home = new HomePage(driver);
	        home.signuploginclick();

	        LoginPage lp = new LoginPage(driver);
	        lp.userlogin("Amy.test@gmail.com", "Amy@123");
	        
	        String loggedInText = driver.findElement(By.xpath("//a[contains(text(),'Logged in as')]")).getText();
	        Assert.assertTrue(loggedInText.contains("Amy"), "Login failed or user name not displayed!");

	       
	}
}

