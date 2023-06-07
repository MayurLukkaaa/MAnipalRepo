package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayur Lukka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		Select sel=new Select(driver.findElement(By.name("country")));
		
		sel.selectByValue("ANGOLA");
		
		sel.selectByVisibleText("INDIA");

	}

}
