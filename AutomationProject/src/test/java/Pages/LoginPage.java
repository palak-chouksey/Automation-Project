
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	By loginemail = By.xpath("//input[@data-qa='login-email']");
	By loginpassword = By.xpath("//input[@placeholder='Password']");
	By loginbtn = By.xpath("//button[normalize-space()='Login']");
	
	public void userlogin(String email, String pass) {
		driver.findElement(loginemail).sendKeys(email);
		driver.findElement(loginpassword).sendKeys(pass);
		driver.findElement(loginbtn).click();
	}

}

