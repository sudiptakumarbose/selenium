package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class HomePage extends Page {
	
	public void gotoSupport()
	{
		driver.findElement(By.cssSelector(".zh-user-account>a:nth-child(2)")).click();
		
	}
	
	
	
	public void gotoSignup()
	{
		driver.findElement(By.cssSelector(".zh-signup")).click();
	}
	public LoginPage gotoSignin()
	{
		click("loginlink_CSS");
		return new LoginPage();
		
	}
	public void gotoCustomers()
	{
		driver.findElement(By.cssSelector(".zh-user-account>a:nth-child(1)")).click();
	}
	public void gotoLearnmore()
	{
		driver.findElement(By.cssSelector(".zh-zoho-one-cont > a")).click();
	}
	public void validateFooterLinks()
	{
		
	}
}
