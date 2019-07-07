package Foto_Service.Point_one;

import java.io.IOException;
import java.util.ArrayList;

public class Launch {

	public static void main(String[] args) throws IOException {
		 System.out.println( "===Point_one===" );
//===============BETTA
		 Recognize recognize = new Recognize("C:\\Users\\Aleksey\\Desktop\\statement2.txt");

		 System.out.println("===BETTA===");
		 
//!*	 Facturable fact = recognize.get_day();
		 Deep_Recognize deep = new Deep_Recognize(recognize.get_day());
	}

}

class Deep_Recognize {
	
	Facturable facture;
	ArrayList deal_list;
	
	Deep_Recognize(Facturable facture) {
		this.facture = facture; 
		deal_list = (ArrayList<String>) facture.get_facture();
		
		balance();
	}
	
	public int balance() {
//общие поступления
		int income = 0;
		int payment = 0;
		System.out.println(deal_list.size());
		
			for(int i = 0; i < deal_list.size(); i++) {
				String s = (String)deal_list.get(i);
					if(s.contains("минус")) {
						//flag = true;
						payment += get_number((String)deal_list.get(i));
					}
				
					else {
						income += get_number((String)deal_list.get(i));
						//System.out.println(get_number((String)deal_list.get(i)));
					}
			}
			
		System.out.println("result income: " + income);
		System.out.println("result payment: " + payment);
		return 0;
	}
	
	public int payment() {
//платежи: ником, пульты и тд
		return 0;
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
