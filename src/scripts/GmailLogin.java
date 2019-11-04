package scripts;

import gen.Anno_Gen;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import pom.GmailID;
import pom.GmailPwd;

public class GmailLogin extends Anno_Gen {

	@Test
	public void gmailTest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		GmailID id = new GmailID(d);
		id.emailIs("orodi76");
		Thread.sleep(3000);
		GmailPwd pwd = new GmailPwd(d);
		pwd.pwdIs("Formula@1");
		pwd.nextClick();
	}
}
