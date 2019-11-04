package gen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritetoExcel {
	public static void links( int rownum,String dat, String sheet) throws EncryptedDocumentException, InvalidFormatException, IOException{
		
		FileInputStream fis = new FileInputStream("./excel/data.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet(sheet);
		
		Row r = sh.createRow(rownum);
		
		Cell c = r.createCell(0);
		
		c.setCellValue(dat);
		
		FileOutputStream fos = new FileOutputStream("./excel/data.xlsx");
		wb.write(fos);
	}
}
