package Foto_Service.Point_one;

import java.io.IOException;
import java.util.ArrayList;

public class Launch {

	public static void main(String[] args) throws IOException {
		 System.out.println( "===Point_one===" );
//===============BETTA
		 Recognize recognize = new Recognize("C:\\Users\\Aleksey\\Desktop\\statement.txt");
		 System.out.println();
		 System.out.println("   ===BETTA===");
		 
//!*	 Facturable fact = recognize.get_day();
		 Deep_Recognize deep = new Deep_Recognize(recognize.get_day());
	}

}

