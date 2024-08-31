import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonHomePageTestCases extends baseTestClass{

    AmazonHomePage test = new AmazonHomePage();
    @BeforeTest
    public void launchBrowser()
    {

    }

    @Test
    public void validateAmazonLogo() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
    Thread.sleep(10000);
        WebElement amazonLogoWebElement=driver.findElement(By.id("nav-logo-sprites"));
    boolean displayStatus=amazonLogoWebElement.isDisplayed();
    Assert.assertTrue(displayStatus);
}

//    @Test
//    public void validateAmazonCart()
//    {
//        boolean displayStatus=test.cartImage.isDisplayed();
//        Assert.assertTrue(displayStatus);
//    }

    @AfterTest
    public void closeBrowser()
    {
        driver.close();
    }

}
