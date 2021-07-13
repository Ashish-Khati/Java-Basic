/*
 * @String is a array of character.
 * @ It is immutable,that means we can't change the value of object of String class..
 * @It is thread Safe,that means more than one thread cannot access one String method at same time..
 * ------------------------------String Methods----------------------
 * @charAt(int index)----->Returns the character at the specified index (position).  Return type is char..
 * @codePointAt()--------->Returns the Unicode of the character at the specified index.  Return type is int...
 * @codePointBefore()------>Returns the Unicode of the character before the specified index.  Return type is int..
 * @codePointCount()------->Returns the Unicode in the specified text range of this String.  Return type is int..
 * @compareTo()------------>Compares two strings lexicographically. Return type is int..
 * @compareToIgnoreCase()--->Compares two strings lexicographically, ignoring case differences. Return type is int..
 * @concat()---------------->	Appends a string to the end of another string. Return type is String..
 * @contains()-------------->Checks whether a string contains a sequence of characters. Return Type is Boolean...
 * @contentEquals()--------->	Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer. Return Type is Boolean..
 * @copyValueOf()----------->	Returns a String that represents the characters of the character array. Return Type is String..
 * @endsWith()--------------->Checks whether a string ends with the specified character(s). Return type is boolean...
 * @equals()------------------>Compares two strings. Returns true if the strings are equal, and false if not. Return type is Boolean..
 * @equalsIgnoreCase()--------->	Compares two strings, ignoring case considerations. Return type is Boolean..
 * @format()------------------->	Returns a formatted string using the specified locale, format string, and arguments. Return Type is String......
 *@getBytes()--------------------->	Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array.Return Type is byte[]....
 *@getChars()------------------->	Copies characters from a string to an array of chars.Return Type is	void....
 *@hashCode()------------------>	Returns the hash code of a string.Return type is int....
 *@indexOf()--------------------->	Returns the position of the first found occurrence of specified characters in a string.Return Type is int....
 *@intern()-------------------->	Returns the canonical representation for the string object.Return Type is String....
 *@isEmpty()------------------>	Checks whether a string is empty or not.Return Type is boolean....
 *@lastIndexOf()--------------->	Returns the position of the last found occurrence of specified characters in a string.Return Type is int....
 *@length()--------------------->	Returns the length of a specified string.Return Type is	int..........
 *@matches()-------------------->	Searches a string for a match against a regular expression, and returns the matches.Return Type is boolean...
 *@offsetByCodePoints()---------->	Returns the index within this String that is offset from the given index by codePointOffset code points.Return Type is int.....
 *@regionMatches()---------------->	Tests if two string regions are equal.Return Type is boolean
 *@replace()------------------------->	Searches a string for a specified value, and returns a new string where the specified values are replaced.Return Type is String.....
 *@replaceFirst()-------------------->	Replaces the first occurrence of a substring that matches the given regular expression with the given replacement.Return Type is String....
 *@replaceAll()---------------------->	Replaces each substring of this string that matches the given regular expression with the given replacement. Return Type is String...
 *@split()------------------------------->	Splits a string into an array of substrings.Return Type is String[]....
 *@startsWith()-----------------------_>	Checks whether a string starts with specified characters.Return Type is	boolean.......
 *@subSequence()----------------------->	Returns a new character sequence that is a subsequence of this sequence.Return Type is	CharSequence...
 *@substring()-------------------------->	Returns a new string which is the substring of a specified string.Return Type is String....
 *@toCharArray()-------------------------->Converts this string to a new character array.Return Type is char[]...
 *@toLowerCase()------------------------>Converts a string to lower case letters.Return Type is String...
 *@toString()-------------------------->Returns the value of a String object.Return Type is String....
 *@toUpperCase()---------------------->Converts a string to upper case letters.Return type is String....
 *@trim()---------------------------->Removes whitespace from both ends of a string.Return Type is String...
 *@valueOf()------------------------->Returns the string representation of the specified value.Return Type is String....
 */

