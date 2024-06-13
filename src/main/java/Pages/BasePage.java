package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	WebDriver driver;
	
	public BasePage(WebDriver driver){
		 this.driver=driver;
		 
	 }
	 
	void Sendkeys(By locator,String Text){
		driver.findElement(locator).sendKeys(Text);
		
	}
	
	void Click(By locator) {
		driver.findElement(locator).click();
	}
	
	void Refresh() {
		driver.navigate().refresh();
	}
	
	void Frame(By locator) {
		WebElement element=driver.findElement(locator);
		driver.switchTo().frame(element);
		
	}
	void Defaultcontent() {
		driver.switchTo().defaultContent();
	}
	
	void AcceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	void CancelAlert() {
		driver.switchTo().alert().dismiss();
	}
	String Gettext(By locator) {
		
		String ABC=driver.findElement(locator).getText();
		return ABC;
		
		
	}
	
	
	
	
	
	
	

}
