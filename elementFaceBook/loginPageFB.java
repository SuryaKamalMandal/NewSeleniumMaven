package elementFaceBook;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageFB {

	public loginPageFB(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name= "email")
	WebElement un_field;
	
	@FindBy(id= "pass")
	WebElement pass_field;
	
	@FindBy(name= "login")
	WebElement login_button;
	
	public void login_to_fb() throws Throwable {
		
		FileInputStream fis= new FileInputStream("C:\\Users\\Surya-LAPTOP\\eclipse-workspace\\NewJavaPro\\DDTExcel\\personalinfo.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		String un= book.getSheet("facebook").getRow(1).getCell(1).getStringCellValue();
		String pass= book.getSheet("facebook").getRow(2).getCell(1).getStringCellValue();
		
		un_field.sendKeys(un);
		pass_field.sendKeys(pass);
		login_button.click();
	}
}