package FaceBookTestCases;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import elementFaceBook.loginPageFB;

public class A210_fblogin {
	WebDriver driver;
	@Test
	public void login() throws Throwable {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");

		loginPageFB lp= new loginPageFB(driver);
		lp.login_to_fb();
	}
}