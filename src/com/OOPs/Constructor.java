/*
 * This is constructor topic 
 * where Rectangle class variable are initialize by its constructor 
 * in other class named override is covering concept of constructor overloading 
 * 
 * 
 * ---------------------IMPORTANT CONCEPTS-----------------
 * Java constructor can not be static,abstract,final,native or strictfp
 */
package com.OOPs;
import java.util.Scanner;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(100f,20f);
		r.rectArea();
		Override or=new Override();
		or.showData();
	    or=new Override("Ashish Khati",24,1000000f,21,"Computer Science");
	    or.showData();

	}

}


class Rectangle								//Simple constructor topic 
{
	float length;
	float width;
	public Rectangle(float l,float w)
	{
		length=l;
		width=w;
		
	}
	public void rectArea()
	{
		System.out.println("Area of rectangle is: "+(length*width));
	}
}



class Override
{
	Scanner sc=new Scanner(System.in);
	String name;
	int id;
	float salary;
	int age;
	String department;
	public Override()
	{
		System.out.println("\t\t---Enter details---");
		System.out.print("Name: ");
		name=sc.nextLine();
		System.out.print("ID: ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.print("Department: ");
		department=sc.nextLine();
		System.out.print("Age: ");
		age=sc.nextInt();
		sc.nextLine();
		System.out.print("Salary: ");
		salary=sc.nextFloat();
		
	}
	public Override(String n,int i,float s,int a,String d)
	{
		name=n;
		id=i;
		salary=s;
		age=a;
		department=d;
	}
	public void showData()
	{
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.printf("ID is: %d\nName is: %s\nAge is: %d\nDepartment is: %s\nSalary is: %f\n\n",id,name,age,department,salary);
		System.out.println("---------------------------------------------------------------------------------------------------");
	}
}