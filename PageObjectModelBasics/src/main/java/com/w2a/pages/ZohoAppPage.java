package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {
	
	public void gotoCliq()
	{
		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[4]/div/a/div")).click();
	}
	public CRMHomePage gotoCRM()
	{
		driver.findElement(By.cssSelector("._logo-crm")).click();
		return new CRMHomePage();
	}
	public void gotoCalender()
	{
		
		
	}
	
	
}
