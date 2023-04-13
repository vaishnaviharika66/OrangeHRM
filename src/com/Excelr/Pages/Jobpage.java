package com.Excelr.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Jobpage {
	WebDriver driver ;
	By  job = By.xpath("//span[text()='Job ']");
	By paygrade = By.xpath("//a[text()='Pay Grades']");
	By grade2= By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/label/span/i");
	By delete = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div/button");
	By confirm = By.xpath("/html/body/div/div[3]/div/div/div/div[3]/button[2]");
	By empstatus = By.xpath("//a[text()='Employment Status']");
	By freelance = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/label/span/i");
	By editbutton = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[3]/div/button[2]");
	By save = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]");
	public Jobpage(WebDriver driver) {
		this.driver = driver;
	}
	public void Job() {
		driver.findElement(job).click();
	}
	public void payGrade() {
		driver.findElement(paygrade).click();
	}
	public void gradeData() {
		driver.findElement(grade2).click();
	}
	public void delectSelect() {
		driver.findElement(delete).click();
	}
	public void confirmDelete() {
		driver.findElement(confirm).click();
	}
	public void employeStatus() {
		driver.findElement(empstatus).click();
	}
	public void Freelance() {
		driver.findElement(freelance).click();
	}
	public void editButton() {
		driver.findElement(editbutton);
	}
	public void saveButton() {
		driver.findElement(editbutton).click();
	}

}
