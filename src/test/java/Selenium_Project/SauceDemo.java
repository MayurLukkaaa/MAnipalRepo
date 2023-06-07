package Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayur Lukka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		//Maximize
		
		driver.manage().window().maximize();
		
		//Login
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		//Add to Cart
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']")).click();
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
		
		//Click on Cart
		
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		
		//Remove Products
		
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		
		driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
		
		driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();
		
		driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();
		
		driver.findElement(By.id("remove-sauce-labs-onesie")).click();
		
		driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)")).click();
		
		//Go Back
		
		driver.navigate().back();
		
		// Cart Again
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']")).click();
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
		
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		
		//Checkout
		
		driver.findElement(By.xpath("//button[text()='Checkout']")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("firstname");
		
		driver.findElement(By.id("last-name")).sendKeys("lastname");
		
		driver.findElement(By.id("postal-code")).sendKeys("123456");
		
		//Finish
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.xpath("//button[text()='Finish']")).click();

		
		
	}

}
