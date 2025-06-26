
package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProductPage {
    WebDriver driver;
    WebDriverWait wait;


    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void goToProductsPage() {
        WebElement productsLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/products']")));
        productsLink.click();
    }

    public void addProductToCart(String productName) {
        By addToCartBtn = By.xpath("//p[text()='" + productName + "']/following-sibling::a[text()='Add to cart']");

        WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(addToCartBtn));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
        wait.until(ExpectedConditions.elementToBeClickable(button));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cartModal")));

        By continueShoppingBtn = By.xpath("//button[text()='Continue Shopping']");
        wait.until(ExpectedConditions.elementToBeClickable(continueShoppingBtn)).click();
    }

    public void goToCart() {
        WebElement cartLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/view_cart']")));
        cartLink.click();
    }
}
