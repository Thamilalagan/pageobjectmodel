package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void doLogin(String username, String password) {
		driver.findElement(By.cssSelector("#login_id")).sendKeys(username);
		driver.findElement(By.cssSelector("#nextbtn > span")).click();
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		driver.findElement(By.cssSelector("#nextbtn > span")).click();
	}
	
	public void gotoSalesandMarketing() {
		
	}
	
	public void gotoFinance() {
		
	}

}
