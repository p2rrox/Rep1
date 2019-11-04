package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPwd {
		
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(xpath="(//span[.='Next'])[1]")
	private WebElement next;
	
	public GmailPwd(WebDriver d){
		PageFactory.initElements(d, this);
	}
	
	public void pwdIs(String pwd){
		pass.sendKeys(pwd);
	}
	public void nextClick(){
		next.click();
	}
}
