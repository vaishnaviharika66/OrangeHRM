package com.Excelr.OrangeHRM;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.Excelr.Pages.Admin;
import com.Excelr.Pages.Jobpage;
import com.Excelr.Pages.Login;

public class LoginPageTest {
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
		
		
		

		



	}
}
