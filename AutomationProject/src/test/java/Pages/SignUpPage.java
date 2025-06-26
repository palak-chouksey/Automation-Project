
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
	WebDriver driver;
	public SignUpPage(WebDriver driver) {
		this.driver=driver;
	}
	
 By inputname=By.xpath("//input[@placeholder='Name']");
 By inputemail=By.xpath("//input[@data-qa='signup-email']");
 By signBtn=By.xpath("//button[normalize-space()='Signup']");
	
	public void Enternameandemail(String name, String email) {
		driver.findElement(inputname).sendKeys(name);
		driver.findElement(inputemail).sendKeys(email);
		driver.findElement(signBtn).click();
	}
}
