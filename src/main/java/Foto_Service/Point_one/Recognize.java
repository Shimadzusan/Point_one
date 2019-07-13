package Foto_Service.Point_one;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Recognize {
	String address = "";
	String text = "";
	Frame_day day;
	List<String> day_facture;
	
	String[] day_list;
	
	Recognize(String address, Frame_day day) throws IOException {
		this.address = address;
		this.day = day;
		day_facture = new ArrayList();
		this.text = get_text();
		day_init();
		
//console interface 
		//System.out.println("====================");
		System.out.println( "===Point_one===" );
		System.out.println(day.get_date());
		//System.out.println("result:");
		System.out.println("begin_cash: " + day.get_begin_cash());
		System.out.println("end_cash: " + day.get_end_cash());
		System.out.println("salary: " + day.get_salary());  
		//System.out.println("====================");
		
		//System.out.println("facture size: " + day.get_facture().size());
		//delete
		day_facture = day.get_facture();
	}
	
	String get_text() throws IOException {
		FileInputStream fin = new FileInputStream(address);  
	        byte[] buffer = new byte[fin.available()];
	        	fin.read(buffer, 0, buffer.length);
	        		String s = new String(buffer, "Cp1251");
	        			return s;
	}
//begin day_init complex, this complex contains 3 methods
//==========================================================================================
	private void day_init() {
		
//***разделяем текст
		 day_list = text.split("\\r\\n"); //total notes for day (code 13 10 is new line)
		        
		  for(int i = 0; i < day_list.length; i++) {
	        	sort_kind(day_list[i]);
	        		//System.out.println(day_list[i]);
	        }
	}

	private void sort_kind(String element) {
		
//cash
		if(element.contains("касса")) {
			if(element.contains("утро")) day.set_begin_cash(get_number(element));
			if(element.contains("вечер")) day.set_end_cash(get_number(element));
			return;
		}
//date
		if(element.contains(".")) {
			day.set_date(element); 
			return;
		}
//salary
		if(element.contains("зп")) {
			day.set_salary(get_number(element));
			return;
		}			
//facture_surface
		day.set_facture(element);
	}
	
	private int get_number(String text) {
		char[] ch = text.toCharArray();
		String number = "";
			for(int i = 0; i < ch.length; i++) {
				if(Character.isDigit(ch[i]))number += "" + ch[i];
			}
			
	return Integer.parseInt(number);
	}
// end of day_init complex
//=========================================================================================
	
//	public Frame_day get_day() {
//		return this.day;
//	}
	
}
