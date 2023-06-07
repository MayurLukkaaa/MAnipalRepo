package pageObjects_Demo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 {
	
        WebDriver driver;
	
	    public HomePage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	    
	    @FindBy(xpath = "//*[@alt ='Tricentis Demo Web Shop']")
		public WebElement DemoWebshopButton;
		
		@FindBy(linkText="Register")
		public WebElement RegisterLbl;
		
		@FindBy(linkText="Log in")
		public WebElement LogInLbl;
		
		@FindBy(xpath="(//*[text()='Shopping cart'])[1]")
		public WebElement ShoppingCartLbl;
		
		@FindBy(xpath="(//*[text()='Wishlist'])[1]")
		public WebElement WishListLbl;
		
		public void verifyLogo() {
			
			System.out.println(DemoWebshopButton.isDisplayed());
			Assert.assertTrue("DemoWebshopButton is not displayed",DemoWebshopButton.isDisplayed());
		}
		
		public void verifyRegister() {
			
			System.out.println(RegisterLbl.isDisplayed());
			Assert.assertTrue("RegisterLbl is not displayed",RegisterLbl.isDisplayed());
		}
		
		public void verifyLogIn() {
			System.out.println(LogInLbl.isDisplayed());
			Assert.assertTrue("LogInLbl is not displayed",LogInLbl.isDisplayed());
		}
		
		public void verifyShoppingCart() {
			System.out.println(ShoppingCartLbl.isDisplayed());
			Assert.assertTrue("ShoppingCartLbl is not displayed",ShoppingCartLbl.isDisplayed());}
		
		public void verifyWishList() {
			System.out.println(WishListLbl.isDisplayed());
			Assert.assertTrue("WishListLbl is not displayed",WishListLbl.isDisplayed());
	    

}
}
