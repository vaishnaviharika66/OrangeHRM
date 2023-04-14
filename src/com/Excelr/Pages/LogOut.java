package com.Excelr.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOut {
	WebDriver driver;
	By dropDown = By.xpath("//span[@class = 'oxd-userdropdown-tab']");

	By logOut = By.xpath("//a[contains(text(),'Logout')]");
	public LogOut(WebDriver driver) {
		this.driver = driver;
	}

	public void logoutOfTheApplication() {
		driver.findElement(dropDown).click();
		driver.findElement(logOut).click();
		driver.close();
		
	}

}
