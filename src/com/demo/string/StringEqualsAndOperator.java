package com.demo.string;

public class StringEqualsAndOperator {

	public static void main(String[] args) 
	{
		String s1 = new String("Barcelona");     // Store on heap 
		String s2 = new String("Barcelona");	 // Store on heap  
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);
		
		String s3 = "Barcelona";				// Store on scp(String context pool) 
		System.out.println(" "+s3.equals(s2));
			
		String s4 = "Barcelona";
		System.out.println(" "+s4.equals(s3));

		String s5 = "Fc" + "Barcelona";
		System.out.println(s4==s5);
		
		final String s6 = "Fc";
		String s7 = s6+"Barcelona";
		System.out.println(s6==s7);
	}

}
