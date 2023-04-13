package com.Excelr.OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Excelr.Pages.Admin;
import com.Excelr.Pages.Jobpage;
import com.Excelr.Pages.Login;
import com.Excelr.Pages.Qualification;

public class QualificationPagetest {
	public static void main(String[] args) {
		
		
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);

	driver.manage().window().maximize();

	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Login login = new Login(driver);
	Admin admin = new Admin(driver);
	Jobpage jobpage = new Jobpage(driver);
	
//	for login page
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	login.typeUsername("Admin");
	login.typePassword("admin123");
	login.logIn();
	
//	for Admin page
	admin.adminModule();
	
	
//	for Qualification page
	Qualification qualification = new Qualification(driver) ;
		qualification.QualificationModule();
		qualification.Skills();
		qualification.checkBoxClick();
		qualification.deleteButton();
		qualification.confirmDelete();
		qualification.QualificationModule();
		qualification.educationMode();
		qualification.addButton();
		qualification.typeLevel("Automation Testing");
		qualification.saveButton();
	}

}
