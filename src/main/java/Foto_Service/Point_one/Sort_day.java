package Foto_Service.Point_one;

import java.util.ArrayList;
import java.util.List;

public class Sort_day implements Sortable {
	
	int income, payment, sber, nicom, pults, foto, copy, print,
	nicom_minus, pults_minus, baget_minus, fotolab_minus;
	
	ArrayList<String> list;

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
		public void set_foto(int foto) {
			this.foto = foto;
			
		}

		@Override
		public int get_foto() {
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

}
