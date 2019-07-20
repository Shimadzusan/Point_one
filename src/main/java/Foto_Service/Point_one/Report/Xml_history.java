package Foto_Service.Point_one.Report;

import java.io.IOException;

import Foto_Service.Point_one.Frame_day;
import Foto_Service.Point_one.Sortable;

public class Xml_history {
	//input: sort_day and day --> output: chiefs report(chief.txt)
		Sortable sort_day;
		Frame_day day;
		String address = "chief.txt";
		
		public Xml_history(Frame_day day,Sortable sort_day) throws IOException {
			this.day = day;
			this.sort_day = sort_day;
			
			commit_report();
			
			System.out.println("xml(for history) article added");
		}

		private void commit_report() {
			// TODO Auto-generated method stub
			
		}
}
