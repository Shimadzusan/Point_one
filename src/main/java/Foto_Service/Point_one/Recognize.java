package Foto_Service.Point_one;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Recognize {
	String text = "";
	Day day;
	List<String> day_facture;
	
	Recognize(Day day) throws IOException {
		this.day = day;
		day_facture = new ArrayList<String>();
		this.text = get_text();
		
		System.out.println("====================");
		System.out.println(day.get_date());
		System.out.println("result:");
		System.out.println("begin_cash: " + day.get_begin_cash());
		System.out.println("end_cash: " + day.get_end_cash());
		System.out.println("salary: " + day.getSalary());  
		System.out.println("====================");
		System.out.println("facture size: " + day.get_facture().size()); 
	}
	
	String get_text() throws IOException {
		FileInputStream fin=new FileInputStream("C:\\Users\\user\\Desktop\\statement.txt");  
        byte[] buffer = new byte[fin.available()];
        	fin.read(buffer, 0, buffer.length);
        		String s = new String(buffer, "utf-8");
        
//***разделяем текст
        String[] day_list = s.split("\\r\\n"); //total notes for day
	        for(int i = 0; i < day_list.length; i++) {
	        	sort_kind(day_list[i]);
	        	System.out.println(day_list[i]);
	        }
	        
		return s;
	}

	private void sort_kind(String element) {	//..initialization object <Day>
//**********************************************************CASH
		if(element.contains("касса")) {
			char[] ch = element.toCharArray();
			String number = "";
				for(int i = 0; i < ch.length; i++) {
					if(Character.isDigit(ch[i]))number += "" + ch[i];
				}
			
			if(element.contains("утро")) day.set_begin_cash(Integer.parseInt(number));
			if(element.contains("вечер")) day.set_end_cash(Integer.parseInt(number));
			return;
		}
//***********************************************************DATE
		if(element.contains(".")) {
			day.set_date(element); 
			return;
		}
//***********************************************************Salary
		if(element.contains("зп")) {
			char[] ch = element.toCharArray();
			String number = "";
				for(int i = 0; i < ch.length; i++) {
					if(Character.isDigit(ch[i]))number += "" + ch[i];
				}
			day.setSalary(Integer.parseInt(number));
		return;
		}		
//***********************************************************facture
		day.set_facture(element);
	}
}