package day7June2023;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo4 {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before  suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class...");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}
	@BeforeMethod
	public void tearup() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void tearDown() {
		System.out.println("After Method...");
	}
	@Test
	public void reg() {
		System.out.println("registered successfully");
	}
	@Test
	public void login() {
		System.out.println("Successfully login");
	}
	@Test
	public void logout() {
		System.out.println("Successfully logout");
	}

}
