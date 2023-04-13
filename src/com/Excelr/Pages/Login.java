package com.Excelr.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

		WebDriver driver;

		By username = (By.xpath("//input[@name = 'username']"));
		
		By password = (By.xpath("//input[@name = 'password']"));
		
		By login = (By.xpath("//button[@type = 'submit']"));
		public Login(WebDriver driver)
		{
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
		

	}


