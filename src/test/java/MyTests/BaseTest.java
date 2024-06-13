package MyTests;



import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Pages.LoginPage;
import Pages.LoginPagetwo;
import Pages.NewcustomerPage;
import Pages.Newcustomertwo;

public class BaseTest {
	
	WebDriver driver;
	LoginPage LP;
	NewcustomerPage NC;
	Newcustomertwo NC2;
	LoginPagetwo LP2;
	Properties prop;
	
	@BeforeTest
	void Setup() throws IOException {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/v4");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		LP= new LoginPage(driver);
		NC= new NewcustomerPage(driver);
		LP2= new LoginPagetwo(driver);
		NC2=new Newcustomertwo(driver);
		prop=new Properties();
		FileInputStream file=new FileInputStream("C:/Users/ADMIN/eclipse-workspace/ArunFrameWork/src/test/resources/config.properties");
		prop.load(file);
	}
	@AfterTest
	void CloseApp() {
		driver.close();
	}


}
