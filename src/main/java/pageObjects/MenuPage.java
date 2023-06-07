package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {
	
	WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "nav-hamburger-menu")
	
	public WebElement hamBurgerButton;
	
	@FindBy(xpath = "//*[text()='Mobiles, Computers']")
	
	public WebElement MobileComputersMenLbl;
	
    @FindBy(xpath = "//*[text()='All Mobile Phones']")
	
	public WebElement allMobileLbl;
    
    public void menuNavigation()
    {
    	hamBurgerButton.click();
    	MobileComputersMenLbl.click();
    	allMobileLbl.click();
    	
    }
    

}
