package Foto_Service.Point_one.Report;


import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//import com.fasterxml.jackson.databind.ObjectMapper;

public class Alpha {

	 public static void main(String[] args) throws IOException {
		 
		 Cat murzik = new Cat();
		 murzik.name = "Мурзик000";
		 murzik.age = 9;
		 Cat.X.weight = 5;
		 
		 Cat purzik = new Cat();
		 purzik.name = "Pурзик000";
		 purzik.age = 9;
		 
		 new Saga();
		 
		 
//		 Saga saga = new Saga();
//		 saga.saga = new ArrayList();
//		 saga.saga.add(murzik);
//		 saga.saga.add(purzik);
//		 
//
//		 GsonBuilder builder = new GsonBuilder();
//		 Gson gson = builder.create();
//		 
//		 System.out.println(gson.toJson(saga));
//		
//		 String s2 = gson.toString();
//		 
//		 String s = gson.toJson(purzik);
//		Dog dog = gson.fromJson(s, Dog.class);
//		
//		System.out.println(dog.name);
//		 System.out.println(gson.toJson(dog));
		 
 System.out.println("end");

	    }

}

//class Saga {
//	ArrayList<Cat> saga;
//	
//}

class Dog {
	public String name;
	public int age;
}
 class Cat implements Type {
	
    public String name; // имя
    public int age; // возраст
  
    //public Color color; // цвет
	
    // Конструктор
    public Cat(){

    }
   static public  class X {
    	public static int  weight; 
    }
    
    class Y {}
    
    
}