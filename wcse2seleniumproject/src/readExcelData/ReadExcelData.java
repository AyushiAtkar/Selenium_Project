package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//Provide the path of file
		Workbook wb = WorkbookFactory.create(fis);//make the file ready to read
		Sheet sheet = wb.getSheet("IPL");//get into the sheet
		Row row = sheet.getRow(0);//get desired row
		Cell cell = row.getCell(1);//get desired col/cell
		String data = cell.getStringCellValue();//read the data from cell
		System.out.println(data);//print the data
		Thread.sleep(2000);
		
		
		
	}

}
