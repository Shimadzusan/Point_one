package Foto_Service.Point_one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class A {

	public static void main(String[] args) throws IOException {
		 System.out.println( "===Point_one===" );
		 
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					"context.xml");
		 
		 Day test_bean = context.getBean("simpleDay", Day.class );
			//test_bean.setName("Plato");
			System.out.println(test_bean.getSalary());
		
		Config cnf = context.getBean("report_001", Config.class );
		System.out.println(cnf.getDeals()[2]);
		
		
		System.out.println("date: " + test_bean.get_date());
		
		context.close();
	}
}
/**
 * This class servises for configuration of the work 
 * @author user
 *
 */
class Config {
	String[] deals = {"фнд", "копия", "печать", "ником"};	//..xml_config I-Part
	
	int foto, copy, print, nicom; //..в новой версии это лишнее
	//..вместо этого можно просто создать класс Deal:name=x, cash=100...
	//..то есть определять переменные не нужно будет, просто массив из абстрактных Deal
	
	String typeReport = "classical, or standart, or other";	//..xml_config	II-Part
	
	public void initReport() {
		/*инициализация из Map, Map formating in Recognize*/
		HashMap<String, Deal> data = new HashMap<String, Deal>();
		
	}
	
	public String[] getDeals() {
		return deals;
	}
	public void setDeals(String[] deals) {
		this.deals = deals;
	}
	public int getFoto() {
		return foto;
	}
	public void setFoto(int foto) {
		this.foto = foto;
	}
	public int getCopy() {
		return copy;
	}
	public void setCopy(int copy) {
		this.copy = copy;
	}
	public int getPrint() {
		return print;
	}
	public void setPrint(int print) {
		this.print = print;
	}
	public int getNicom() {
		return nicom;
	}
	public void setNicom(int nicom) {
		this.nicom = nicom;
	}
}