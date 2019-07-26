package Foto_Service.Point_one.Report;

import java.util.ArrayList;

public class Alpha {

	public static void main(String[] args) {
		int[] array = new int[16];
		Betta<Integer> betta = new Betta<Integer>();
		ArrayList list = new ArrayList();
		list.add("asd");
		list.add("asddfdf");
		//System.out.println(betta.get_value(5) + 6);
		System.out.println(betta.get_value(list));
		
	}

}

class Betta <T>{
	private T id, value;
	
	public <T> T get_value(T value) {
		if(value instanceof Integer)System.out.println("true");;
		return value;
		
	}
}
