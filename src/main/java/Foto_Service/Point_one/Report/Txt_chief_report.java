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
		int foto = 0;
		int copy = 0;
		int print = 0;
		
		int fotolab = 0;
		int baget = 0;
		int sphera = 0;
		
		int nicom = 0;
		int pults = 0;
		
		int other_two = 0;
		
		int card_data = 0;
		
//=======================================================complex for count largest array
		 try {
			 ArrayList<List> list_foto = (ArrayList<List>) sort_day.get_list_foto();
				foto = list_foto.size();
		       
		// в блок  catch заключаем код по обработке исключения IOException
		    } catch (NullPointerException e) {
		        foto = 0;
		// в блоке finally закрываем поток чтения
		    } 
		
		try {
		ArrayList<List> list_copy = (ArrayList<List>) sort_day.get_list_copy();
		copy = list_copy.size();
		} catch(NullPointerException e) {
			copy = 0;
		}
		
		try {
		ArrayList<List> list_print = (ArrayList<List>) sort_day.get_list_print();
	print = list_print.size();
		} catch(NullPointerException e) {
			print = 0;
		}
//========================next part===
		try {
			 ArrayList<List> list_fotolab = (ArrayList<List>) sort_day.get_list_fotolab();
				fotolab = list_fotolab.size();
				
		    } catch (NullPointerException e) {
		        fotolab = 0;
		    } 
		
		try {
		ArrayList<List> list_baget = (ArrayList<List>) sort_day.get_list_baget();
		baget = list_baget.size();
		} catch(NullPointerException e) {
			baget = 0;
		}
		
		try {
		ArrayList<List> list_sphera = (ArrayList<List>) sort_day.get_list_sphera();
	sphera = list_sphera.size();
		} catch(NullPointerException e) {
			sphera = 0;
		}
		
//======technic
		
		try {
			ArrayList<List> list_nicom = (ArrayList<List>) sort_day.get_list_nicom();
		nicom = list_nicom.size();
			} catch(NullPointerException e) {
				nicom = 0;
			}
		
		try {
			ArrayList<List> list_pults = (ArrayList<List>) sort_day.get_list_pults();
		pults = list_pults.size();
			} catch(NullPointerException e) {
				pults = 0;
			}
//================other====
		
		try {
			ArrayList<List> list_other = (ArrayList<List>) sort_day.get_list_other();
		other_two = list_other.size();
			} catch(NullPointerException e) {
				other_two = 0;
			}
//=================card========
		try {
			ArrayList<List> list_card_data = (ArrayList<List>) sort_day.get_list_card_data();
		card_data = list_card_data.size();
			} catch(NullPointerException e) {
				card_data = 0;
			}
		
//end===================================end	
		int largest_number = 0;
		//other
