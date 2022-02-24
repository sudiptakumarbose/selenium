package com.w2a.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.createAccountPage;

public class LoginTest  {
	public static void main(String[] args) {
		
		
		HomePage home = new HomePage();
		LoginPage lp=home.gotoSignin();
		ZohoAppPage zp=lp.doLogin("sudipta512@rediffmail.com", "Uemeee20@2021");
		zp.gotoCRM();
		AccountsPage account=Page.menu.gotoAccounts();
		createAccountPage cap=account.gotoCreateAccount();
		cap.createAccount("Rohit");
		
		
		
		

	}

}
