package elementAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productResultPageAmazon {
	WebDriver driver;
	public productResultPageAmazon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "((//span[@class='rush-component'])/a/div)[1]")
	WebElement product_item;
	
	public void item() {
		
		product_item.click();
	}
	
}