package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	//constructor-This will initiate the driver(webdriver)
	LoginPage(WebDriver driver)//at the time of invoking this driver i will pass the testcase later
	{
		this.driver=driver;
	}
	
	//Locators
	By txt_username_loc=By.xpath("//input[@name='username']");//locator
	By txt_password_loc=By.xpath("//input[@name='password']");
	By btn_login_loc=By.xpath("//button[@type='submit']");
	
	//Action methods
	public void setUserName(String user)
	{
		driver.findElement(txt_username_loc).sendKeys(user);
		
	}
	public void setPassword(String pwd)
	{
		driver.findElement(txt_password_loc).sendKeys(pwd);
		
	}
	public void clickLogin()
	{
		driver.findElement(btn_login_loc).click();
	}

	

}
