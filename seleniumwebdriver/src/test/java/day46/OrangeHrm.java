package day46;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(day46.MyListener.class)
public class OrangeHrm {
	WebDriver driver;
	@BeforeClass
	void setUp() throws Throwable
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
	}
	@Test(priority=1)
	void testLogo()
	{
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	@Test(priority=2)
	void testAppUrl()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "orangehrm");
	}
	@Test(priority=3,dependsOnMethods= {"testAppUrl"})
	void testTitle()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM" );
	}
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}
