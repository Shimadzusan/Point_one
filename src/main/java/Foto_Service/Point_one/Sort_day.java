package Foto_Service.Point_one;

import java.util.ArrayList;
import java.util.List;

public class Sort_day <Ge> implements Sortable {
	
	int income, payment, sber, nicom, pults, copy, print,
	nicom_minus, pults_minus, baget_minus, fotolab_minus, foto;
	
	ArrayList<String> list;
//===========================================================	
	Ge list_foto, list_copy, list_print, list_baget, list_fotolab, list_sphera, list_nicom, list_pults, list_other, list_card_data;
	
//	public void set_generic(G generic) {
//        this.generic =  generic;
//    }
//	
//	public <G> G get_generic() {
//		//if(value instanceof Integer)System.out.println("true");;
//		return (G) this.generic;
//		
//	}
//==========================================================
	Sort_day() {
		ArrayList<String> foto = new ArrayList<String>();
		foto.add("0");
		this.list_foto = (Ge) foto;
		
		ArrayList<String> copy = new ArrayList<String>();
		copy.add("0");
		this.list_copy = (Ge) copy;
		
		ArrayList<String> print = new ArrayList<String>();
		print.add("0");
		this.list_print = (Ge) print;
		
		ArrayList<String> baget = new ArrayList<String>();
		baget.add("0");
		this.list_baget = (Ge) baget;
		
		ArrayList<String> fotolab = new ArrayList<String>();
		fotolab.add("0");
		this.list_fotolab = (Ge) fotolab;
		
		ArrayList<String> sphera = new ArrayList<String>();
		sphera.add("0");
		this.list_sphera = (Ge) sphera;
		
		ArrayList<String> nicom = new ArrayList<String>();
		nicom.add("0");
		this.list_nicom = (Ge) nicom;
		
		ArrayList<String> pults = new ArrayList<String>();
		pults.add("0");
		this.list_pults = (Ge) pults;
		
		ArrayList<String> other = new ArrayList<String>();
		other.add("0");
		this.list_other = (Ge) other;
		
		
		ArrayList<String> card_data = new ArrayList<String>();
		card_data.add("0");
		this.list_card_data = (Ge) card_data;
		
	}
	@Override
	public List<String> get_facture() {
		
		return null;
	}
	
	 	public void set_income(int income) {
	        this.income = income;
	    }
	    
	    public int get_income() {
	        return this.income;
	    }
	    
	    public void set_payment(int payment) {
	        this.payment = payment;
	    }
	    
	    public int get_payment() {
	        return this.payment;
	    }

		@Override
		public void set_sber(int sber) {
			this.sber = sber;
		}

		@Override
		public int get_sber() {
			return this.sber;
		}

		@Override
		public void set_nicom(int nicom) {
			this.nicom = nicom;
			
		}

		@Override
		public int get_nicom() {
			return this.nicom;
		}

		@Override
		public void set_pults(int pults) {
			this.pults = pults;
		}

		@Override
		public int get_pults() {
			return this.pults;
		}

		

		@Override
		public  int get_foto() {
			return this.foto;
		}

		@Override
		public void set_copy(int copy) {
			this.copy = copy;
		}

		@Override
		public int get_copy() {
			return this.copy;
		}

		@Override
		public void set_print(int print) {
			this.print = print;
		}

		@Override
		public int get_print() {
			return this.print;
		}
		
//=====minus=====
		
		@Override
		public void set_nicom_minus(int nicom_minus) {
		this.nicom_minus = nicom_minus;	
		}

		@Override
		public int get_nicom_minus() {
			return this.nicom_minus;
		}

		@Override
		public void set_pults_minus(int pults_minus) {
			this.pults_minus = pults_minus;
		}

		@Override
		public int get_pults_minus() {
			return this.pults_minus;
		}

		@Override
		public void set_baget_minus(int baget_minus) {
			this.baget_minus = baget_minus;
		}

		@Override
		public int get_baget_minus() {
			return this.baget_minus;
		}

		@Override
		public void set_fotolab_minus(int fotolab_minus) {
			this.fotolab_minus = fotolab_minus;
		}

		@Override
		public int get_fotolab_minus() {
			return this.fotolab_minus;
		}

		public  void set_foto(int foto) {
			this.foto = foto;
			
		}
//==============generic stage=====================
		@Override
		public Ge get_list_foto() {
			return this.list_foto;
		}

		@Override
		public void set_list_foto(Object list_foto) {
			this.list_foto = (Ge) list_foto;
			
		}

		@Override
		public void set_list_copy(Object list_copy) {
			this.list_copy = (Ge) list_copy;
		}

		@Override
		public Ge get_list_copy() {
			return this.list_copy;
		}

		@Override
		public void set_list_print(Object list_print) {
			this.list_print = (Ge) list_print;
		}

		@Override
		public Ge get_list_print() {
			return this.list_print;
		}
		
//====================================================
		@Override
		public void set_list_baget(Object list_baget) {
			this.list_baget = (Ge) list_baget;
			
		}
		@Override
		public Object get_list_baget() {
			return this.list_baget;
		}
		@Override
		public void set_list_fotolab(Object list_fotolab) {
			this.list_fotolab = (Ge) list_fotolab;
		}
		@Override
		public Object get_list_fotolab() {
			return this.list_fotolab;
		}
		@Override
		public void set_list_sphera(Object list_sphera) {
			this.list_sphera = (Ge) list_sphera;
		}
		@Override
		public Object get_list_sphera() {
			return this.list_sphera;
		}
		
//====technic
		@Override
		public void set_list_nicom(Object list_nicom) {
			this.list_nicom = (Ge) list_nicom;
		}
		@Override
		public Object get_list_nicom() {
			return this.list_nicom;
		}
		@Override
		public void set_list_pults(Object list_pults) {
			this.list_pults = (Ge) list_pults;
			
		}
		@Override
		public Object get_list_pults() {
			return this.list_pults;
		}
		
		@Override
		public void set_list_other(Object list_other) {
			this.list_other = (Ge) list_other;
		}
		@Override
		public Object get_list_other() {
			return this.list_other;
		}
		@Override
		public void set_list_card_data(Object list_card_data) {
			this.list_card_data = (Ge) list_card_data;
		}
		@Override
		public Object get_list_card_data() {
			return this.list_card_data;
		}

}
