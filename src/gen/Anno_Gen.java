package gen;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Anno_Gen implements Auto_const{
	public WebDriver d;
	static {
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}

//	@Parameters({ "browser" })
	@BeforeMethod
	public void open() throws FileNotFoundException, IOException {
		String data = Prop_Gen.prop(PROP_PATH, "url");
		String impwait = Prop_Gen.prop(PROP_PATH,"iw");
		long time = Long.parseLong(impwait);
//		if (browser.equals("firefox")) {
			d = new FirefoxDriver();
			d.get(data);
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
//		} else {
//			d = new ChromeDriver();
//			d.get(data);
//			d.manage().window().maximize();
//			d.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
//		}
	}

	@SuppressWarnings("static-access")
	@AfterMethod
	public void close(ITestResult res) throws IOException {
		int status = res.getStatus();
		if (status == res.FAILURE) {
			scr_Gen.getScr(d);
		}
		d.quit();
	}
}
