package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
	@Test
	void testTitle()
	{
		String exp_title="Opencart";
		String Act_title="Opencart";
		/*if(exp_title.equals(Act_title))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}*/
		//Assert.assertEquals(exp_title,Act_title );
		if(exp_title.equals(Act_title))
		{
			System.out.println("test passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("test failed");
			Assert.assertTrue(false);
		}
	}

}
