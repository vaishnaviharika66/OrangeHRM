package com.Excelr.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Admin {
	WebDriver driver;
	By admin = By.xpath("//span[text()='Admin']");
	By usermanagement = By.xpath("//span[text()='User Management ']");
	By users = By.xpath("//a[text()='Users']");
	By userfield = By
			.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input");
	By userroleselect = By.xpath(
			"/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]");
	By userrole = By.xpath("//div[text()='Admin']");
	By employename = By.xpath(
			"/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input");
	By statusdropdown = By.xpath("//div[text()='-- Select --']");
	By status = By.xpath("//div[text()='Enabled']");
	By search = (By.id("searchBtn"));

	public Admin(WebDriver driver) {
		this.driver = driver;
	}

	public void adminModule() {
		driver.findElement(admin).click();
	}

	public void userManagement() {
		driver.findElement(usermanagement).click();

	}

	public void Users() {
		driver.findElement(users).click();
	}

	public void userField(String UserName_data) {
		driver.findElement(userfield).sendKeys(UserName_data);
	}

	public void userRoleSelect() {
		driver.findElement(userroleselect).click();
	}

	public void userRole(String userrole_data) {
		driver.findElement(userrole).sendKeys(userrole_data);
	}

	public void employeName(String employe_data) {
		driver.findElement(employename).sendKeys(employe_data);
	}

	public void statusDropdown() {
		driver.findElement(statusdropdown).click();
	}

	public void Status(String status_data) {
		driver.findElement(status).sendKeys(status_data);
	}

	public void Search() {
		driver.findElement(search).click();
	}
}
