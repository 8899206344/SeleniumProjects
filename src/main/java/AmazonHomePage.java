import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage {

    @FindBy(id="nav-logo-sprites")
    WebElement amazonLogo;

    @FindBy(xpath = "//span[@class='nav-cart-icon nav-sprite']")
    WebElement cartImage;

    public void getAmazonLogoWebElement()
    {
//        return driver.amazonLogo;
    }

}
