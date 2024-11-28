package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnonations {
	@BeforeSuite
	void as()
	{
		System.out.println("this is before suite...");
	}
	@AfterSuite
	void bs()
	{
		System.out.println("this is after suite...");
	}
	@BeforeTest
	void at()
	{
		System.out.println("this is before test...");
	}
	@AfterTest
	void bt()
	{
		System.out.println("this is after test...");
	}
	@BeforeClass
	void bm()
	{
		System.out.println("this is before class...");
	}
	@AfterClass
	void bn()
	{
		System.out.println("this is after class...");
	}
	@BeforeMethod
	void am()
	{
		System.out.println("this is before method...");
	}
	@AfterMethod
	void al()
	{
		System.out.println("this is after method...");
	}
	@Test
	void tm1()
	{
		System.out.println("this is test method 1...");
	}
	@Test
	void tm2()
	{
		System.out.println("this is test method2...");
	}

}
