package gen;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;

public class We_Gen 
{
	public String getAttr(WebElement ele, String att)
	{
		String attr = ele.getAttribute(att);
		return attr;
	}
	public String getCss(WebElement ele, String val)
	{
		String css = ele.getCssValue(val);
		return css;
	}
	public Point getLoc(WebElement ele)
	{
		Point loc = ele.getLocation();
		return loc;
	}
	public Rectangle getRec(WebElement ele)
	{
		Rectangle rec = ele.getRect();
		return rec;
	}
	public Dimension getS(WebElement ele)
	{
		Dimension size = ele.getSize();
		return size;
	}
	public String getTname(WebElement ele)
	{
		String tag = ele.getTagName();
		return tag;
	}
	public String getTxt(WebElement ele)
	{
		String txt = ele.getText();
		return txt;
	}
	public boolean isDis(WebElement ele)
	{
		boolean dis = ele.isDisplayed();
		return dis;
	}
	public boolean isEn(WebElement ele)
	{
		boolean en = ele.isEnabled();
		return en;
	}
	public boolean isSel(WebElement ele)
	{
		boolean sel = ele.isSelected();
		return sel;
	}
	public void clk(WebElement ele)
	{
		ele.click();
	}
	public void clr(WebElement ele)
	{
		ele.clear();
	}
	public void sndKey(WebElement element, CharSequence text)
	{
		element.sendKeys(text);
	}
}