
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {
	WebDriver driver;
	public CreateAccountPage(WebDriver driver) {
		this.driver=driver;
	}
	By mrsbtn=By.xpath("//input[@id='id_gender2']");
By password=By.xpath("//input[@id='password']");
By dayDropdown=By.xpath("//select[@id='days']");
By monthDropdown=By.xpath("//select[@id='months']");
By yearDropdown= By.xpath("//select[@id='years']");
By firstname=By.xpath("//input[@id='first_name']");
By lastName=By.xpath("//input[@id='last_name']");
By address=By.xpath("//input[@id='address1']");
By countryDropdown=By.xpath("//select[@id='country']");
By state=By.xpath("//input[@id='state']");
By city=By.xpath("//input[@id='city']");
By zipcode= By.xpath("//input[@id='zipcode']");
By mobile= By.xpath("//input[@id='mobile_number']");
By createbtn= By.xpath("//button[@data-qa='create-account']"); 

public void fillAccountInfo(String pass) {
	driver.findElement(mrsbtn).click();
    driver.findElement(password).sendKeys(pass);

    new Select(driver.findElement(dayDropdown)).selectByValue("1");
    new Select(driver.findElement(monthDropdown)).selectByValue("7");
    new Select(driver.findElement(yearDropdown)).selectByValue("1993");
	
}

public void fillAddressInfo() {
    driver.findElement(firstname).sendKeys("Eliza");
    driver.findElement(lastName).sendKeys("Test");
    driver.findElement(address).sendKeys("55 Test Street");
    new Select(driver.findElement(countryDropdown)).selectByVisibleText("United States");
    driver.findElement(state).sendKeys("NY");
    driver.findElement(city).sendKeys("New York");
    driver.findElement(zipcode).sendKeys("10001");
    driver.findElement(mobile).sendKeys("1234567890");
}

public void clickCreateAccount() {
    driver.findElement(createbtn).click();
}
}
