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
		ArrayList<String> list_foto;
		ArrayList<String> list_copy;
		ArrayList<String> list_print;
		
		ArrayList<String> list_fotolab;
		ArrayList<String> list_baget;
		ArrayList<String> list_sphera;
		
		ArrayList<String> list_nicom;
		ArrayList<String> list_pults;
		
		
		
		
			for(int i = 0; i < deal_list.size(); i++) {
				String s = (String)deal_list.get(i);
//=======================================================================================
		if(s.contains("фотолаб")) {
			if(sort_day.get_list_fotolab() != null) {
				list_fotolab = (ArrayList<String>) sort_day.get_list_fotolab();
				list_fotolab.add(s);
			 
				sort_day.set_list_fotolab(list_fotolab);

			}
			else {
				list_fotolab = new ArrayList<String>();
				list_fotolab.add(s);
				sort_day.set_list_fotolab(list_fotolab);
			}
		}
		
		if(s.contains("багет")) {
			if(sort_day.get_list_baget() != null) {
				list_baget = (ArrayList<String>) sort_day.get_list_baget();
				list_baget.add(s);
			 
				sort_day.set_list_baget(list_baget);

			}
			else {
				list_baget = new ArrayList<String>();
				list_baget.add(s);
				sort_day.set_list_baget(list_baget);
			}
		}
		
		if(s.contains("сфера")) {
			if(sort_day.get_list_sphera() != null) {
				list_sphera = (ArrayList<String>) sort_day.get_list_sphera();
				list_sphera.add(s);
			 
				sort_day.set_list_sphera(list_sphera);

			}
			else {
				list_sphera = new ArrayList<String>();
				list_sphera.add(s);
				sort_day.set_list_sphera(list_sphera);
			}
		}
		
//technic
		if(s.contains("ником")) {
			if(sort_day.get_list_nicom() != null) {
				list_nicom = (ArrayList<String>) sort_day.get_list_nicom();
				list_nicom.add(s);
			 
				sort_day.set_list_nicom(list_nicom);

			}
			else {
				list_nicom = new ArrayList<String>();
				list_nicom.add(s);
				sort_day.set_list_nicom(list_nicom);
			}
		}
		
		if(s.contains("пульты")) {
			if(sort_day.get_list_pults() != null) {
				list_pults = (ArrayList<String>) sort_day.get_list_pults();
				list_pults.add(s);
			 
				sort_day.set_list_pults(list_pults);

			}
			else {
				list_pults = new ArrayList<String>();
				list_pults.add(s);
				sort_day.set_list_pults(list_pults);
			}
		}
		
		
				
//=======================================================================================
				
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
						
						if(s.contains("фнд")) {
							sort_day.set_foto(sort_day.get_foto() + get_number((String)deal_list.get(i)));
							
								if(sort_day.get_list_foto() != null) {
									list_foto = (ArrayList<String>) sort_day.get_list_foto();
									list_foto.add(s);
								 
									sort_day.set_list_foto(list_foto);
		
								}
								else {
									list_foto = new ArrayList<String>();
									list_foto.add(s);
									sort_day.set_list_foto(list_foto);
								}
						}
						
						
						
						
						if(s.contains("копия")) {
							sort_day.set_copy(sort_day.get_copy() + get_number((String)deal_list.get(i)));
							if(sort_day.get_list_copy() != null) {
								list_copy = (ArrayList<String>) sort_day.get_list_copy();
								list_copy.add(s);
								sort_day.set_list_copy(list_copy);
							}
							else {
								list_copy = new ArrayList<String>();
								list_copy.add(s);
								sort_day.set_list_copy(list_copy);
							}
						}
						
						if(s.contains("печать")) {
							sort_day.set_print(sort_day.get_print() + get_number((String)deal_list.get(i)));
							if(sort_day.get_list_print() != null) {
								list_print = (ArrayList<String>) sort_day.get_list_print();
								list_print.add(s);
								sort_day.set_list_print(list_print);
							}
							else {
								list_print = new ArrayList<String>();
								list_print.add(s);
								sort_day.set_list_print(list_print);
							}
						}
						
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
