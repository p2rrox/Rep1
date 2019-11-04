package gen;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class scr_Gen {
	public static void getScr(WebDriver d) throws IOException
	{
		String ph= "./pics/";
		
		Date d1=new Date();
		String dt = d1.toString();
		String date = dt.replaceAll(":", "_");
		
		TakesScreenshot ts = (TakesScreenshot) d;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dst= new File(ph+date+".png");
		
		FileUtils.copyFile(src, dst);
	}

}
