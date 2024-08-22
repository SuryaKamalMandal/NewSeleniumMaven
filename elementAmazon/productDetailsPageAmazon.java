package elementAmazon;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetailsPageAmazon {
	WebDriver driver;
	
	public productDetailsPageAmazon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id= "wishListMainButton")
	WebElement add_wishlist;
	
	public void wishlist() {
		add_wishlist.click();
	}
}