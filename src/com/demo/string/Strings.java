package com.demo.string;
/**
 * String ----> 
 * 			1) string is non-primitive datatype bcz is refer memory location where data is stored in the heap memory(or String constant pool).
 *			2) String is sequence of charachter char c[] = {'s','h','a','s',h}; Array of character ----> represent by CharSequence Interface
 *			3) String is a class
 *				class String
 *				{
 *					public final class String extends Object implements CharSequence , Serializable , Comparable
 *					{
 *							----> Serializable interface is used when we need to store a copy of the object and send them to another process
 *									which runs on the same system or over the network. 
 *
 							----> Comparable interface is used to order the object of the class it has only one method i.e. compareTo()
 *					}
 * 				}
 * 			4) we can create string object -----> it will create an immutable object.
 * 				String  = new String();	  <----- using new keyword
 * 				String s = "shash";       <----- literal
 * 			
 * 			5) To create String there is classes
 * 				String,StringBuffer,StringBuilder
 * 
 *			6) String Constant Pool -> or String literal pool is an area in heap memory where java store string literal values.
 *			
 *				scp --> present 1.6v in method area   and 1.7v shift in heap area size will be increase or decrease  	
 *					 using new keyword	kel tr scp chya at jr konta object asel tr to jvm tayala intrenally refer krto anhi 
 *						jr by litral n kel tr direct scp la store honar object	
 *
 *			Q. can we gc() occur in String constant pool?
 *				NO. the string object present in scp are not applicable for GC because reference variable internally is maintained by JVM.
 *
 *			Q. What is string immutable?
 *			----> immutability concept is used for string object String object are immutable it means once string object created, its data or state can't 
 *					be changed but a new string object is created.
 *				
 *			**Q Why string immutable ?
 *			----> The String is immutable in Java because of the security, synchronization and concurrency, caching, and class loading.
 *				  The reason of making string final is to destroy the immutability and to not allow others to extend it.
 * 				  The String objects are cached in the String pool, and it makes the String immutable.
 * 			
 * 			Q. Why string class is final ? and difference between final and immutability ?
 * 			---->  string class got special feature which is not available to other java classes and making the string class 
 * 					final prevents child class that could break these assumption
 * 				
 * 				> final is keyword is used to class,method,variable but immutability is the concept used for objects state and content cannot be changed.
 * 
 *   		Q. .equals() vs == operator ?
 *   		----> .equals() is used for content comparison(in string class). its means check object value.
 *   				==      is used for reference comparison(address comparison) its means check both object point to same memory location or not.
 *   			
 *   			object class .equals() ----> check reference comparison
 *   			String class .equals() ----> check content comparison
 *   
 *   
 *   		Q. String vs StringBuffer vs StringBuilder
 *   		
			---> String is Immutable 		-----> StringBuffer is Mutable 			-----> StringBuilder is Mutable
			---> String 			 		-----> StringBuffer synchronized 		-----> StringBuilder non-synchronized
			---> String store heap and scp  -----> StringBuffer store in heap	    -----> StringBuilder store in heap
			---> String is not thread safe	-----> StringBuffer is thread safe		-----> StringBuilder is not thread safe
			---> String is slow				-----> StringBuffer fast at string		-----> StringBuilder is fast at StringBuffer
 *
 * */
public class Strings 
{
	public static void main(String[] args) 
	{
		String s1 = new String("shash");
		String s2 = new String("shash");
		
		String s3 = "shash";
		String s4 = "shash";
		
		System.out.println(s1==s2);		// false		// reference comparison
		System.out.println(s3==s4);     // true			// SCP store same object 
		
		System.out.println(s1.equals(s2)); // true		// content equality
		System.out.println(s3.equals(s1));	
		
	}

}
