package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import DemoWebshop_Base.Configurations;
import pageObjects_Demo.ComputerPage;
import pageObjects_Demo.HomePage1;
import pageObjects_Demo.SpecificationPage;


   
   public class TestCase2 extends Configurations {
	
	
	public HomePage1 homeObj;
	public ComputerPage computerObj;
	public SpecificationPage specificationObj;
	WebDriver driver;
	
	
	@BeforeClass
	public void initialSetup() {
		driver = gettDriver();
		homeObj = new HomePage1(driver);
		computerObj = new ComputerPage(driver);
		specificationObj = new SpecificationPage(driver);}
	
	@Test
	public void scenario2() {
		homeObj.verifyLogo();
		homeObj.verifyRegister();
		homeObj.verifyLogIn();
		homeObj.verifyShoppingCart();
		homeObj.verifyWishList();
		computerObj.menuNavigation();
		specificationObj.SpecificationHeader();
	}
	
}