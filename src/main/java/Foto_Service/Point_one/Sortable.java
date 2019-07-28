package Foto_Service.Point_one;

public interface Sortable <Ge> extends Facturable{
	
	void set_list_foto(Ge id);
	public Ge get_list_foto();
	
	void set_list_copy(Ge id);
	public Ge get_list_copy();
	
	void set_list_print(Ge id);
	public Ge get_list_print();
	 
	
//==========================================
	public void set_income(int income);
	 public int get_income();
	    
	 public void set_payment(int payment);
	 public int get_payment();
	 
	 public void set_sber(int sber);
	 public int get_sber();
	    
	 public void set_nicom(int nicom);
	 public int get_nicom();
	 
	 public void set_pults(int pults);
	 public int get_pults();
	 
	 public void set_foto(int foto);
	 public int get_foto();
	    
	 public void set_copy(int copy);
	 public int get_copy();
	 
	 public void set_print(int print);
	 public int get_print();
	 
//===minus===
	 
	 public void set_nicom_minus(int nicom_minus);
	 public int get_nicom_minus();
	 
	 public void set_pults_minus(int pults_minus);
	 public int get_pults_minus();
	 
	 public void set_baget_minus(int baget_minus);
	 public int get_baget_minus();
	 
	 public void set_fotolab_minus(int fotolab_minus);
	 public int get_fotolab_minus();
	
	
}
