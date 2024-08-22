package elementFaceBook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFB {

	public HomePageFB(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath= "//input[@type='search']")
	WebElement search_field;
	
	public void search() {
		search_field.sendKeys("Subhro",Keys.ENTER);
	}
}