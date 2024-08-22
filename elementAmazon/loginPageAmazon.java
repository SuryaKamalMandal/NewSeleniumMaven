package elementAmazon;
import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageAmazon {
	WebDriver driver;
	public username_pass_ddt upddt= new username_pass_ddt();
	public loginPageAmazon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name= "email")
	WebElement username_tf;
	
	@FindBy(name= "password")
	WebElement password_tf;
	
	public void username() throws Throwable {
		String un= upddt.getDataFromExcelSheet("amazon", 1, 1);
		username_tf.sendKeys(un,Keys.ENTER);
	}
	public void pwd() throws Throwable, IOException {
		String pass= upddt.getDataFromExcelSheet("amazon", 2, 1);
		password_tf.sendKeys(pass,Keys.ENTER);
	}	
}