package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.pages.crm.accounts.AccountsPage;

public class TopMenu {
	WebDriver driver;
	public TopMenu(WebDriver driver)
	{
		this.driver=driver;
	}

	public void gotoHome() {

	}

	public void gotoLeads() {

	}

	public void gotoContacts() {

	}

	public AccountsPage gotoAccounts() {
		
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		return new AccountsPage();
		
		

	}

	public void gotoDeals() {

	}

	public void gotoTasks() {

	}

	public void gotoMeetings() {

	}

	public void gotoCalls() {

	}

	public void gotoReports() {

	}

	public void gotoAnalytics() {

	}

	public void gotoMarketplace() {

	}
	public void signOut()
	{
		
	}
}
