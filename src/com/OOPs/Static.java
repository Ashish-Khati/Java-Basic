/*
 * This file covers concept of static keyword
 * 
 * 
 * -------------RULES YOU SHOULD KNOW--------------------
 * Java don't support static constructor.
 * In Static method only static variable can be initilized and used.
 * this and super cannot be used in static context.
 * 
 */
package com.OOPs;
import java.util.Scanner;
public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Static1 obj=new Static1(1,"Ashish Khati");
		Static1.method1("Government Inter Collage");
		obj.method();
		

	}

}


class Static1
{
	int id;					//instance variable---->need object to access
	String name;			//instance variable
	static String collage;    //Static variable----->directly access using class.no need to create object to access static variable
	/*static 
	{
		collage="Government Polytechnic Dehradun";
	}*/
	public Static1(int i,String n)
	{
		id=i;
		 name=n;
		
		 
	}
	
	public void method()
	{
		System.out.printf("ID is: %d\nName is: %s\nCollage is: %s",id,name,collage);
	}
	public static void method1(String c)			//static method
	{
		//id=10;				this line will give error because only static variable can be accessed inside static method...
	//	this.collage=collage;   this line also give error because (this) keyword cannot be used inside static method...
		collage=c;
	}
}