package com.ArraysStringsAndVectors;
//import java.lang.*;

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//charAt() method concept
	 StringMethod sm=new StringMethod();
	/*	   sm.charAtMethod();
		//codePointAt() method concept
		   sm.codePointAtMethod();
		//codePointBefore() method concept
		   sm.codePointBeforeMethod();
		 //codePointCount() method concept
		   sm.codePointCountMethod();
		   //compareTo() method concept
		   sm.compareToMethod();
		   //compareToIgnoreCase() method concept
		   sm.compareToIgnoreCaseMethod();
		   //concat() method concept
		   sm.concatMethod();
		   //contains() method concept
		   sm.containsMethod();
		   //contentEquals() method concept
		   sm.contentEqualsMethod();
		   //copyValueOf() method concept
		   sm.copyValueOfMethod();
		   //endsWith() method concept
		   sm.endWithMethod(); 
		   //equals() method concept
		   sm.equalsMethod();
		   //equalsIgnoreCase() method concept
		   sm.equalsIgnoreCaseMethod();
		   
		 String s1 = "Geeks";
	     // s1 is not changed
	     String1.concat1(s1);
	     System.out.println("String: " + s1);

	     StringBuilder s2 = new StringBuilder("Geeks");

	     // s2 is changed
	    String1. concat2(s2);
	     System.out.println("StringBuilder: " + s2);

	     StringBuffer s3 = new StringBuffer("Geeks");

	     // s3 is changed
	     String1.concat3(s3);
	     System.out.println("StringBuffer: " + s3);
	     
		//trim() method concept
		sm.trimMethod();
		//toLowerCase() method concept
		sm.toLowerCaseMethod();
		//toUpperCase() method concept
		sm.toUpperCaseMethod();
		
		//startsWith() method Concept
	 sm.startsWithMethod();
	 
	 //hashCode() method Concept
	 sm.hashCodeMethod();
	 
	 //replace() method concept.It replace character with new character
	 sm.replaceMethod();
	 //replaceAll() method Concept.It replace String with new String 
	  sm.replaceAllMethod();
	  //replaceFirst() method Concept.It replace given String with new String but only that string which occurrence is first..
	  sm.replaceFirstMethod();
	 
	 //isEmpty() method concept
	 sm.isEmptyMethod();
	 //lastIndexOf() method concept
	 sm.lastIndexOfMethod();
	 */
	 sm.lengthMethod();

	}

}

//Java program to demonstrate difference
//between String, StringBuilder and StringBuffer
class String1 {
 // Concatenates to String
 public static void concat1(String s1)
 {
     s1 = s1 + "forgeeks";
 }

 // Concatenates to StringBuilder
 public static void concat2(StringBuilder s2)
 {
     s2.append("forgeeks");
 }

 // Concatenates to StringBuffer
 public static void concat3(StringBuffer s3)
 {
     s3.append("forgeeks");
 }

}




