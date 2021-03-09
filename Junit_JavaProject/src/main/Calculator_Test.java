package main;

import org.junit.jupiter.api.Test;

public class Calculator_Test {
	Calculator obj = new Calculator();
	
     @Test
	public void addTest() {
		int result = obj.add(2,3);

}
     @Test
	public void subTest() {
		obj.substraction();
		
}
     @Test
	public void mulTest() {
		obj.multiplication();
		
}
	}
