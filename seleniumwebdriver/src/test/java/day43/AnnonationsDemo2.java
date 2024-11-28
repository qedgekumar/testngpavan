package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 1)Login - @Before class
 2)search -@Test
 3)Advanced search -@Test
  4)Logout-@Afterclass
 */
public class AnnonationsDemo2 {
	@BeforeClass
	void login()
	{
		System.out.println("This is login...");
	}
	@Test(priority=1)
	void search()
	{
		System.out.println("This is search...");
	}
	@Test(priority=2)
	void advancedsearch()
	{
		System.out.println("This is advanced search...");
	}
	@AfterClass
	void logout()
	{
		System.out.println("This is logout...");
	}
	

}
