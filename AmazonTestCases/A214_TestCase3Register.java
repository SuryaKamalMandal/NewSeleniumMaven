package AmazonTestCases;
import org.testng.annotations.Test;
import elementAmazon.homePageAmazon;
import elementAmazon.registerPageAmazon;

public class A214_TestCase3Register extends Launch_Quit{

	@Test
	public void register_amazon() throws Throwable {
		
		homePageAmazon hp= new homePageAmazon(driver);
		hp.account_list(driver);
		hp.register();
		registerPageAmazon rp= new registerPageAmazon(driver);
//		rp.username();
//		rp.process();
		rp.register_user();
	}
}