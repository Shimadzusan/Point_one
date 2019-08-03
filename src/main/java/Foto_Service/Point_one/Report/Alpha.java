package Foto_Service.Point_one.Report;


import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Alpha {

	 public static void main(String[] args) {

	        ObjectMapper mapper = new ObjectMapper();

	        Staff staff = createStaff();
 

	    }

	    private static Staff createStaff() {

	        Staff staff = new Staff();

	        staff.setName("mkyong");
	        staff.setAge(38);
	        staff.setPosition(new String[]{"Founder", "CTO", "Writer"});
	       
	        return staff;

	    }
}
class Staff {

    private String name;
    private int age;
    private String[] position;              //  Array
    private List<String> skills;            //  List
    private Map<String, BigDecimal> salary; //  Map
	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setSalary(Map<String, BigDecimal> salary2) {
		// TODO Auto-generated method stub
		
	}
	public void setPosition(String[] strings) {
		// TODO Auto-generated method stub
		
	}
	public void setAge(int i) {
		// TODO Auto-generated method stub
		
	}

	// getters , setters, some boring stuff
}

