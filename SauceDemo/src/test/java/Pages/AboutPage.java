package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {
	WebDriver ldriver;
	
	  public  AboutPage(WebDriver driver)
		{
		    ldriver= driver;
			PageFactory.initElements(driver, this);
		}

		
		@FindBy(xpath=("//input[@id='user-name']"))
		WebElement usernameElement;
		

		@FindBy(xpath="//input[@id='password']")
		WebElement passwordElement;

		

		@FindBy(xpath="//input[@id='login-button']")
		WebElement buttonElement;
		
		@FindBy(xpath="//button[@id='react-burger-menu-btn']\r\n"
				+ "")
		WebElement menubtn;
		
		@FindBy(xpath="//a[@id='about_sidebar_link']")
		WebElement about;
		
		
		public void setUserName(String username)
		{
			usernameElement.sendKeys(username);
		}
		
		
		public void setPassword(String password)
		{
			passwordElement.sendKeys(password);
		}
		
		
		public  void clickButton()
		 {
			buttonElement.click();
		 }
		
		public  void menubtn()
		 {
			menubtn.click();
		 }
		
		public  void about()
		 {
			about.click();
		 }
		


		

		
}
