package Foto_Service.Point_one;

import java.io.IOException;
import java.util.ArrayList;

import Foto_Service.Point_one.Report.Excell_chief_report;

public class Launch {

	public static void main(String[] args) throws IOException {
		
//===============BETTA
		 Frame_day day = new Day();
		 Sortable sort_day = new Sort_day();
		 
		 Recognize recognize = new Recognize("C:\\Users\\AMD WIN\\Desktop\\statement.txt", day);
		 //C:\Users\AMD WIN\Desktop 
		 //C:\\Users\\Aleksey\\Desktop\\statement.txt
		 System.out.println();
		 System.out.println("   ===BETTA===");
		 

		 Deep_Recognize deep = new Deep_Recognize(day);

//=========Report
		 System.out.println();
		 System.out.println("=====reporting mode=====");
		 	new Excell_chief_report();
		 	//System.out.println("! " + day.get_begin_cash());
	}

}

