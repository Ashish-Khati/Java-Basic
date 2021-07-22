/*
 * StringBuffer is mutable,synchronized and thread safe
 * -----------------StringBuffer constructors-----------
 * 1. StringBuffer();
 * 2.StringBuffer(CharSequence seq);
 * 3.StringBuffer(int capacity);
 * 4.StringBuffer(String str);
 */
package com.ArraysStringsAndVectors;
import java.util.Scanner;
public class StringBufferConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		
		System.out.print("Length is: "+str.length());
		for(int i=0;i<str.length();i++)
		{
			int p=i+1;
			System.out.println("\nCharacter at position "+p+" is: "+str.charAt(i));
		}
		sb.append(" Gusain");
		System.out.println(sb);
		System.out.println(str);
	

	}

}
