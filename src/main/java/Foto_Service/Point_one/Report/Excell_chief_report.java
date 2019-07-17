package Foto_Service.Point_one.Report;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

//import Foto_Service.Point_one.*;
 
public class Excell_chief_report {
	int index = 0;
	public Excell_chief_report() throws IOException {
		System.out.println("..report");
		System.out.println("rows A: " + count_rows_a());
		
		
	}
	
//complex "count_rows_a" contains 2 method
	public int count_rows_a() throws IOException {
		InputStream inp = new FileInputStream("chief.xls");
        HSSFWorkbook wb = new HSSFWorkbook(new POIFSFileSystem(inp));
        
    DataFormatter formatter = new DataFormatter();
    Sheet sheet1 = wb.getSheetAt(0);
    String pars = "";
    
    for (Row row : sheet1) {
        for (Cell cell : row) {
            CellReference cellRef = new CellReference(row.getRowNum(), cell.getColumnIndex());
            
            pars = cellRef.formatAsString();
//            System.out.print(pars);
//            System.out.print(" - ");

            // get the text that appears in the cell by getting the cell value and applying any data formats (Date, 0.00, 1.23e9, $1.23, etc)
//            String text = formatter.formatCellValue(cell);
//            System.out.println(text);

            // Alternatively, get the value and format it yourself
            switch (cell.getCellType()) {
                case STRING:
                    //System.out.println(cell.getRichStringCellValue().getString());
                    break;
                case NUMERIC:
                    if (DateUtil.isCellDateFormatted(cell)) {
                       // System.out.println(cell.getDateCellValue());
                    } else {
                        //System.out.println(cell.getNumericCellValue());
                    }
                    break;
                
                default:
                    //System.out.println();
            }
            betta(pars);
        }
    }
   // System.out.println(index);
    //here we get value how many rows has columns "A"
		return index;
	}
	
	public String betta(String text) {
		if(text.contains("A")) {
			index++;
			return "yes";
		}
	
		else return "no";
	}
//end complex "count_rows_a"

}


class Report2 {
	String excell_chief_report;
	String xml_logging;
	String sql_data_base;
	
	Report2() {
		
	}
}

