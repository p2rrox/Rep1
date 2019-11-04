package scripts;

import gen.Anno_Gen;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import pom.GmailID;
import pom.GmailPhNum;
import pom.GmailSignUp;

public class GmailCreateAcc extends Anno_Gen {

	@Test
	public void signUp() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException{
		
		GmailID create = new GmailID(d);
		create.signUp();
		
		GmailSignUp signup= new GmailSignUp(d);
		
		signup.signup();
		
		GmailPhNum ph = new GmailPhNum(d);
		
		ph.phNum("4412414144141241");
		
	}
}
