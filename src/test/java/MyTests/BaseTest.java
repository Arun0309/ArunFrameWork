package MyTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Pages.LoginPage;
import Pages.LoginPagetwo;
import Pages.NewcustomerPage;

public class BaseTest {
	
	WebDriver driver;
	LoginPage LP;
	NewcustomerPage NC;
	LoginPagetwo LP2;
	
	@BeforeTest
	void Setup() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/v4");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		LP= new LoginPage(driver);
		NC= new NewcustomerPage(driver);
		LP2= new LoginPagetwo(driver);
	
	}
	@AfterTest
	void CloseApp() {
		driver.close();
	}


}
