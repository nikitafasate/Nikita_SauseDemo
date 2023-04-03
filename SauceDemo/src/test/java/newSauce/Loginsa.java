package newSauce;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Loginsa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();    
		driver.get("https://www.saucedemo.com/");
	   Set<Cookie>  rec=driver.manage().getCookies();
	   System.out.println(rec);

				
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
  		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
  		WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
  	
  		username.sendKeys("standard_user");
 		password.sendKeys("secret_sauce");
 		login.click();
 		
 		Thread.sleep(3000);
 		driver.close();
	// TODO Auto-generated method stub

	}

}
