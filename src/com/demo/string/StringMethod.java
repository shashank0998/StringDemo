package com.demo.string;

//length() ---> count the character in string and return integer value
// isEmpty()---> include jdk 1.6v  this method return string empty or not(boolean)
// trim() -----> only remove the leading and trailing space in string
// equals()----> compares the content of the two string and check character match or not then character match (true) otherwise (false)
// equalIgnoreCase() ----> 
// compareTo() and compraeToIgnore() ----> method is used for comparing two string lexicographically 
// concat()----> method concatenates one string to end of another string.
// join(CharSequance delimiter, CharSequeance elements --> is static method concatenates the given element with the 
//														   delimiter and return concatenated string jkd1.8v.
// subSequance(int bigenIndex, int endIndex)----> return CharSequance 
// replace(char oldChar, char newChar)----> return a string replacing all the old character or CharSequance to New character and CharSequance 
// replaceAll()-----> replace all substring into string regex with replacement string.
// indexOf() ---> return the position of the first occurrence of specified character in string or return -1
// lastIndexof() --->return the position of the last occurrence of the character.
// charAt() ----> return the specific index of that character and index value should like between 0 and length()-1
// contains() ---> searches the sequence of character in given string.(boolean)
// valueOf()---> convert different type of value into string (this method is static so call directly(String class))
// toCharArry()---> converts the given string into sequence of character. return array length is equal to the length of the string.

public class StringMethod
{

	public static void main(String[] args) 
	{
			String s1 = "shashank";
			System.out.println("check string length--->"+s1.length());
			
			String s2 = "";
			int i = s2.length();
			if(i==0)
			{
				System.out.println("string is empty");
			}
			else
			{
				System.out.println("String is not empty");
			}
			
			String s3 = "shash";
			System.out.println("checkc string is empty or not--->"+s3.isEmpty());
			
			String s4 ="   barca";
			System.out.println("remove leading and trailing space--->"+s4.trim());
			
			String s5 = "shashank";
			String s6 = "shashanK";
			System.out.println("check content is same or not---->"+s5.equals(s6));
			
			String s7 = "a";
			String s8 = "A";
			System.out.println("comapre two string ---->"+s7.compareTo(s8));
			
			String s9 = "shash";
			String s10 = "potdar";
			System.out.println("using + operator--->"+(s9+s10));
			System.out.println("concate two string--->"+s9.concat(s10));
			System.out.println("---->"+String.join(s9, s10));
			
			String s11 = "shashank";
			System.out.println("using subseqance method----->"+s11.substring(2));
			System.out.println("using subseqance method----->"+s11.substring(2, 5));
			//System.out.println("using subseqance method----->"+s11.substring(3,-1));		// throw the exception 
			
			
			String s12 = "Rutuja";
			System.out.println("Index of method--->"+s12.indexOf('u'));
			
			String s13 = "shashank";
			System.out.println("Last index of---->"+s13.lastIndexOf('k'));
			
			String s14 = "barcelona";
			System.out.println("char at method--->"+s14.charAt(8));			// throw exception

			String s15 = "barcelona";
			System.out.println("conatins methods---->"+s15.contains("s"));
			
			int s16 = 10;
			System.out.println("value of ----->"+String.valueOf(s16));
			
			String s17 = "barcelona";
			char c [] = s17.toCharArray();
			System.out.println("to char array---->"+c);
			
			String n1 = "java";
			String n2 = new String("java");
			System.out.println(n1==n2);
			System.out.println(n1==n2.intern());
			
			int a =10 ;
			int b = 20;
			a = a + b;
			b = a - b;
			a = a - b;
			
			System.out.println(a);
			System.out.println(b);

	}

}
