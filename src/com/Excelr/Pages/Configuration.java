package com.Excelr.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Configuration {
	WebDriver driver;
	By configuration = By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[7]/span");
	By emailconfi = By.xpath("//a[text()='Email Configuration']");
	By securesmtp = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/label/span");
	By reset = By.xpath("//button[text()=' Reset ']");
	public Configuration(WebDriver driver)
	{
		this.driver = driver;
	}
	public void ConfigurationModule() {
		driver.findElement(configuration).click();
	}
	public void emailConfiguration() {
		driver.findElement(emailconfi).click();
	}
//	select SMTP Radio Button
	public void clickSMtP() {
		driver.findElement(securesmtp).click();
	}
//		click on reset button then data will be abolished
		public void resetButton() {
			driver.findElement(reset).click();
			
			
		}
		
	}

