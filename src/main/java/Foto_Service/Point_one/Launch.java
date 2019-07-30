package Foto_Service.Point_one;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Foto_Service.Point_one.Report.Excell_chief_report;
import Foto_Service.Point_one.Report.Txt_chief_report;
import Foto_Service.Point_one.Report.Xml_history;

public class Launch {


	public static void main(String[] args) throws IOException {
		
//===============BETTA
		 Frame_day day = new Day(); 
		 Sortable sort_day = new Sort_day();
		 
		 Sortable sort_betta = new Sort_day();
		  

		 Recognize recognize = new Recognize("C:\\Users\\AMD WIN\\Desktop\\statement_x.txt", day);
//C:\Users\AMD WIN\Desktop 
//C:\\Users\\Aleksey\\Desktop\\statement.txt
		 
		 Deep_Recognize deep = new Deep_Recognize(day, sort_day);
		 
//console interface
//object_Day
		System.out.println( "===Point_one(object_Day)===" );
		System.out.println(day.get_date());
		System.out.println("begin_cash: " + day.get_begin_cash());
		System.out.println("end_cash: " + day.get_end_cash());
		System.out.println("total value of deals: " + day.get_facture().size());
//================
//object_Sort_day

		System.out.println("result income: " + sort_day.get_income());
		System.out.println("result payment: -" + sort_day.get_payment());
		
		System.out.println();
		System.out.println("(+Plus+)");
		System.out.println("online_income: from sber = " + sort_day.get_sber() + "; from tinkoff = " + 0 + "; from po4ta-bank = " + 0);

		System.out.println("income from nicom: " + sort_day.get_nicom());
		System.out.println("income from pults: " + sort_day.get_pults());

		System.out.println("фнд: " + sort_day.get_foto());
		System.out.println("копия: " + sort_day.get_copy());
		System.out.println("печать: " + sort_day.get_print());
		System.out.println("other: " + (sort_day.get_income() - sort_day.get_foto() - sort_day.get_copy() - sort_day.get_print() - sort_day.get_pults() - sort_day.get_nicom()));
		System.out.println("total **: " + (sort_day.get_foto() + sort_day.get_copy() + sort_day.get_print() + (sort_day.get_income() - sort_day.get_foto() - sort_day.get_copy() - sort_day.get_print() - sort_day.get_pults() - sort_day.get_nicom())));
		
		System.out.println();
		System.out.println("(-Minus-)");
		System.out.println("payment for nicom: -" + sort_day.get_nicom_minus());
		System.out.println("payment for pults: -" + sort_day.get_pults_minus());
		System.out.println("payment for baget: -" + sort_day.get_baget_minus());
		System.out.println("payment for fotolab: -" + sort_day.get_fotolab_minus());
		System.out.println("other: -" + (sort_day.get_payment() - sort_day.get_nicom_minus() - sort_day.get_pults_minus() - sort_day.get_baget_minus() - sort_day.get_fotolab_minus()));
		
		System.out.println();
		System.out.println("salary: " + day.get_salary());
		 
//=========Report
		 System.out.println();
		 System.out.println("=====reporting mode=====");
		 	//new Excell_chief_report();
		 	new Txt_chief_report( day, sort_day);
		 	new Xml_history( day, sort_day);
		 	System.out.println();
//Octavian_excell
		 	System.out.println("+===Point_one(object_Day(Betta))===+");
		 	
		 	System.out.println(day.get_date());
			System.out.println("begin_cash: " + day.get_begin_cash());
			System.out.println("end_cash: " + day.get_end_cash());
		 	
		 	
		 	
		 	if(sort_day.get_list_foto() instanceof List) {
		 	ArrayList list_foto = (ArrayList) sort_day.get_list_foto();
		 	//System.out.println(list_foto.size());
		 	
		 	}
		 	//ArrayList<Sring> list_three
		 	System.out.println("фнд: " + sort_day.get_list_foto());
	}

}

