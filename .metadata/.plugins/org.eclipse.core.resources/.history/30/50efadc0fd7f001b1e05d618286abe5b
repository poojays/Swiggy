package junits;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import  org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestEx {
	
	@TestFactory
    Collection<DynamicTest> junit1() {
        return Arrays.asList(
          DynamicTest.dynamicTest("Add test",
            () -> assertEquals(2, Calculator.add(1, 1))),
          DynamicTest.dynamicTest("Palindrome test",
            () -> assertTrue(StringFunctions.isPalindrome("radar"))));
    }
}