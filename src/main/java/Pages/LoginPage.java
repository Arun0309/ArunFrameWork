package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	//Locators
	
	By UserID= By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input");
	By Password= By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input");
	By LoginButton=By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]");
	
	
	//Actions Methods
	
	public void Login() {
		
		driver.findElement(UserID).sendKeys("mngr572031");
		driver.findElement(Password).sendKeys("rEnErUz");
		driver.findElement(LoginButton).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