//--------------------------------------------------------------
		//find largest number! from arrays with parameters
		
		ArrayList<Integer> all_parameters = new ArrayList<Integer>();
		all_parameters.add(foto);
		all_parameters.add(copy);
		all_parameters.add(print);
		
		all_parameters.add(fotolab);
		all_parameters.add(baget);
		all_parameters.add(sphera);
		
		all_parameters.add(nicom);
		all_parameters.add(pults);
		
		all_parameters.add(other_two);
		
		all_parameters.add(card_data);
		
		
			for(int i = 0; i < all_parameters.size()-1; i++) {
				if(all_parameters.get(i) > all_parameters.get(i+1)) {
					all_parameters.set(i+1, all_parameters.get(i));
				}
				
			}
		largest_number = all_parameters.get(all_parameters.size() - 1);
		//System.out.println(largest_number);
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
					s = s + "дата" + "\t" + "фнд" + "\t" + "копия" + "\t" + "печать" + "\t" + "багет" + "\t" + "фотолаб" + "\t" + "сфера" + "\t" + "другое" + "\t" + "на карту" + "\t" + "за услугу" + 
					"\t" + "итого" + "\t" + "ником" + "\t" + "пульты" + "\t" + "всего" + "\t" + "зарплата" + "\t" + "касса утро" + "\t" + "касса вечер" + "\r\n";
					s = s + day.get_date() + "\t" + get_number(((ArrayList<String>) sort_day.get_list_foto()).get(i)) + 
					"\t" + get_number(((ArrayList<String>) sort_day.get_list_copy()).get(i)) +
					"\t" + get_number(((ArrayList<String>) sort_day.get_list_print()).get(i)) + 
					"\t" + get_number(((ArrayList<String>) sort_day.get_list_baget()).get(i)) +
					"\t" + get_number(((ArrayList<String>) sort_day.get_list_fotolab()).get(i)) +
					"\t" + get_number(((ArrayList<String>) sort_day.get_list_sphera()).get(i)) +
					"\t" + get_number(((ArrayList<String>) sort_day.get_list_other()).get(i)) +
					
					 "\t" + get_card(((ArrayList<String>) sort_day.get_list_card_data()).get(i)) +
					
					 "\t" + "" + total + "" +
					"\t" + get_number(((ArrayList<String>) sort_day.get_list_nicom()).get(i)) +
					"\t" + get_number(((ArrayList<String>) sort_day.get_list_pults()).get(i)) +
					"\t" + "" + sort_day.get_income()  + "" +
					"\t" + day.get_salary() + "\t" + day.get_begin_cash() + "\t" + day.get_end_cash()  + "\r\n";
				}
				
				if(i > 0) {
					s = s + " ";
					
						if(foto > i) {
							s = s + "\t" + get_number(((ArrayList<String>) sort_day.get_list_foto()).get(i));
						}
						else {
							s = s + "\t" + " ";
						}
						
						if(copy > i) {
							s = s + "\t" + get_number(((ArrayList<String>) sort_day.get_list_copy()).get(i));
						}
						else {
							s = s + "\t" + " ";
						}
						
						if(print > i) {
							s = s + "\t" + get_number(((ArrayList<String>) sort_day.get_list_print()).get(i));
						}
						else {
							s = s + "\t" + " ";
						}
						
						if(baget > i) {
							s = s + "\t" + get_number(((ArrayList<String>) sort_day.get_list_baget()).get(i));
						}
						else {
							s = s + "\t" + " ";
						}
						
						if(fotolab > i) {
							s = s + "\t" + get_number(((ArrayList<String>) sort_day.get_list_fotolab()).get(i));
						}
						else {
							s = s + "\t" + " ";
						}
						
						if(sphera > i) {
							s = s + "\t" + get_number(((ArrayList<String>) sort_day.get_list_sphera()).get(i));
						}
						else {
							s = s + "\t" + " ";
						}
						
						if(other_two > i) {
							s = s + "\t" + get_number(((ArrayList<String>) sort_day.get_list_other()).get(i));
						}
						else {
							s = s + "\t" + " ";
						}
						
						
						//for other
						//s = s + "\t" + " ";
						//for card_data
						if(card_data > i) {
							s = s + "\t" + get_card(((ArrayList<String>) sort_day.get_list_card_data()).get(i));
							//s = s + "\t" + get_number(((ArrayList<String>) sort_day.get_list_other()).get(i));
						}
						else {
							s = s + "\t" + " " + "\t" + " ";
						}
						
						
						s = s + "\t" + " ";
						
						if(nicom > i) {
							s = s + "\t" + get_number(((ArrayList<String>) sort_day.get_list_nicom()).get(i));
						}
						else {
							s = s + "\t" + " ";
						}
						
						if(pults > i) {
							s = s + "\t" + get_number(((ArrayList<String>) sort_day.get_list_pults()).get(i));
						}
						else {
							s = s + "\t" + " ";
						}
						
					s = s + "\t" + "\t" + " " + "\t" + " " + "\t" + " " + "\r\n";	
					
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
			int z = Integer.parseInt(number);
			
			if(text.contains("минус")) {
				z = 0 - z;
				//System.out.println(z);
			}
			
	return z;
	}
	
	private String get_card(String text) {
		char[] ch = text.toCharArray();
		String number = "";
		boolean flag_service = true;
		int index_service = 0;
			for(int i = 0; i < ch.length; i++) {
				if(Character.isDigit(ch[i])) { 
					number += "" + ch[i];
					
				if(flag_service == true) {
						index_service = i;
							flag_service = false;
						
					}
				}
			}
			String s = text.substring(0, index_service);
			int z = Integer.parseInt(number);
			//System.out.println("get_card: " + number + " " + s);
			String s2 = number + "\t" + s;
			
			
			
	return s2;
	}

}
