/*
 *  -------------RULES YOU SHOULD KNOW--------------------
 *  @Java doesn't support operator overloading.. 
 *  @Java method overloading means a method having same name but different functionality.. 
 *  @Java method overloading is a compile time polymorphism that means method overloaded in the time of compilation.
 *  @class Poly1 perform method overloading in the program..
 *  @Method overriding is a dynamic polymorphism in this process method get override while program is in running stage....
 *  @In Method overriding inheritance concept  use...
 *  @Dynamic Method Dispatch also perform in polymorphism concept in this method we can create refrence of a parent class and create object of child class.....
 *  @class Poly2 perform method overriding in this program.. 
 */
package com.OOPs;
import java.util.Scanner;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Poly1 p=new Poly1();
		p.method();
		p.sum();
		p.method(10,30);               //This is the method overloading concept
		p.sum();
		p.method(100);
		p.sum();
	*/
		
		
		   //Method overriding concept 
		Poly2 p3=new Poly3();        	//Dynamic method dispatch enabled.....
		p3.method1();
	//	p3.method2();     				// It will give error because of dynamic method dispatch concept..bcuz in this concept refrence variable is of parent class so it will only access only those method which are also in parent class.
		
	}

}

class Poly1
{
	int num1,num2,num3,num4;
	int sum=0;
	Scanner sc=new Scanner(System.in);
	public void method()
	{
		System.out.print("Enter first number: ");
		num1=sc.nextInt();
		System.out.print("Enter second number: ");
		num2=sc.nextInt();
		System.out.print("Enter third number: ");
		num3=sc.nextInt();
		System.out.print("Enter forth number: ");
		num4=sc.nextInt();
	
		
   }
	public void method(int n3,int n4)
	{

		System.out.print("Enter first number: ");
		num1=sc.nextInt();
		System.out.print("Enter second number: ");
		num2=sc.nextInt();
		num3=n3;
		num4=n4;
		
	}
	public void method(int n4)
	{

		System.out.print("Enter first number: ");
		num1=sc.nextInt();
		System.out.print("Enter second number: ");
		num2=sc.nextInt();
		System.out.print("Enter third number: ");
		num3=sc.nextInt();
	
		num4=n4;
		
		
	}
	public void sum()
	{
		sum=num1+num2+num3+num4;
		System.out.println("Sum is: "+sum);
	}
}


       //Method overriding concept 
class Poly2
{
	public void method1()
	{
		System.out.println("This is method1 of poly2 class");
		
	}
	
}
class Poly3 extends Poly2
{
	public void method1()
	{
		super.method1();   //to access parent class method1
		System.out.println("This is method2 of poly3 class which is inheriting poly2 class ");
		
	}
	public void method2()
	{
		System.out.println("This method is created to test dynamic method dispatch concept");
	}
}