package com.Excelr.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Organisation {
	WebDriver driver;
	By organisation = By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span");
	By generalinfo = By.xpath("//a[text()='General Information']");
	By radiobutton = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div/label/span");

	
	
	public Organisation(WebDriver driver)
	{
		this.driver = driver;
	}
	public void OrganisationModule() {
		driver.findElement(organisation).click();
	}
	public void generalInformation() {
		driver.findElement(generalinfo).click();
	}
	public void radioButton() {
		driver.findElement(radiobutton).click();
	}

		
	}
	
	

