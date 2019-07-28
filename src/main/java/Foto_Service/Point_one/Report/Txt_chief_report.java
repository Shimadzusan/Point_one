package Foto_Service.Point_one.Report;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
//----------------------------------------------------------------end so all another 17 array 		
		int date = 0;
		int begin_cash = 0;
		int end_cash = 0;
		ArrayList<List> list_foto = (ArrayList<List>) sort_day.get_list_foto();
		int foto = list_foto.size();
		ArrayList<List> list_copy = (ArrayList<List>) sort_day.get_list_copy();
		int copy = list_copy.size();
		ArrayList<List> list_print = (ArrayList<List>) sort_day.get_list_print();
		int print = list_print.size();
		int largest_number = 0;
		//other
//--------------------------------------------------------------
		//find largest number! from arrays with parameters
		
		ArrayList<Integer> all_parameters = new ArrayList<Integer>();
		all_parameters.add(foto);
		all_parameters.add(copy);
		all_parameters.add(print);
		
			for(int i = 0; i < all_parameters.size()-1; i++) {
				if(all_parameters.get(i) > all_parameters.get(i+1)) {
					all_parameters.set(i+1, all_parameters.get(i));
				}
				
			}
		largest_number = all_parameters.get(all_parameters.size() - 1);
		System.out.println(largest_number);
//---------------------------------------------------------------end
		FileInputStream fin = new FileInputStream(address);
	
			byte[] buffer = new byte[fin.available()];
		        fin.read(buffer, 0, buffer.length);
		        	String s = new String(buffer, "utf-8");
		        		//System.out.println(s.length());
		        			fin.close();
		        			
		FileOutputStream fos = new FileOutputStream(address);
			
//String build complex (!!!)		
			for(int i = 0; i < largest_number; i++ ) {
				if(i == 0) {
					s = s + " " + "\r\n"; 
					s = s + "дата" + "\t" + "фнд" + "\t" + "копия" + "\t" + "печать" + "\t" + "касса утро" + "\t" + "касса вечер" + "\r\n";
					s = s + day.get_date() + "\t" + get_number(((ArrayList<String>) sort_day.get_list_foto()).get(i)) + 
					"\t" + get_number(((ArrayList<String>) sort_day.get_list_copy()).get(i)) +
					"\t" + get_number(((ArrayList<String>) sort_day.get_list_print()).get(i)) + "\t" + day.get_begin_cash() + "\t" + day.get_end_cash()  + "\r\n";
				}
				
				if(i > 0) {
					s = s + "A";
					
						if(foto > i) {
							s = s + "\t" + get_number(((ArrayList<String>) sort_day.get_list_foto()).get(i));
						}
						else {
							s = s + "\t" + "B";
						}
						
						if(copy > i) {
							s = s + "\t" + get_number(((ArrayList<String>) sort_day.get_list_copy()).get(i));
						}
						else {
							s = s + "\t" + "C";
						}
						
						if(print > i) {
							s = s + "\t" + get_number(((ArrayList<String>) sort_day.get_list_print()).get(i));
						}
						else {
							s = s + "\t" + "D";
						}
						
					s = s + "\t" + "E" + "\t" + "F" + "\r\n";	
				}
				
			}
		      //String s2 = "дата" + "\t" + "фнд" + "\t" + "печать" + "\t" + "копия" + "\t" + "другое" + "\t" + "итого" + "\r\n";  			
			String s2 = s;
		        byte[] buffer2 = s2.getBytes();
		        	fos.write(buffer2, 0, buffer2.length);
		
		        	fos.close();
	}
	
	private int get_number(String text) {
		char[] ch = text.toCharArray();
		String number = "";
			for(int i = 0; i < ch.length; i++) {
				if(Character.isDigit(ch[i]))number += "" + ch[i];
			}
			
	return Integer.parseInt(number);
	}

}
