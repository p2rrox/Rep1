package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPhNum {
	
	@FindBy(id="phoneNumberId")
	private WebElement phNum;
	
	@FindBy(xpath = "(//span[.='Next'])[2]")
	private WebElement next;
	
	public GmailPhNum(WebDriver d){
		PageFactory.initElements(d, this);
	}
	 
	public void phNum(String phoneNumber) throws InterruptedException{
		Thread.sleep(1000);
		phNum.sendKeys(phoneNumber);
		Thread.sleep(1000);
		next.click();
	}
}
