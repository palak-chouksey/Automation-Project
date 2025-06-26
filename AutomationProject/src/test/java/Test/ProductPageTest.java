package Test;

import Base.BaseTest;
import Pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPageTest extends BaseTest {

    @Test
    public void testAddTwoProductsToCart() {
        ProductPage productPage = new ProductPage(driver);

        productPage.goToProductsPage();
        productPage.addProductToCart("Blue Top");
        productPage.addProductToCart("Men Tshirt");
        productPage.goToCart();

        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains("Blue Top"), "❌ Blue Top not found in cart!");
        Assert.assertTrue(pageSource.contains("Men Tshirt"), "❌ Men Tshirt not found in cart!");
    }
}