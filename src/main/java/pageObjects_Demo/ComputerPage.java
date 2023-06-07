package pageObjects_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
public class ComputerPage {
	
	
    WebDriver driver;
    Actions act;
    
	
	public ComputerPage(WebDriver driver) {
		this.driver = driver;
		this.act = new Actions(driver);
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "(//*[@href='/computers'])[1]")
	
	public WebElement ComputerHeader;
	
	
    @FindBy(xpath = "(//*[@href='/desktops'])[1]")
	
	public WebElement DesktopButton;
    
    
    public void menuNavigation()
    {
    	act.moveToElement(ComputerHeader).build().perform();
    	DesktopButton.click();
    		
    }


}
