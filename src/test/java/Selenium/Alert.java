package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayur Lukka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
//		driver.findElement(By.name("submit")).click();
//		
//		org.openqa.selenium.Alert obj = driver.switchTo().alert();
//		obj.accept();
//		System.out.println(obj.getText());
//		obj.dismiss();
		
		
		
//		Actions act = new Actions(driver);
//		
//		act.dragAndDrop(driver.findElement(By.xpath("//*[text()=' 5000']")), driver.findElement(By.id("amt8"))).build()
//		.perform();
		
		
		
		
		
		
		
	}

}
