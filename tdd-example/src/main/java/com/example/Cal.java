package com.example;

public class Cal 
{

	public int add(String numbers)
	{
		int total=0;
		if(numbers.length()==0)
		return 0;
		
		else if(numbers.length()==1)
		return Integer.parseInt(numbers);
		
		else
		{
			String[] numbers_String=numbers.split(",");
//			int[] a1=new int[numbers_String.length];
			
			for (int i = 0; i < numbers_String.length; i++) {
				total = total+ Integer.parseInt(numbers_String[i]);
			}
			
			
		}
		
		return total;
	}
}
