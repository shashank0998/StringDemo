package com.demo.string;

/**
 *  Q. when we should use string and stringbuffer ?
 *  ---> if the data does not change or change one or two time only use String.
 *  	if data is constantly or friquently change like notepad,calculator use StringBuffer
 *  
 *  String object are immutable object and StringBuffer are mutable object
 * 
 * 	StringBuffer is synchronized --->
 * 							synchronization in java guarantees that no two threads can execute a synchronized method 
 * 							which requires the same lock simultaneously or concurrently. and 
 * 							thus synchronization increase waiting time of thread and effects performance of the system.
 * 
 *   		Then to overcome problem will be slow performance StringBuffer methods 
 *   		java introduced StringBulider in jdk 1.5v And create all method StringBuilder non-synchronized which increase the performance.
 * 
 * 
 * 
 * */

public class StringBuffers 
{

	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("barcelona");
		StringBuffer sb1 = new StringBuffer("barcelona");

		
		//System.out.println(sb.capacity());
		
//		sb.append("hello");
//		System.out.println(sb.capacity());
//		
//		sb.append("fc barcelona barca");
//		System.out.println(sb.capacity());
//		
//		System.out.println(sb.length());
//		System.out.println(sb.append("fc"));
		
		System.out.println(sb.charAt(5));
		
		System.out.println(sb.delete(1, 3));
		
		System.out.println(sb.deleteCharAt(4));
		
		System.out.println(sb.equals(sb1));							// StringBuffer class does not override equals method of object class 
																	// but String class override the equals method of object class
		
		System.out.println(sb.indexOf("v"));
		System.out.println(sb.lastIndexOf("a"));
		System.out.println(sb.insert(0, "fc"));
		
		System.out.println(sb.reverse());
		System.out.println(sb.subSequence(3, 6));
		System.out.println(sb.substring(2));
	}	

}
