package Utility;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.apache.log4j.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static ReadConfigFile read=new ReadConfigFile();
	protected static String global_username=read.getUsername();
	protected static String global_password=read.getPassword();
	protected static String url=read.getUrl();
	protected static String browser=read.getBrowser();
	public static Logger log;
		
		protected static WebDriver driver;
		
		@BeforeTest
		public void setup()
		{
			System.out.println(browser+"browser");

			if(browser.equals("chrome"))
			{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		//	log = Logger.getLogger("newSauce");
		//	PropertyConfigurator.configure("config.propeties");
			
			}
			if(browser.equals("firefox"))
			{   System.out.println(browser+"jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
				System.setProperty("webdriver.gecko.driver", ".\\src\\test\\resources\\Driver\\geckodriver.exe");
			
				driver= new FirefoxDriver();
				//log = Logger.getLogger("newSauce");
				//PropertyConfigurator.configure("config.properties");
			}
			if(browser.equals("edge"))
			{
				WebDriverManager.edgedriver().setup();
				driver= new EdgeDriver();
				//log = Logger.getLogger("newSauce");
				//PropertyConfigurator.configure("config.properties");
			}

			
			log = Logger.getLogger("newSauce");
			PropertyConfigurator.configure("logfile.properties");
		}
		
		@AfterTest
		public void tear()
		{
			driver.quit();
		}
		
}
