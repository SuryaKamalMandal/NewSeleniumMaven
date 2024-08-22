package AmazonTestCases;
import org.testng.annotations.Test;
import elementAmazon.homePageAmazon;
import elementAmazon.loginPageAmazon;
public class A212_TestCase1Login extends Launch_Quit{

	@Test
	public void loginamazon() throws Throwable {
		
		homePageAmazon hp= new homePageAmazon(driver);
		hp.signIN();
		loginPageAmazon lp= new loginPageAmazon(driver);
		lp.username();
		lp.pwd();
	}
}