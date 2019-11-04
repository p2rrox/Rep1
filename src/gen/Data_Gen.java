package gen;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_Gen {

	
	public static String getData(String sheetName, int row, int col) throws EncryptedDocumentException, InvalidFormatException, IOException{
		FileInputStream fis = new FileInputStream("./excel/data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row r = sh.getRow(row);
		Cell c = r.getCell(col);
		String val = c.toString();
		
		return val;
	}
}
