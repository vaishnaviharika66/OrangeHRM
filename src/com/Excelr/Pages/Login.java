package com.Excelr.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	WebDriver driver;

	By username = (By.xpath("//input[@name = 'username']"));

	By password = (By.xpath("//input[@name = 'password']"));

	By login = (By.xpath("//button[@type = 'submit']"));
	By search = By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/div/div/input");

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public void typeUsername(String username_data) {
		driver.findElement(username).sendKeys(username_data);

	}

	public void typePassword(String password_data) {
		driver.findElement(password).sendKeys(password_data);
	}

	public void logIn() {
		driver.findElement(login).click();
	}

// search Admin module using search bar
	public void searchButton(String text_data) {
		driver.findElement(search).sendKeys(text_data);
	}

}
