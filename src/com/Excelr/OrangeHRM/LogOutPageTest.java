package com.Excelr.OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Excelr.Pages.LogOut;
import com.Excelr.Pages.Login;

public class LogOutPageTest {
	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Login login = new Login(driver);
		LogOut logout = new LogOut(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		login.typeUsername("Admin");
		login.typePassword("admin123");
		login.logIn();

//	for log out
		logout.logoutOfTheApplication();
		driver.close();
	}

}
