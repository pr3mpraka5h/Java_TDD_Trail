package com.example;

import org.junit.Test;

public class CalTest 
{
	
	@Test
	public void cal_add() 
	{
	Cal c=new Cal();
	System.out.println("---");
	System.out.println(c.add("1,5,78,88,0"));
	
	}
}
