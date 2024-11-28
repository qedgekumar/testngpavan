package day44;

import org.testng.annotations.Test;

public class PaymentTests {
	@Test(priority=1,groups= {"sanity","regression","functional"})
	void paymentInRupees()
	{
		System.out.println("payment in rupees...");
	}
	@Test(priority=2,groups= {"sanity","regression","functional"})
	void paymentIndollars()
	{
		System.out.println("payment in dollars...");
	}
	

}
