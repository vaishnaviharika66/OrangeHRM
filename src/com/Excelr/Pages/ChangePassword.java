package com.Excelr.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangePassword {
	WebDriver driver;
	By dropDown = By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span");
	By chpassword = By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[3]/a");
	By cpassword = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/input");
	By password = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");
	By confirmpassword = By
			.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");
	By saveoption = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]");

	public ChangePassword(WebDriver driver) {
		this.driver = driver;
	}

	public void dropDown() {
		driver.findElement(dropDown).click();
	}

	public void changePassword() {
		driver.findElement(chpassword).click();
	}

	public void currentPassword(String cp_data) {
		driver.findElement(cpassword).sendKeys(cp_data);
	}

	public void typePassword(String tp_data) {
		driver.findElement(password).sendKeys(tp_data);

	}

	public void confirmPassword(String cf_data) {
		driver.findElement(confirmpassword).sendKeys(cf_data);
	}
//  it displays password sucesssfully changed.
	public void saveOption() {
		driver.findElement(saveoption).click();

	}

}
