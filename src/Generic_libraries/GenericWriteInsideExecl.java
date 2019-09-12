package Generic_libraries;

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

public class GenericWriteInsideExecl {

	public static void writeDataInExcel(String sheet, int row,int cell, String data ) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		
		FileInputStream fis=new FileInputStream("./Exl/Excel1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheet);
		Row r=sh.createRow(row);
		Cell c=r.createCell(cell);
		c.setCellValue(data);
		FileOutputStream fos=new FileOutputStream("./Exl/Excel2.xlsx");
		wb.write(fos);
		wb.close();

	}

}
