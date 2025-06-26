
package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
  protected WebDriver driver;
   
   @BeforeMethod
   public void setup() {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://automationexercise.com/");
   }
  @AfterMethod
   public void close() {
	   driver.quit();
   }
}
