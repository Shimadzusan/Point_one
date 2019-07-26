package Foto_Service.Point_one;

import java.util.ArrayList;

public class Deep_Recognize {
	
	Facturable facture;
	Sortable sort_day;
	ArrayList deal_list;
	
	Deep_Recognize(Facturable facture, Sortable sort_day) {
		this.facture = facture;
		this.sort_day = sort_day;
		deal_list = (ArrayList<String>) facture.get_facture();

		balance();
	}
	
	public int balance() {
//общие поступления
//		int income = 0;
//		int payment = 0;
//		
//		int nicom = 0;
//		int pulti = 0;
//		int nicom_minus = 0;
//		int pulti_minus = 0;
//		
//		int sber = 0;
//		
//		int fnd = 0;
//		int copy = 0;
//		int print = 0;
//		
//		int baget_minus = 0;
//		int fotolab_minus = 0;
		
		
		
		
			for(int i = 0; i < deal_list.size(); i++) {
				String s = (String)deal_list.get(i);
					if(s.contains("минус")) {
						//payment += get_number((String)deal_list.get(i));
						sort_day.set_payment(sort_day.get_payment() + get_number((String)deal_list.get(i)));
						if(s.contains("ником")) sort_day.set_nicom_minus(sort_day.get_nicom_minus() + get_number((String)deal_list.get(i)));
						if(s.contains("пульты")) sort_day.set_pults_minus(sort_day.get_pults_minus() + get_number((String)deal_list.get(i)));
						if(s.contains("багет")) sort_day.set_baget_minus(sort_day.get_baget_minus() + get_number((String)deal_list.get(i)));
						if(s.contains("фотолаб")) sort_day.set_fotolab_minus(sort_day.get_fotolab_minus() + get_number((String)deal_list.get(i)));
					}
				
					else {
						//income += get_number((String)deal_list.get(i));
						sort_day.set_income(sort_day.get_income() + get_number((String)deal_list.get(i)));

						if(s.contains("ником")) sort_day.set_nicom(sort_day.get_nicom() + get_number((String)deal_list.get(i)));
						if(s.contains("пульты")) sort_day.set_pults(sort_day.get_pults() + get_number((String)deal_list.get(i)));
						if(s.contains("сбер")) sort_day.set_sber(sort_day.get_sber() + get_number((String)deal_list.get(i)));
						
						if(s.contains("фнд")) sort_day.set_foto(sort_day.get_foto() + get_number((String)deal_list.get(i)));
						if(s.contains("копия")) sort_day.set_copy(sort_day.get_copy() + get_number((String)deal_list.get(i)));
						if(s.contains("печать")) sort_day.set_print(sort_day.get_print() + get_number((String)deal_list.get(i)));
						
					}
			}
			
//		System.out.println("result income: " + income);
//		System.out.println("result payment: " + payment);
//		
//		System.out.println();
//		System.out.println("+Plus");
//		System.out.println("online_income: from sber = " + sber + "; from tinkoff = " + 0 + "; from po4ta-bank = " + 0);
//		//System.out.println();
//		System.out.println("income from nicom: " + nicom);
//		System.out.println("income from pulti: " + pulti);
		
//		System.out.println();
//		System.out.println("фнд: " + fnd);
//		System.out.println("копия: " + copy);
//		System.out.println("печать: " + print);
//		System.out.println("other: " + (income - fnd - copy - print - pulti - nicom));
//		System.out.println("total **: " + (fnd + copy + print + (income - fnd - copy - print - pulti - nicom)));
//***MINUS***
//		System.out.println();
//		System.out.println("(-Minus-)");
//		System.out.println("payment for nicom: -" + nicom_minus);
//		System.out.println("payment for pulti: -" + pulti_minus);
//		System.out.println("payment for baget: -" + baget_minus);
//		System.out.println("payment for fotolab: -" + fotolab_minus);
//		System.out.println("other: -" + (payment - nicom_minus - pulti_minus - baget_minus - fotolab_minus));
//		System.out.println();
		
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
