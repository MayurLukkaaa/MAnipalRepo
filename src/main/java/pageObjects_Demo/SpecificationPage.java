package pageObjects_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SpecificationPage {
	
	
        WebDriver driver;
	
	    public SpecificationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
	public WebElement addToCart;
	
	@FindBy(xpath="//input[@id = 'add-to-cart-button-72']")
	public WebElement SpecificationHeader;
	
	
	public void SpecificationHeader() {
		
		addToCart.click();
		
		System.out.println(SpecificationHeader.isDisplayed());
		
		Assert.assertEquals(SpecificationHeader.isDisplayed(), true);
		
	}
}