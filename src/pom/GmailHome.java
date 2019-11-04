package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailHome {

	@FindBy(xpath="//a")
	private WebElement links;
	
	public GmailHome(WebDriver d){
		PageFactory.initElements(d, this);
	}
	
	public String getLinks(){
		String url = links.getAttribute("src");
		return url;
	}
}
