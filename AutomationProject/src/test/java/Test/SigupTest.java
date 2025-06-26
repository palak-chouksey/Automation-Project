
package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.CreateAccountPage;
import Pages.HomePage;
import Pages.SignUpPage;

public class SigupTest extends BaseTest {
   @Test
   public void testsignup() throws InterruptedException {
	   HomePage hp=new HomePage(driver);
	   hp.signuploginclick();
	   
	   SignUpPage Sp=new SignUpPage(driver);
	   String uniqueEmail = "Amy" + (int)(Math.random() * 10000) + "@gmail.com";
	   Sp.Enternameandemail("Amy", uniqueEmail);
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
	   
	   CreateAccountPage cp = new CreateAccountPage(driver);
	   cp.fillAccountInfo("Amy@123");
	   cp.fillAddressInfo();
	   cp.clickCreateAccount();
	   
	   // After clicking create account, wait for confirmation message
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='Account Created!']")));

       // Assert account creation message is displayed
       boolean isAccountCreated = driver.findElement(By.xpath("//b[text()='Account Created!']")).isDisplayed();
       Assert.assertTrue(isAccountCreated, "Account Created message not displayed");

       // Continue after account created
       driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
	    
   }
   
}
