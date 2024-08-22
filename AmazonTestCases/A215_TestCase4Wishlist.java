package AmazonTestCases;
import java.util.Iterator;
import java.util.Set;
import org.testng.annotations.Test;
import elementAmazon.homePageAmazon;
import elementAmazon.loginPageAmazon;
import elementAmazon.productDetailsPageAmazon;
import elementAmazon.productResultPageAmazon;

public class A215_TestCase4Wishlist extends Launch_Quit{
	
	@Test
	public void wishlist() throws Throwable {
		
		homePageAmazon hp= new homePageAmazon(driver);
		hp.signIN();
		loginPageAmazon lp= new loginPageAmazon(driver);
		lp.username();
		lp.pwd();
		hp.searchField("Shoes");
		productResultPageAmazon pr= new productResultPageAmazon(driver);
		pr.item();
		
		Set<String> allid= driver.getWindowHandles();
		Iterator<String> ids= allid.iterator();
		String parentid= ids.next();
		String childid= ids.next();
		driver.switchTo().window(childid);
		
		productDetailsPageAmazon pd= new productDetailsPageAmazon(driver);
		pd.wishlist();
		
	}
}