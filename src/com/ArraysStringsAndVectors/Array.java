/*
 * -------------RULES YOU SHOULD KNOW--------------------

 * @Array is a group of contiguous or related data items that share a common name.
 * @There are three types of Array: One dimension array, two dimension array, jagged array
 */
package com.ArraysStringsAndVectors;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	OneDimonsionArray oda=new OneDimonsionArray();
		oda.getName();
        oda.getSalary();
		oda.showDetails();
    */
		
		//Sort class (Example 2) object creation
	//	Sort s=new Sort();
		//s.sorting();
		
		
		//TwoDimension Array Example object creation
		TwoDimensionArray tda=new TwoDimensionArray();
		tda.twoDimension();

	}

}


//Single Dimonsion Array Example


class OneDimonsionArray
{
	static int count=1;
	static int countSalary=1;
 String name[]=new String[5];
 int salary[]=new int[5];
	Scanner sc=new Scanner(System.in);
	
	public void getName()
	{
		 
		for(int i=0;i<name.length;i++)
		{
			System.out.print("Enter name of employee"+count+": ");
			name[i]=sc.nextLine();
			count++;
		}
	
	}
	public void getSalary()
	{
		for(int i=0;i<salary.length;i++)
		{
			System.out.print("\n\nEnter salary of employee"+countSalary+": ");
			salary[i]=sc.nextInt();
			countSalary++;
		}
	}
	public void showDetails()
	{
		System.out.printf("\n--------------------------------------------------------------\n");
		System.out.printf("			Employee Details			");
		
		for(int i=0;i<5;i++)
		{	
			
			System.out.printf("\n%-8s%10d\n",name[i],salary[i]);
		}
	}
}



//One dimensional array example 2
class Sort
{
	int number[]=new int[] {12,78,45,98,11,57,87};
	int temp;
	public void sorting()
	{
		System.out.print("Numbers before sorting: ");
		for(int i:number)
		{
			System.out.print("\t"+i);
		}
		
		for(int i=0;i<number.length;i++)
		{
			for(int j=i+1;j<number.length;j++)
			{
				if(number[i]>number[j])
				{
					temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
		}
		System.out.print("\nNumbers after sorting: ");
	for(int i:number)
		
	{
		System.out.print(" \t"+i);
	}
	}
	
	
}



	   //Two dimension array 
class TwoDimensionArray 
{
	int arr[][]=new int[][] {{1,2,3,4,5},{6,7,8,9,10},{11,22,33,44,55},{66,77,88,99,100}};
	public void twoDimension()
	{
		System.out.println("Array elements are: ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)      							//This line is to implement jagged array
			{
				System.out.print("\t"+arr[i][j]);
				}
			System.out.println("\n");
		}

	}
}