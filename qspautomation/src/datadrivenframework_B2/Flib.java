package datadrivenframework_B2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	// generic reusable method read data from excel
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;
	}
	
	// generic reusable method to get the row count frome excel File
	public int getRowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rc = sh.getLastRowNum();
		return rc;	
	}
	
	// generic reusable method to write the data from excel file
	public void writeExcelData(String excelPath, String sheetName, int rowCount, int cellCount, String Data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);//make ready to read file operation
		Sheet sh = wb.getSheet(sheetName);// go to specified sheet
		Row row = sh.getRow(rowCount);// go to specified row
		
		Cell cell = row.createCell(cellCount);// create cell
		cell.setCellValue(Data); //send the data
		
		FileOutputStream fos = new FileOutputStream(excelPath);// specified path of excel file
		wb.write(fos);	// write the data 
	}
}
