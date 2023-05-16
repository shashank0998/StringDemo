package com.demo.string;

public class StringMethods {

	public static void main(String[] args) 
	{
		
		String s1 = "";						// isEmpty
		System.out.println(s1.isEmpty()); 	// Return true or false
		
		String s2 = "shash";
		System.out.println(s2.length());	// length

		String s3 = "kadak";				// replace
		System.out.println(s3.replace('k', 'b'));  	
		
		String s4 = "abcdef";
		System.out.println(s4.substring(3));	// substring(index begin)
		System.out.println(s4.substring(2, 5));	// substring(index start , index ends)
		
		String s5 = "shash";
		System.out.println(s5.indexOf('a')); 	// indexof
		
		String s6 = "shashank";					// lastindexof
		System.out.println(s6.lastIndexOf('a'));
		
		String s7 = "SHASh";					// toLowerCase
		System.out.println(s7.toLowerCase());
		
		
		
	}

}
