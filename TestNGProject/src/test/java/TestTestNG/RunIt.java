package TestTestNG;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.MainPageFactory;

public class RunIt {
	
	WebDriver driver;
	MainPageFactory pf;
	
	@Test (priority=1)
	public void getBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zahidul Islam\\git\\repository\\TestNGProject\\src\\main\\java\\Utility\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		pf = new MainPageFactory(driver);
		
	}
	
	@Test (priority=2)
	public void getURL() throws IOException {
	driver.get(Utility.config.getConfig("URL"));
	}
	
	@Test (priority=3)
	public void getSignInButton() {
	pf.getSignInButton().click();
	}
	
	@Test (priority=4)
	public void getUserName() throws IOException {
	pf.getUsername().sendKeys(Utility.config.getConfig("Username"));
	}
	
	@Test (priority=5)
	public void getPassword() throws IOException {
	pf.getPassword().sendKeys(Utility.config.getConfig("Password"));
	}
	
	@Test (priority=6)
	public void getSubmit() {
	pf.getSubmit().click();
	driver.close();
	}

		
		
	}


