package AmazonTestCases;
import org.testng.annotations.Test;
import elementAmazon.homePageAmazon;
public class A213_TestCase2Search extends Launch_Quit{
	
	@Test
	public void amazon_search() {
		
		homePageAmazon hp= new homePageAmazon(driver);
		hp.searchField("Shoes");	
	}
}