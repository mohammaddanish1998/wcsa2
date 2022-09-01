package readDataFrome_Excel_B1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Data_1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		FileInputStream fis=new FileInputStream("./data/TestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis); // Make the file ready to read opration
		Sheet sh = wb.getSheet("Citytools");//Get to special sheet
		Row row = sh.getRow(4);//go the specific row
		Cell cell = row.getCell(0);// get the specific cell
		
		String data = cell.getStringCellValue();//read the data frome the cell
		System.out.println(data);//print the data 
		
	}
}
