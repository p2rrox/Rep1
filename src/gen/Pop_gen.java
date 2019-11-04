package gen;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Pop_gen 
{
	public void alertAcc(WebDriver d,Alert a)
	{
		d.switchTo().alert();
		a.accept();
	}
	public void alertcancel(WebDriver d,Alert a)
	{
		d.switchTo().alert();
		a.dismiss();
	}
	public String alertMsg(WebDriver d,Alert a)
	{
		d.switchTo().alert();
		String text = a.getText();
		return text;
	}
	public void dloadAcc() throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void dloadCan() throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
	}
}