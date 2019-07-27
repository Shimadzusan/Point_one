package Foto_Service.Point_one.Report;

import java.util.ArrayList;
import java.util.List;

public class Alpha {

	public static void main(String[] args) {
		int[] array = new int[16];
		Betta betta = new Betta();
		ArrayList list = new ArrayList();
		
		
		
		list.add("asd");
		list.add("asddfdf");
		//System.out.println(betta.get_value(5) + 6);
		betta.set_value(list);
		System.out.println(betta.get_value());
		
		betta.set_value( 100);
		System.out.println(betta.get_value());
	}

}

class Betta <T>{
	private T id, value;
	
	public <T> T get_value() {
		//if(value instanceof Integer)System.out.println("true");;
		return (T) this.value;
		
	}
	
	public void set_value(T value) {
		this.value = value;
	}
}

class Father {
	
}
