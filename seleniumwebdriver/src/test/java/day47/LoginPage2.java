package day47;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	WebDriver driver;
	//constructor-This will initiate the driver(webdriver)
	LoginPage2(WebDriver driver)//at the time of invoking this driver i will pass the testcase later
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);//from the pagefactory in this we have to call one method init elements
		//this particular init method applicable for all kinds of elements(internally findby elements)
		//init elements is a method which will initate all the elements using driver
	}
	
	//Locators
	
	
	@FindBy(xpath="//input[@name='username']")
	//@FindBy(how=How.XPATH,using="//input[@name='username']")-how variable How class using keyword
	WebElement txt_username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btn_login;
	
	@FindBy(tagName="a")
	List<WebElement>links;
	
	
	//Action methods
	
	public void setUserName(String user) {
		txt_username.sendKeys("Admin");
	}
	public void setPassword(String pwd) {
		txt_password.sendKeys("Admin123");
	}
	public void clickLogin() {
		btn_login.click();
	}

	

}
