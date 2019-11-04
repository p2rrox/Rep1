package gen;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class Browser_gen 
{
	public void max(WebDriver d)
	{
		d.manage().window().maximize();
	}
	public void min() throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_ALT);
	}
	public void res(int w, int h)
	{
		new Dimension(w, h);
	}
	public void bck(WebDriver d)
	{
		d.navigate().back();
	}
	public void fwd(WebDriver d)
	{
		d.navigate().forward();
	}
	public void clTab(WebDriver d, String win)
	{
		d.switchTo().window(win);
		d.close();
	}
	public void clTab(WebDriver d)
	{
		d.close();
	}
	public void quit(WebDriver d)
	{
		d.quit();
	}
	public void gt(WebDriver d, String txt)
	{
		 d.get(txt);
	}
	public void url(WebDriver d)
	{
		 d.getCurrentUrl();
	}
	public void src(WebDriver d)
	{
		 d.getPageSource();
	}
	public void ttl(WebDriver d)
	{
		 d.getTitle();
	}
	public String winHandle(WebDriver d)
	{
		 String txt = d.getWindowHandle();
		 return txt;
	}
	public void winHandles(WebDriver d, int i)
	{
		Set<String> allwh = d.getWindowHandles();
		List<String> l = new ArrayList<String>(allwh);
		String txt = l.get(i);
		d.switchTo().window(txt);
	}
	public void dragBrowser(int x, int y) {
		new Point(x, y);
	}
}