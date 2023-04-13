package com.Excelr.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Qualification {
	WebDriver driver;
	By qualification = By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]");
	By skills = By.xpath("//a[text()='Skills']");
	By checkbox = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[3]/div/div[1]/div/div[1]/div");
	By deletebutton = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div/button");
	By confirmdelete = By .xpath("/html/body/div/div[3]/div/div/div/div[3]/button[2]");
	By education = By.xpath("//a[text()='Education']");
	By addbutton = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[1]/div/button");
	By level = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input");
	By savebutton=By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]");
	public Qualification(WebDriver driver)
{
	this.driver = driver;
}
	public void QualificationModule() {
		driver.findElement(qualification).click();
	}
	public void Skills() {
		driver.findElement(skills).click();
	}
	public void checkBoxClick() {
		driver.findElement(checkbox).click();
	}
//	deleting multiple users 
	public void deleteButton() {
		driver.findElement(deletebutton).click();
	}
//	it displays popup  message and delete multiple users
	public void confirmDelete() {
		driver.findElement(confirmdelete).click();
	}
	public void educationMode() {
		driver.findElement(education).click();
	}

//	click on add button
	public void addButton() {
		driver.findElement(addbutton).click();
	}
	//Enter course name
	public void typeLevel(String enter_data) {
		driver.findElement(level).sendKeys(enter_data);
	}
//	click on save after saving the data new eduaction course will be added
	public void saveButton() {
		driver.findElement(savebutton).click();
	}
	
}
