package Selenium_Project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAnnotation {
	@Test
	public void testCase()
	{
		System.out.println("I am a testcase");
	}
	
	@Test
	public void testCase1()
	{
		System.out.println("I am a testcase");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am after method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("I am after class");
	}
	

}
