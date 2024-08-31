import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class baseTestClass {

   public static WebDriver driver;
    @BeforeTest
    public void launchBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
    }

    @AfterTest
    public void closeBrowser()
    {
        driver.close();
    }
}