class StringMethod
{
	String myStr="Ashish Ashish Khati Gusain";
	String str1="Ashish";
	String s="Ashish Khati Ashish";
	char[] ch= {'H','e','l','l','o'};
	String str2="";
	String s1="My name is Ashish Khati The quick brown fox jumps over the lazy dog.";
	public void charAtMethod()
	{
		System.out.println("\n\n---------------------------");
		char result=myStr.charAt(0);
		System.out.println(result);
	}
	public void codePointAtMethod()
	{
		System.out.println("\n\n---------------------------");
		int result=myStr.codePointAt(3);
		System.out.println(result);
	}
	public void codePointBeforeMethod()
	{
		System.out.println("\n\n---------------------------");
		int result=myStr.codePointBefore(1);
		System.out.println(result);
	}
	public void codePointCountMethod()
	{
		System.out.println("\n\n---------------------------");
		int result=myStr.codePointCount(0,6);
		System.out.println(result);
	}
	public void compareToMethod()
	{
		System.out.println("\n\n---------------------------");
		System.out.println(myStr.compareTo(str1));
	}
	public void compareToIgnoreCaseMethod()
	{
		System.out.println("\n\n---------------------------");
		System.out.println(myStr.compareToIgnoreCase(str1));
	}
	public void concatMethod()
	{
		System.out.println("\n\n---------------------------");
		System.out.println(myStr.concat(str1));
	}
	public void containsMethod()
	{
		System.out.println("\n\n---------------------------");
		System.out.println(myStr.contains("Ash"));
		System.out.println(myStr.contains("ish"));
		System.out.println(myStr.contains("Aash"));
	}
	public void contentEqualsMethod()
	{
		System.out.println("\n\n---------------------------");
		System.out.println(myStr.contentEquals("Ash"));
		System.out.println(myStr.contentEquals("ish"));
		System.out.println(myStr.contentEquals("Aash"));
		System.out.println(myStr.contentEquals("Ashish"));
		
	}
	public void copyValueOfMethod()
	{
		System.out.println("\n\n---------------------------");
		str2=str2.copyValueOf(ch,0,5);
		System.out.println("Returned String: "+str2);
	}
	public void endWithMethod()
	{
		System.out.println("\n\n---------------------------");
		System.out.println(myStr.endsWith("Ash"));
		System.out.println(myStr.endsWith("ish"));
		System.out.println(myStr.endsWith("h"));
		System.out.println(myStr.contentEquals("Ashish"));
	}
	public void equalsMethod()
	{
		System.out.println("\n\n---------------------------");
		System.out.println(myStr.equals("Ashish"));
		System.out.println(myStr.equals(s));
		
	}
	
	public void equalsIgnoreCaseMethod()
	{
		System.out.println("\n\n---------------------------");
		System.out.println(myStr.equalsIgnoreCase("Ashish"));
		System.out.println(myStr.equalsIgnoreCase(s));
		
	}
	public void formatMethod()
	{
		
	}
	public void getBytesMethod()
	{
		
	}
	public void getCharsMethod()
	{
		
	}
	public void hashCodeMethod()
	{
		System.out.println(myStr.hashCode());
	}
	public void indexofMethod()
	{
		System.out.println(s.indexOf("Ashish"));
	}
	public void internMethod()
	{
		
	}
	public void isEmptyMethod()
	{
		System.out.println(str1.isEmpty());
		System.out.println(str2.isEmpty());
		
	}
	public void lastIndexOfMethod()
	{
		System.out.println(s.lastIndexOf("Ashish"));
	}
	public void lengthMethod()
	{
		System.out.print("Length of String is: "+myStr.length());
	}
	public void matchesMethod()
	{
		
	}
	public void offsetByCodePointsMethod()
	{
		
	}
	public void regionMatchesMethod()
	{
		
	}
	public void replaceMethod()
	{
		System.out.println(myStr.replace('A','S'));	
	}
	public void replaceFirstMethod()
	{
		System.out.println(myStr.replaceFirst("Ashish","Ayush"));
	}
	public void replaceAllMethod()
	{
		System.out.println(myStr.replaceAll("Ashish","Ayush"));	
	}
	public void splitMethod()
	{
		
	}
	public void startsWithMethod()
	{
		System.out.println(myStr.startsWith("Ashish"));
		System.out.println(myStr.startsWith("As"));
		System.out.println(myStr.startsWith("ish"));
		System.out.println(myStr.startsWith("    Ashish"));
	}
	public void subSequenceMethod()
	{
		
	}
	public void substringMethod()
	{
		
	}
	public void toCharArrayMethod()
	{
		
	}
	public void toLowerCaseMethod()
	{
		 System.out.println(myStr.toLowerCase());	
	}
	public void toStringMethod()
	{
		
	}
	public void toUpperCaseMethod()
	{
	   System.out.println(myStr.toUpperCase());	
	}
	public void trimMethod()
	{
		System.out.println(myStr);
		System.out.println(myStr.trim());
		
	}
	public void valueOfMethod()
	{
		
	}
	
}