package FaceBookTestCases;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import elementFaceBook.HomePageFB;
import elementFaceBook.loginPageFB;

public class A211_fblogin_search {
	WebDriver driver;
	@Test
	public void login_search() throws Throwable {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");

		loginPageFB lp= new loginPageFB(driver);
		lp.login_to_fb();
		HomePageFB hp= new HomePageFB(driver);
		hp.search();
	}
}