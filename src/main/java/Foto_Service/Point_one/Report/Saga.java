package Foto_Service.Point_one.Report;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Saga {
	String address = "history.txt";
	//String address = "[{123},{456}]";
	
	Saga() throws IOException {
		System.out.println("I am Saga");
		
		FileInputStream fin = new FileInputStream(address);
		
		byte[] buffer = new byte[fin.available()];
	        fin.read(buffer, 0, buffer.length);
	        	String s = new String(buffer, "utf-8");
	        			fin.close();
	 //reset "[]"  
		//String s = address;
	        s =	s.substring(1, s.length() - 1);
	        		
	    char[] char_array = s.toCharArray();
	    boolean open = false;
	    boolean close = true;
	    String obj = "";
	    ArrayList<String> json_history = new ArrayList();
	    	for(int i = 0; i < char_array.length; i++) {
	    		
	    		if(char_array[i] == '{') {
	    			open = true;
	    			close = false;
	    		}
	    		
	    		if(char_array[i] != '{' && char_array[i] != '}' && open == true) {
	    		obj = obj + char_array[i];
	    	}
	    	
	    	if(char_array[i] == '}') {
	    		json_history.add(obj);
	    		obj = "";
	    		open = false;
	    	}
	    	
	    	}
	        			
	       System.out.println(s);
	      // System.out.println(json_history.get(1));
	       for(int i = 0; i < json_history.size(); i++) {
	    	   System.out.println(json_history.get(i));
	    	   
	       }
	}
}
