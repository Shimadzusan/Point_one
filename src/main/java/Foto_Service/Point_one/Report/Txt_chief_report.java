package Foto_Service.Point_one.Report;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import Foto_Service.Point_one.Frame_day;
import Foto_Service.Point_one.Sortable;

public class Txt_chief_report {
//input: sort_day and day --> output: chiefs report(chief.txt)
	Sortable sort_day;
	Frame_day day;
	String address = "chief.txt";
	
	public Txt_chief_report(Frame_day day,Sortable sort_day) throws IOException {
		this.day = day;
		this.sort_day = sort_day;
		
		commit_report();
		
		System.out.println("txt(for excell) report committed");
	}
	
	void commit_report() throws IOException{
		int other = sort_day.get_income() - sort_day.get_foto() - sort_day.get_copy() - sort_day.get_print() - sort_day.get_pults() - sort_day.get_nicom();
		int total = sort_day.get_foto() + sort_day.get_copy() + sort_day.get_print() + (sort_day.get_income() - sort_day.get_foto() - sort_day.get_copy() - sort_day.get_print() - sort_day.get_pults() - sort_day.get_nicom());
		
		FileInputStream fin = new FileInputStream(address);
	
			byte[] buffer = new byte[fin.available()];
		        fin.read(buffer, 0, buffer.length);
		        	String s = new String(buffer, "utf-8");
		        		//System.out.println(s.length());
		        			fin.close();
		        			
		FileOutputStream fos = new FileOutputStream(address);
		      //String s2 = "дата" + "\t" + "фнд" + "\t" + "печать" + "\t" + "копия" + "\t" + "другое" + "\t" + "итого" + "\r\n";  			
			String s2 = s + day.get_date() + "\t" + sort_day.get_foto() + "\t" + sort_day.get_print() +"\t" + sort_day.get_copy() + "\t" + other + "\t" + total + "\r\n";
		        byte[] buffer2 = s2.getBytes();
		        	fos.write(buffer2, 0, buffer2.length);
		
		        	fos.close();
	}

}
