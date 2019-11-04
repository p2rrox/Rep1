package gen;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Sel_gen {
	Select s;

	public Sel_gen(WebElement ele) {
		s = new Select(ele);
	}

	public void selInd(int i) {
		s.selectByIndex(i);
	}

	public void selVal(String stringval) {
		s.selectByValue(stringval);
	}

	public void selTxt(String text) {
		s.selectByVisibleText(text);
	}

	public void deselAll() {
		s.deselectAll();
	}

	public void deselInd(int i) {
		s.deselectByIndex(i);
	}

	public void deselVal(String val) {
		s.deselectByValue(val);
	}

	public void deselTxt(String txt) {
		s.deselectByVisibleText(txt);
	}

	public String getAllSel() {
		List<WebElement> opt = s.getAllSelectedOptions();
		String t = "";
		int c = opt.size();
		System.out.println(c);
		for (WebElement we : opt) {
			t = we.getText();
		}
		return t;
	}

	public String getFrstSel() {
		WebElement opt = s.getFirstSelectedOption();
		String t = opt.getText();
		return t;
	}

	public ArrayList<String> getOpt() {
		List<WebElement> opt = s.getOptions();
		String t = "";
		int c = opt.size();
		System.out.println(c);
		ArrayList<String> optTxt = new ArrayList<String>();
		for (WebElement we : opt) {
			t = we.getText();
			optTxt.add(t);
		}
		return optTxt;
	}

	public boolean isMul() {
		boolean is = s.isMultiple();
		return is;
	}
}