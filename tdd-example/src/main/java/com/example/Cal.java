package com.example;

public class Cal 
{

	public int add(String numbers)
	{
		int total=0;
		
        if (numbers.isEmpty()) {
            return 0;
        }
		
		else
		{
			numbers = numbers.replace("\\n", "\n");
			String delimiter = ",|\n"; 
			
	        if (numbers.startsWith("//")) {
	            int delimiterIndex = numbers.indexOf("\n");
	            delimiter = numbers.substring(2, delimiterIndex);  
	            numbers = numbers.substring(delimiterIndex + 1);  
	        }
			
			
	        String[] numbersArray = numbers.split(delimiter);
			
			for (String number : numbersArray) {
				 try {
		                total += Integer.parseInt(number.trim());  // Parse integer and add to total
		            } catch (NumberFormatException e) {
		                System.out.println("Invalid number format: " + number);}
	        }

	        return total;
	}
}
}
