package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class AccountsPage extends Page{
	
	public createAccountPage gotoCreateAccount()
	{
		driver.findElement(By.xpath("//button[@class='customPlusBtn crm-font-bold newwhitebtn cP']")).click();
		return new createAccountPage();
		
		
	}
	public void gotoImportAccount()
	{
		
	}
	
}
