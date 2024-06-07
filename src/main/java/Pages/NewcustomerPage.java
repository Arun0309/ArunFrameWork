package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewcustomerPage {
	
	WebDriver driver;
	
	public NewcustomerPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	//Locators
	
	By Newcustomer= By.xpath("/html/body/div[3]/div/ul/li[2]/a");
	By Customername= By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input");
	By DOB= By.xpath("//*[@id=\"dob\"]");
	By Address= By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea");
	By city= By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input");
	By state=By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input");
	
	
	//Ations Methods
	
	
	
	public void Newcustomer() {
		
		driver.findElement(Newcustomer).click();
		driver.navigate().refresh();
		driver.findElement(Newcustomer).click();
		driver.findElement(Customername).sendKeys("Krish");
		driver.findElement(DOB).sendKeys("03-09-1994");
		driver.findElement(Address).sendKeys("karimnagar");
		driver.findElement(city).sendKeys("Knr");
		driver.findElement(state).sendKeys("Telangana");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
