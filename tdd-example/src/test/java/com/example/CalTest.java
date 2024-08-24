package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CalTest 
{
	private final Cal calculator = new Cal();

    @Test
    public void testAdd() {
        // Test case 1: Regular input with comma delimiter
        int result1 = calculator.add("1,5,78,88,0");
        assertEquals(172, result1, "Test Case 1 Failed");

        // Test case 2: Input with newline delimiter
        int result2 = calculator.add("1\\n2,3");
        assertEquals(6, result2, "Test Case 2 Failed");

        // Test case 3: Input with custom delimiter
        int result3 = calculator.add("//;\\n1;2");
        assertEquals(3, result3, "Test Case 3 Failed");

        // Test case 4: Input with negative numbers
        // This should print a message about negative numbers and return the sum of non-negative numbers
        System.out.println("Negative numbers check:");
        int result4 = calculator.add("1,-5,3,-7");
        assertEquals(4, result4, "Test Case 4 Failed");

        // Test case 5: Empty input
        int result5 = calculator.add("");
        assertEquals(0, result5, "Test Case 5 Failed");

        // Test case 6: Invalid number format
        // Here we expect invalid number format messages printed to console and non-number values skipped
        System.out.println("Invalid number format check:");
        int result6 = calculator.add("1,a,3");
        assertEquals(4, result6, "Test Case 6 Failed");
    }
}

