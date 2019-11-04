package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailCompose {

	@FindBy(xpath="(//div[.='Compose'])[3]")
	private WebElement compose;
	
	@FindBy(name="to")
	private WebElement to;
	
	@FindBy(name="subjectbox")
	private WebElement sub;
	
	@FindBy(xpath="//div[@role='textbox']")
	private WebElement body;
	
	@FindBy(xpath="(//div[.='Send'])[2]")
	private WebElement send;
	
	public GmailCompose(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void composeClick(){
		compose.click();
	}
	public void recepientIs(String email){
		to.sendKeys("p2r.rox@gmail.com");
	}
	public void subjectIs(String subject){
		sub.sendKeys(subject);
	}
	public void bodyIs(String msg){
		body.sendKeys(msg);		
	}
	public void sendClick(){
		send.click();
	}
}
