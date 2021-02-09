package com.w2a.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\com\\w2a\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://zoho.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		HomePage home = new HomePage(driver);
		home.goToLogin();
		LoginPage login = new LoginPage(driver);
		login.doLogin("alagan.tamil@gmail.com", "Selenium@123");
		
		

	}

}
