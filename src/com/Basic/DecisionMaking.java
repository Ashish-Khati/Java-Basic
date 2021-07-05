/*
 * In this file I am covering all concepts of if,if else, nested if else, else if ladder and switch statement.
 * 
 */
package com.Basic;
import java.util.*;
public class DecisionMaking {
	public static void main(String args[])
	{
		//IfElseStatement is=new IfElseStatement();      
		//is.getDetails();                                // IfElseStatement
		//is.validOrNot();					            
		
		
		EvenOddCount eoc=new EvenOddCount();
		eoc.getData();
		
	}

}



/*
 * Decision Making with if else statement
 * 
 */

class IfElseStatement
{
	String name;
	int age;
	int check=18;
	int elegible;
	Scanner sc=new Scanner(System.in);
	public void getDetails()
	{
	  System.out.print("Enter your name: ");
	  name=sc.nextLine();
	  System.out.print("Enter your age: ");
	  age=sc.nextInt();
	}
	public void validOrNot()
	{
		if(age>=18)
		{
			System.out.println(name +"'s age is: "+age+"\n"+name +" you are eligible to vote.");
		}
		else
		{
			System.out.println(name +"'s age is: "+age+"\n"+name +" you are not eligible to vote.");
			check-=age;
			if(check>1)
			{
				System.out.println("You will be elegible to vote after "+check+ " years");
			}
			else
			{
				System.out.println("\nYou will be elegible to vote after "+check+ " year");
			}
			
		}
	}
}



class EvenOddCount
{
	public void getData()
	{
		int [] arr= {50,65,56,70,89,100,22,67,12};
		int even=0,odd=0;
		/*for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			
		}*/
		for(int i:arr)					//enhance for loop
		{
			if(i%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		
		System.out.print("Number of even number: "+even+"\nNumber of odd number: "+odd);
	}
}