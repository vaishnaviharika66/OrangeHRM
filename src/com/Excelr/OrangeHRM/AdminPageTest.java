package com.Excelr.OrangeHRM;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Excelr.Pages.Admin;
import com.Excelr.Pages.Login;

public class AdminPageTest {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Login login = new Login(driver);
		Admin admin = new Admin(driver);

//		for login page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		login.typeUsername("Admin");
		login.typePassword("admin123");
		login.logIn();

//		for Admin page
		admin.adminModule();
		admin.userManagement();
		admin.Users();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		admin.userField("John Doe");
//		admin.userRoleSelect();
//		admin.userRole("Admin");
		admin.employeName("John Doe");
//		admin.statusDropdown();
//		admin.Status("Enabled");
		admin.Search(); // it shows no results found

	}

}
