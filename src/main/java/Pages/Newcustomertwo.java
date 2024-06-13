package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Newcustomertwo extends BasePage{
	
	WebDriver driver;
	
	public Newcustomertwo(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}

	//locators
	
	By Newcustomer= By.xpath("/html/body/div[3]/div/ul/li[2]/a");
	By Customername= By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input");
	By DOB= By.xpath("//*[@id=\"dob\"]");
	By Address= By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea");
	By city= By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input");
	By state=By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input");
	By pin=By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input");
	By Mobilenumber=By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input");
	By Email=By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input");
	By Password=By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input");
	
	//Actions Methods
	
	public void Newcustomertwo(String text1,String text2,String text3,String text4,String text5,String text6,String text7,String text8,String text9)
	{
		Click(Newcustomer);
		Refresh();
		Click( Newcustomer);
		Sendkeys(Customername,text1);
		Sendkeys(DOB,text2);
		Sendkeys(Address,text3);
		Sendkeys(city,text4);
		Sendkeys(state,text5);
		Sendkeys(pin,text6);
		Sendkeys(Mobilenumber,text7);
		Sendkeys(Email,text8);
		Sendkeys(Password,text9);
		
	} 
	
}
