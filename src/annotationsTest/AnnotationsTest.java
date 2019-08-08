package annotationsTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest {
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Open browser - Before Method");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Close browser - After Method");
	}
	
	@Test(priority = 2, groups = "Regtest" )
	public void login() {
		System.out.println("Login - Test");
	}
	
	@Test(priority = 3,groups = "Regtest")
	public void Registration() {
		System.out.println("Registration - Test");
	}


	@Test (priority = 1)
	public void Booking() {
		System.out.println("Booking - Test");
	}

	@BeforeClass
	public void loginDB() {
		System.out.println("loginDB - Before class");
	}

	@AfterClass
	public void logoutDB() {
		System.out.println("logoutDB - After class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}
}
