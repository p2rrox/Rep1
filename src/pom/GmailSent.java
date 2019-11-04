package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class GmailSent {

	@FindBy(xpath="//a[.='Sent']")
	private WebElement sent;
	
	@FindBy(xpath="(//td[@role='gridcell'])[124]/span")
	private WebElement time;
	
	public GmailSent(WebDriver d){
		PageFactory.initElements(d, this);
	}
	
	public void sentTime(){
		sent.click();
		String senttime = time.getAttribute("title");
		Reporter.log("Mail sent at: "+senttime, true);
	}
}
