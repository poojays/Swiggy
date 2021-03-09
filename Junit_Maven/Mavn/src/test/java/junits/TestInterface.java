package junits;

import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestInterface implements DefaultInterface { 
	@Test 
	public void junitTest() { 
		assertEquals(30,Calculator.add(10, 20));
		System.out.println("Inside Test Interface"); 
		}
	}
	

