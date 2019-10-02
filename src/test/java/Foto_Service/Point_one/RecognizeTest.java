package Foto_Service.Point_one;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class RecognizeTest {
	Day day = new Day();
	Recognize instance = new Recognize(day);
	
	@Test
	public void test_get_number() {
		
		String s = "kofe56";//anyway value
		int result = instance.get_number(s);
		int expected = 56;
		assertEquals(expected, result);
		System.out.println("Hello from ... maven");
	}
	
	@Test
	public void test_sort_kind() {
		instance.sort_kind("зп");
		int result = instance.day.get_salary();
		assertEquals(0, result);
	
	}

}
