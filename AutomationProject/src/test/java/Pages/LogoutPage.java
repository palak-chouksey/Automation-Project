
// LogoutPage.java
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
    WebDriver driver;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    By logoutButton = By.xpath("//a[normalize-space()='Logout']");
    By loginPageHeader = By.xpath("//h2[normalize-space()='Login to your account']");

    public void clickLogout() {
        driver.findElement(logoutButton).click();
    }

    public boolean isAtLoginPage() {
        return driver.findElement(loginPageHeader).isDisplayed();
    }
}
