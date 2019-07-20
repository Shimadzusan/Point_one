package Foto_Service.Point_one.Report;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//import Foto_Service.Point_one.*;
 
public class Excell_chief_report {
	int index = 0;
	public Excell_chief_report() throws IOException {
		System.out.println("..report");
		//System.out.println("rows A: " + count_rows_a());
		write();
		
	}
	
//complex "count_rows_a" contains 2 method=============================================================
	public int count_rows_a() throws IOException {
//here we get value how many rows has columns "A"
		InputStream inp = new FileInputStream("chief.xls");
        HSSFWorkbook wb = new HSSFWorkbook(new POIFSFileSystem(inp));
        
		    DataFormatter formatter = new DataFormatter();
		    Sheet sheet1 = wb.getSheetAt(0);
    
			    for (Row row : sheet1) {
			        for (Cell cell : row) {
			            CellReference cellRef = new CellReference(row.getRowNum(), cell.getColumnIndex());
			            
			            if(cellRef.formatAsString().contains("A")) index++;
			        }
			    }
			    inp.close();
			    wb.close();
			    	return index;
	}
	
	public void write() throws IOException {
		System.out.println("...write");
		Workbook wb = new HSSFWorkbook();
		Sheet sheet0 = wb.createSheet();
		Row row = sheet0.createRow(11);
		Cell cell = row.createCell(11);
		cell.setCellValue("vega");
		cell.setCellValue(cell.getStringCellValue()+ "text");
		
		FileOutputStream fos = new FileOutputStream("chief.xls");
		wb.write(fos);
		fos.close();
		
//		 try (InputStream inp = new FileInputStream("chief.xls")) {
//			    //InputStream inp = new FileInputStream("workbook.xlsx");
//			 Workbook wb = new HSSFWorkbook();
//			       // Workbook wb = WorkbookFactory.create(inp);
//			        Sheet sheet = wb.getSheetAt(0);
//			        Row row = sheet.getRow(2);
//			        Cell cell = row.getCell(3);
//			        if (cell == null)
//			            cell = row.createCell(3);
//			        cell.setCellType(CellType.STRING);
//			        cell.setCellValue("a test");
//			    System.out.println("+++++");
//			        // Write the output to a file
////			        try (OutputStream fileOut = new FileOutputStream("chief.xls")) {
////			            wb.write(fileOut);
////			        }
			    }
		
		
	}

class Report2 {
	String excell_chief_report;
	String xml_logging;
	String sql_data_base;
	
	Report2() {
		
	}
}



