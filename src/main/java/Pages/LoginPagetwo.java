package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagetwo extends BasePage  {

	WebDriver driver;
	
	 public LoginPagetwo (WebDriver driver){
		super(driver);
		this.driver=driver;
	}
	
	//locators
	By UserID= By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input");
	By Password= By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input");
	By LoginButton=By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]");
	
	//Actions Methods
	
	public void LoginDetails(String ID,String PW) {
		Sendkeys(UserID,ID);
		Sendkeys(Password,PW);
		Click(LoginButton);
		
		
	}
	
}
