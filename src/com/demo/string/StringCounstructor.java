package com.demo.string;

public class StringCounstructor {

	public static void main(String[] args) 
	{
		String s = new String("shashank");
		System.out.println(s.length());
		
		
		StringBuffer sb = new StringBuffer("shash");
		String s2 = new String(sb);
		System.out.println(s2);
		
		StringBuilder sb1 = new StringBuilder("shashank");
		String s3 = new String(sb1);
		System.out.println(s3);
	
	
		byte [] b = {101,102,103};
		String s4 = new String(b);
		System.out.println(s4);
		
		
		char c [] = new char[]{'a','b','c'};
		String s5 = new String("abc");
		System.out.println("c--"+c);
		System.out.println("s--"+s5);
		
		
		
		/**
		 * 	Why char array is preferred over string for storing password in java ?
		 * 	--->String object are immutables in java and therefore if a password is stored as plain text it will be available in memory 
		 * 		until GC clear it , but
		 * 		String object stored in string literal pool for re-usability and garbage collection is not applicable in SCP,
		 * 		which is security threat.
		 * 		with an array you can explicitly wipe the data after you are done with it.
		 * 		you can overwrite the array with anything you like and password won't be present any where in the system ,even b4 garbage collection.  
		 * 
		 * 
		 * 
		 * **/ 
	}

}
