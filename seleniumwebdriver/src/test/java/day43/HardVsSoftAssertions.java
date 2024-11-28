package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	SoftAssert sa;//variable can create in class object cannot create in class ,object can create only in main or test method
	//@Test
	void test_hardassertions()
	{
		System.out.println("testing...");
		System.out.println("testing...");
		Assert.assertEquals(1, 2);//hardassertions
		System.out.println("testing...");
		System.out.println("testing...");
	}
	@Test
	void test_softassertions()
	{
		System.out.println("testing...");
		System.out.println("testing...");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2);//softassertions
		System.out.println("testing...");
		System.out.println("testing...");
		
		sa.assertAll();//mandatory
	}

}
