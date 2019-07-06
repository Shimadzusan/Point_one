package Foto_Service.Point_one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class A {

	public static void main(String[] args) throws IOException {
		 System.out.println( "===Point_one===" );
		 	new Recognize();
//		Day day = new Day();
//		day.set_date(5);
//		System.out.println(day.get_date());
	}

}

class Recognize {
	String text = "";
	Day day;
	List<String> day_facture;
	
	Recognize() throws IOException {
		//System.out.println("R");
		day = new Day();
		day_facture = new ArrayList();
		this.text = get_text();
		
		//day.set_date(50); 
		System.out.println("====================");
		System.out.println(day.get_date());
		System.out.println("result:");
		System.out.println("begin_cash: " + day.get_begin_cash());
		System.out.println("end_cash: " + day.get_end_cash());
		System.out.println("salary: " + day.get_salary());  
		System.out.println("====================");
		
		
		//System.out.println("-----------------------");
		System.out.println("facture size: " + day.get_facture().size());
		
       
	}
	
	String get_text() throws IOException {
		FileInputStream fin=new FileInputStream("C:\\Users\\AMD WIN\\Desktop\\statement.txt");  
        
        byte[] buffer = new byte[fin.available()];
        	fin.read(buffer, 0, buffer.length);
        		String s = new String(buffer, "Cp1251");
        //System.out.println(s);
        
//***разделяем текст
        //System.out.println("*************");
        String[] day_list = s.split("\\r\\n"); //total notes for day
        
        
        for(int i = 0; i < day_list.length; i++) {
        	sort_kind(day_list[i]);
        	System.out.println(day_list[i]);
        }
     
        
        
 // code 13 10 is new line  
//        for(int i = 0; i < buffer.length; i++) {
//        	System.out.println(buffer[i]);
//        }
		return s;
	}

	private void sort_kind(String element) {
		//Day day = new Day();
		//if(element.equals("фнд 250")) day.set_date(day.get_date() + 1);
		
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
						day.set_salary(Integer.parseInt(number));
					return;
				}
				
//***********************************************************facture
		day.set_facture(element);
		
	}
}