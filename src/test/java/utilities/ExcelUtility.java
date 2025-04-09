package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	private FileInputStream fi;
	private FileOutputStream fo;
	public Workbook workbook;
	public Sheet sheet;
	public Row row;
	public Cell cell;
	public CellStyle style;
	private String path;
	private String sheetName;

	public ExcelUtility(String path, String sheetName) throws IOException {
		 this.path = path;
		 
		 try {
	        fi = new FileInputStream(new File(path)); // Initialize fi here
	        workbook = WorkbookFactory.create(fi);
	        sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	
//	public HashMap<String, String> getTestDataInMap(int rowNum) throws EncryptedDocumentException, IOException {
//		
//		HashMap<String, String> hm = new HashMap<>();
//		
//		for(int i=0; i<sheet.getRow(0).getLastCellNum(); i++) {
//			
//			sheet.getRow(rowNum).getCell(i).setCellType(CellType.STRING);
//			hm.put(sheet.getRow(0).getCell(i).toString(), sheet.getRow(rowNum).getCell(i).toString());			
//		}
//		
//		return hm;		
//	}
	
	public HashMap<String, String> getTestDataInMap(int rowNum) throws EncryptedDocumentException, IOException {
		
		  HashMap<String, String> hm = new HashMap<>();
		  
		  Row row = sheet.getRow(rowNum);
		  
		  if (row!= null) { // Check if row exists
		    for (int i = 0; i < sheet.getRow(0).getLastCellNum(); i++) {
		  
		      Cell currentCell = row.getCell(i);
		      if (currentCell != null) { // Check if cell exists
		        currentCell.setCellType(CellType.STRING);
		        hm.put(sheet.getRow(0).getCell(i).toString(), currentCell.toString());
		      }
		    }
		  }
		  return hm;
		}
	

	public int getRowCount(String sheetName) {

		int rowcount = sheet.getLastRowNum();

		//fi.close();
		return rowcount;
	}

	public int getCellCount(String sheetName, int rownum) throws IOException {
		row = sheet.getRow(rownum);
		int cellcount = row.getLastCellNum();
		workbook.close();
		//fi.close();
		return cellcount;
	}

	public Object getCellData(int rownum, int colnum) throws IOException {

		DataFormatter formatter = new DataFormatter();
		String value = formatter.formatCellValue(sheet.getRow(rownum).getCell(colnum));
		return value;
	}


//	public void setCellData(String sheetName, int rownum, int colnum, String data) throws IOException {
//
//		if (!xlfile.exists()) // If file not exists then create new file
//		{
//			workbook = new XSSFWorkbook();
//			fo = new FileOutputStream(path);
//			workbook.write(fo);
//		}
//
//		fi = new FileInputStream(path);
//		workbook = new XSSFWorkbook(fi);
//
//		if (workbook.getSheetIndex(sheetName) == -1) // If sheet not exists then create new Sheet
//			// workbook.createSheet(sheetName);
//			sheet = workbook.getSheet(sheetName);
//
//		if (sheet.getRow(rownum) == null) // If row not exists then create new Row
//			// sheet.createRow(rownum);
//			row = sheet.getRow(rownum);
//		cell = row.createCell(colnum);
//		cell.setCellValue(data);
//		fo = new FileOutputStream(path);
//		workbook.write(fo);
//		workbook.close();
//		fi.close();
//		fo.close();
//	}

}
