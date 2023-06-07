package DemoWebshop_Base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

        public class Configurations {
        
	    @Test
        public WebDriver gettDriver() {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayur Lukka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		return driver;
		
}
}