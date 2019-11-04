package scripts;

import gen.Anno_Gen;
import gen.Data_Gen;
import gen.WritetoExcel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pom.GmailHome;
import pom.GmailID;
import pom.GmailPwd;
import pom.GmailSent;

public class GmailSentTime extends Anno_Gen {
	
	@Test
	public void gmailTest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		String un = Data_Gen.getData("Sheet1", 0, 1);
		String pswd = Data_Gen.getData("Sheet1", 0, 2);
		
		d.get("https://www.gmail.com");
		GmailID id = new GmailID(d);
		id.emailIs(un);
		Thread.sleep(3000);
		GmailPwd pwd = new GmailPwd(d);
		pwd.pwdIs(pswd);
		pwd.nextClick();
		
		Thread.sleep(3000);
		GmailHome gh = new GmailHome(d);
		String url = gh.getLinks();
		WritetoExcel.links(0, url, "Sheet1");
		
		Thread.sleep(5000);
		GmailSent gs = new GmailSent(d);
		gs.sentTime();
		Thread.sleep(2000);
		d.findElement(By.xpath("(//div[contains(.,'To')]/span)[5]")).click();
		Thread.sleep(10000);
		
	}
}