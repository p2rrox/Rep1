package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailID {
	
	@FindBy(id="identifierId")
	private WebElement id;
	
	@FindBy(xpath="(//span[contains(.,'Create')])[1]")
	private WebElement createAcc;
	
	@FindBy(xpath="(//div[.='For myself'])[2]")
	private WebElement forMyself;
	
	@FindBy(xpath="(//span[.='Next'])[1]")
	private WebElement next;
	
	public GmailID(WebDriver d){
		PageFactory.initElements(d, this);
	}
	
	public void signUp() throws InterruptedException{
		Thread.sleep(1000);
		createAcc.click();
		Thread.sleep(500);
		forMyself.click();
	}
	
	public void emailIs(String email){
		id.sendKeys(email);
		next.click();
	}
	
}
