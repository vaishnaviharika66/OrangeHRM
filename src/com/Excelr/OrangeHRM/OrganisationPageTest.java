package com.Excelr.OrangeHRM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Excelr.Pages.Admin;
import com.Excelr.Pages.Login;
import com.Excelr.Pages.Organisation;

public class OrganisationPageTest {
	public static void main(String[] args) throws IOException {
//		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Login login = new Login(driver);
		Admin admin = new Admin(driver);
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		login.typeUsername("Admin");
		login.typePassword("admin123");
		login.logIn();
		
//		for Admin page
		admin.adminModule();
		
//		for organisation
		Organisation org = new Organisation(driver);
		org.OrganisationModule();
		org.generalInformation();
		org.radioButton();
//		
	}
}
