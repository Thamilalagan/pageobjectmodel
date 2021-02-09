package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void goToSupport() {
		
		driver.findElement(By.cssSelector(".zh-support")).click();
		
	}
	public void goToSignUp() {
		
		driver.findElement(By.cssSelector(".zh-signup")).click();
		
	}
	public void goToLogin() {
		
		driver.findElement(By.cssSelector(".zh-login")).click();
		
	}
	public void goToLearnMore() {
		
		driver.findElement(By.cssSelector("a.learn-more")).click();
		
	}
	public void ValidateFooterLinks() {
		
		
	}

}
