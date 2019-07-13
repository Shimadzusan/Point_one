package excell;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.*;

public class First_excell {
	static int index = 0;

	public static void main(String[] args) throws IOException {
//		Workbook wb = new HSSFWorkbook();
//		Sheet sheet = wb.createSheet("mySheet");
		
//		FileOutputStream fos = new FileOutputStream("my.xls");
//		wb.write(fos);
//		fos.close();
		//alpha();
		
		/*
		  try (InputStream inp = new FileInputStream("my.xls")) {
		        HSSFWorkbook wb = new HSSFWorkbook(new POIFSFileSystem(inp));
		        ExcelExtractor extractor = new ExcelExtractor(wb);
		    
		        extractor.setFormulasNotResults(true);
		        extractor.setIncludeSheetNames(false);
		        String text = extractor.getText();
		        wb.close();
		        System.out.println(text);
		    }	
		  */
		
		//cell
		 // import org.apache.poi.ss.usermodel.*;

		InputStream inp = new FileInputStream("my.xls");
	        HSSFWorkbook wb = new HSSFWorkbook(new POIFSFileSystem(inp));
	        
	    DataFormatter formatter = new DataFormatter();
	    Sheet sheet1 = wb.getSheetAt(0);
	    String pars = "";
	    
	    for (Row row : sheet1) {
	        for (Cell cell : row) {
	            CellReference cellRef = new CellReference(row.getRowNum(), cell.getColumnIndex());
	            
	            pars = cellRef.formatAsString();
	            System.out.print(pars);
	            System.out.print(" - ");

	            // get the text that appears in the cell by getting the cell value and applying any data formats (Date, 0.00, 1.23e9, $1.23, etc)
//	            String text = formatter.formatCellValue(cell);
//	            System.out.println(text);

	            // Alternatively, get the value and format it yourself
	            switch (cell.getCellType()) {
	                case STRING:
	                    System.out.println(cell.getRichStringCellValue().getString());
	                    break;
	                case NUMERIC:
	                    if (DateUtil.isCellDateFormatted(cell)) {
	                        System.out.println(cell.getDateCellValue());
	                    } else {
	                        System.out.println(cell.getNumericCellValue());
	                    }
	                    break;
	                
	                default:
	                    System.out.println();
	            }
	            System.out.println(betta(pars));
	        }
	    }
	    System.out.println(index);
	    //here we get value how many rows has columns "A"
		
		

	}
	public static void alpha() throws IOException {
		// import org.apache.poi.ss.usermodel.*;
		Workbook wb = new HSSFWorkbook();
		Sheet sheet = wb.createSheet("mySheet");
		
	    DataFormatter formatter = new DataFormatter();
	    Sheet sheet1 = wb.getSheetAt(0);
	    for (Row row : sheet1) {
	        for (Cell cell1 : row) {
	            CellReference cellRef = new CellReference(row.getRowNum(), cell1.getColumnIndex());
	            System.out.print(cellRef.formatAsString());
	            System.out.print(" - ");

	            // get the text that appears in the cell by getting the cell value and applying any data formats (Date, 0.00, 1.23e9, $1.23, etc)
	            String text = formatter.formatCellValue(cell1);
	            System.out.println(text);

	            // Alternatively, get the value and format it yourself
	            switch (cell1.getCellType()) {
	                case STRING:
	                    System.out.println(cell1.getRichStringCellValue().getString());
	                    break;
	                case NUMERIC:
	                    if (DateUtil.isCellDateFormatted(cell1)) {
	                        System.out.println(cell1.getDateCellValue());
	                    } else {
	                        System.out.println(cell1.getNumericCellValue());
	                    }
	                    break;
	                case BOOLEAN:
	                    System.out.println(cell1.getBooleanCellValue());
	                    break;
	                case FORMULA:
	                    System.out.println(cell1.getCellFormula());
	                    break;
	                case BLANK:
	                    System.out.println();
	                    break;
	                default:
	                    System.out.println();
	            }
	        }
	    }
//		String result = "";
//		Cell.class
//		switch (cell.getCellType()) {
//		case Cell.CELL_TYPE_STRING: 
//		result = cell.getRichStringCellValue().getString();
//		break;
//		}
	    
	    FileOutputStream fos = new FileOutputStream("my.xls");
		wb.write(fos);
		fos.close();
		//return null;
		
	}
	
	public static String betta(String text) {
		if(text.contains("A")) {
			index++;
			return "yes";
		}
	
		else return "no";
	}

}
