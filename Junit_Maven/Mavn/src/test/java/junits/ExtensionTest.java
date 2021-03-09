package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;

public class ExtensionTest {
	
	@ExtendWith(EnvExtension.class)
	@Test
	
	public void junit1() {
		
		assertTrue(StringFunctions.isPalindrome("radar"));
		System.out.println("Inside Test");
		
		
	}
	

}
