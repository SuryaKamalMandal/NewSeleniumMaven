package elementAmazon;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerPageAmazon {
	WebDriver driver;
	FileInputStream fis;
	Workbook book;
	public registerPageAmazon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name= "email")
	WebElement username_tf;
	
	@FindBy(id = "ap_phone_number")
	WebElement mob_no;
	
	@FindBy(id = "ap_customer_name")
	WebElement full_name;
	
	@FindBy(id = "ap_password")
	WebElement pass;
	
	@FindBy(id = "auth-continue")
	WebElement verify_mob;
	
	@FindBy(className = "a-button-input")
	WebElement proceed;
	
	public void username() throws Throwable {
		fis= new FileInputStream("C:\\Users\\Surya-LAPTOP\\eclipse-workspace\\NewSelenium\\DDTExcel\\personalinfo.xlsx");
		book= WorkbookFactory.create(fis);
		String un= book.getSheet("amazon").getRow(1).getCell(2).getStringCellValue();
		username_tf.sendKeys(un,Keys.ENTER);
	}
	public void process() {
		proceed.click();
	}
	public void register_user() throws Throwable {
		fis= new FileInputStream("C:\\Users\\Surya-LAPTOP\\eclipse-workspace\\NewSelenium\\DDTExcel\\personalinfo.xlsx");
		book= WorkbookFactory.create(fis);
		String num= NumberToTextConverter.toText(book.getSheet("amazon").getRow(3).getCell(1).getNumericCellValue());
		String name= book.getSheet("amazon").getRow(4).getCell(1).getStringCellValue();
		String pwd= book.getSheet("amazon").getRow(2).getCell(2).getStringCellValue();
		
		full_name.sendKeys(name);
		mob_no.sendKeys(num);
		pass.sendKeys(pwd);
		verify_mob.click();
	}
}