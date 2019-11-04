package pom;

import gen.Data_Gen;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailSignUp {

	@FindBy(name = "firstName")
	private WebElement fn;

	@FindBy(name = "lastName")
	private WebElement ln;

	@FindBy(name = "Username")
	private WebElement un;

	@FindBy(name = "Passwd")
	private WebElement pwd;

	@FindBy(name = "ConfirmPasswd")
	private WebElement confpwd;

	@FindBy(xpath = "(//span[.='Next'])[2]")
	private WebElement next;

	public GmailSignUp(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public void signup() throws InterruptedException,
			EncryptedDocumentException, InvalidFormatException, IOException {

		String fname = Data_Gen.getData("Sheet2", 0, 0);
		String lname = Data_Gen.getData("Sheet2", 1, 0);
		String usname = Data_Gen.getData("Sheet2", 2, 0);
		String passwd = Data_Gen.getData("Sheet2", 3, 0);
		Thread.sleep(1000);
		fn.sendKeys(fname);
		ln.sendKeys(lname);
		un.sendKeys(usname);
		pwd.sendKeys(passwd);
		confpwd.sendKeys(passwd);
		next.click();
	}
}
