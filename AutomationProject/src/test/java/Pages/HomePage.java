package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
 WebDriver driver;
 
 public HomePage(WebDriver driver) {
	 this.driver=driver;
 }
 
 By SignupLoginBTn=By.xpath("//a[normalize-space()='Signup / Login']");
 By productsLink = By.xpath("//a[contains(text(),'Products')]");
 
 public void signuploginclick() {
	 driver.findElement(SignupLoginBTn).click();
 }
 
 public void goToProductsPage() {
     driver.findElement(productsLink).click();
 }
}