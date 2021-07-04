/*
 * This file is covering concept of 
 * class and object in java programming language 
 * here i use two classes 
 * one is ClassObject
 * and second is Person 
 * where classobject class contain main function 
 * from where the java program started executing 
 */

package com.OOPs;
import java.util.Scanner;
public class ClassObject
{
	public static void main(String args[])
	{
		Person p=new Person();
		p.getDetails();
		p.showDetails();
		
	}
}
class Person
{
	String name;
	String department;
	int employeeID;
	float salary;
	Scanner sc=new Scanner(System.in);
	public void getDetails()
	{
		System.out.print("Enter Employee ID: ");
		employeeID=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Employee name: ");
		name=sc.nextLine();
		System.out.print("Enter Employee department: ");
		department=sc.nextLine();
		System.out.print("Enter Employee salary: ");
		salary=sc.nextFloat();
		
	}
	public void showDetails()
	{
		System.out.printf("Employee ID is:  %d\n Employee name is : %s\n Employee Department is : %s\n Salary is :%f",employeeID,name,department,salary);
		
	}
}