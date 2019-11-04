package gen;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action_gen 
{
	Actions act;
	
	public Action_gen(WebDriver d){
		act = new Actions(d);
	}
	
	public void mouseHover(WebElement ele)
	{
		act.moveToElement(ele).perform();
	}
	public void dnD(WebElement src, WebElement trgt)
	{
		
		act.dragAndDrop(src, trgt).perform();
	}
	
	public void nTab(WebElement ele) throws AWTException
	{
		Robot r = new Robot();
		
		act.contextClick(ele).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	}
	public void nWin(WebElement ele) throws AWTException
	{
		Robot r = new Robot();
		
		act.contextClick(ele).perform();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
	}
	public void nPriWin(WebElement ele) throws AWTException
	{
		Robot r = new Robot();
		
		act.contextClick(ele).perform();
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
	}
	public void dClick(WebElement ele)
	{
		
		act.doubleClick(ele).perform();
	}
}