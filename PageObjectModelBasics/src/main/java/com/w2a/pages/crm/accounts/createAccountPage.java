package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class createAccountPage extends Page {
	
	public void  createAccount(String accountName)
	{
		driver.findElement(By.xpath("//input[@id='Crm_Accounts_ACCOUNTNAME_LInput']")).click();
		driver.findElement(By.xpath("//input[@id='Crm_Accounts_ACCOUNTNAME_LInput']")).sendKeys(accountName);
		
	}

}
