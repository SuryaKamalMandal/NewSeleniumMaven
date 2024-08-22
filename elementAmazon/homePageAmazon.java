package elementAmazon;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageAmazon {
	WebDriver driver;
	
	public homePageAmazon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//span[.='Hello, sign in']")
	WebElement signin;
	
	@FindBy(id= "twotabsearchtextbox")
	WebElement search_tf;
	
	@FindBy(id= "nav-link-accountList")
	WebElement account;
	
	@FindBy(linkText = "Start here.")
	WebElement register_button;
	
	public void signIN() {
		signin.click();
	}
	
	public void searchField(String productName) {
		search_tf.sendKeys(productName,Keys.ENTER);
	}
	
	public void account_list(WebDriver driver) {
		
		Actions a= new Actions(driver);
		a.moveToElement(account).perform();
	}
	
	public void register() {
		register_button.click();
	}
}