package com.Excelr.OrangeHRM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Excelr.Pages.ChangePassword;
import com.Excelr.Pages.Login;

public class ChangePasswordPageTest {
	public static void main(String[] args) throws IOException {
//		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Login login = new Login(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		login.typeUsername("Admin");
		login.typePassword("admin123");
		login.logIn();

		// change password data
		ChangePassword C_pwd = new ChangePassword(driver);
		C_pwd.dropDown();
		C_pwd.changePassword();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		C_pwd.currentPassword("admin123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		C_pwd.typePassword("Vaishu@123");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		C_pwd.confirmPassword("Vaishu@123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		C_pwd.saveOption();

	}
}
