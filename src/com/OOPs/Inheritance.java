/*
 *  -------------RULES YOU SHOULD KNOW--------------------
 *  @ (this) keyword use in inheritence to refer the parent class variables in child class...
 *  @ ---> (super()) keyword (constructor) use in inheritence to refer the parent class method parameters in child class...
 *  @ ---> use of (super) keyword to refer immediate parent class instance variable
 *  @ ---> use of (super) keyword to invoke parent class method...
 */



package com.OOPs;
import java.util.Scanner;
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	RectArea ra=new RectArea();
		ra.rectArea();
		CirArea ca=new CirArea();
		ca.cirArea();
		SquareArea sa=new SquareArea();
		sa.sqrArea();*/

		
		
	/*	ClassRoom r=new ClassRoom(10,10,10);
		r.area();
		r.volume();*/
		
		
		
		
		
		//Multilevel Inheritance Object creation
	//	Grandpa gp=new Grandpa("Mr.Dayal Singh Khati","Manda",100000000f);
	//	Father f=new Father("Mr.Dayal Singh Khati","Manda",100000000f,"Army Man");
		Son s=new Son("Mr.Dayal Singh Khati","Manda",50000000f);
		s.getSonData("Ashish Khati","Gaja",1000000000f,"Software Engineer","B.Tech in Computer Sciene","Shobhit Nautiyal");
		s.getFatherData("Mr.Vijay Singh Khati","Rishikesh",20000000f,"Chef");
	//	f.showData();
	//	f.showGrandpa();
		s.showGrandpa();
		s.showFather();
		s.sonData();
	}

}

//Single inheritence example and concept....



class Area
{
	float radius;
	float length,width;
	final float PI=3.14f;
	Scanner sc=new Scanner(System.in);
    public void circle()
	{
		System.out.print("\nEnter radius of circle: ");
		radius=sc.nextFloat();
	}
    public void square()
    {
    	System.out.print("\nEnter side of square: ");
		length=sc.nextFloat();
    }
    public void rectangle()
    {
    	System.out.print("\nEnter length of rectangle: ");
		length=sc.nextFloat();
		System.out.print("Enter width of rectangle: ");
		width=sc.nextFloat();
    }
	
}
class RectArea extends Area
{
	public void rectArea()
	{
		this.rectangle();
		float area=length*width;
		System.out.printf("\nArea of rectangle is: %f",area);
	}
	
}

class CirArea extends Area
{
	public void cirArea()
	{
		this.circle();
		float area=PI*radius*radius;
		System.out.printf("\nArea of circle is: %f",area);
	}
}
class SquareArea extends Area
{
	public void sqrArea()
	{
		this.square();
		float area=length*length;
		System.out.printf("\nArea of square is: %f",area);
	}
}


//Single inheritance example 2

class Room
{
	int length;
	int breadth;
	int a=20;
	public  Room(int l,int b)
	{
		length=l;
		breadth=b;
	}
	public void area()
	{
		System.out.println("\n\n\nArea of Room is: "+(length*breadth));
	
	}
	public void method()
	{
		System.out.println("This is parent class method");
	}
	
} 


class ClassRoom extends Room
{
	int height;
	int a=10;

	public ClassRoom(int l,int b,int h)
	{
		super(l,b);				//Super keyword used to access length and breadth from Room class
		height=h;
		
	}
	public void  volume()
	{
		
		System.out.printf("\n\n\nVolume of room is: %d",(length*breadth*height));
		System.out.println(" Child class vlaue of a is: "+super.a);					//use of super keyword to refer immediate instance variable of parent class...
		super.method();  //use of super keyword to invoke parent class method..
	}
	
}



//Multilevel inheritence example and concept


class Grandpa
{
	String name;
	String house;
	float salary;
	
	public Grandpa(String n,String h,float s)
	{
		name=n;
		house=h;
		salary=s;
	}
	public void showData()
	{
		System.out.println("\n--------------------------------------------------------");
		System.out.println("This is Grandpa class");
		System.out.printf("Name : %s\nSalary : %f\nHouse in: %s",name,salary,house);
		System.out.println("\n--------------------------------------------------------\n");
	}
	
}

class Father extends Grandpa
{
	String name;
	String work;
	float salary;
	String house;
	public Father(String n,String h,float s)
	{
		super(n, h , s);
	}
	public void getFatherData(String n,String h,float s,String w)
	{
		name=n;
		house=h;
		salary=s;
		work=w;
	
	}
	public void showGrandpa()
	{
		super.showData();
		
	}
	public void fatherData()
	{
		System.out.println("\n--------------------------------------------------------");
		System.out.println("This is Father class");
		System.out.printf("Name : %s\nWork : %s\nSalary : %f\nHouse in:%s ",name,work,salary,house);
		System.out.println("\n--------------------------------------------------------\n");
	}
}
class Son extends Father
{
	String study;
	String friend;
	String name;
	String house;
	float salary;
	String work;
	public Son(String n,String h,float s)
	{
		super(n,h,s);
		
		
	}
	public void getSonData(String n,String h,float s, String w,String st,String f)
	{
		name=n;
		house=h;
		salary=s;
		work=w;
		friend=f;
		study=st;
		
		
	}
	
	public void showFather()
	{
		fatherData();
		
	}
	public void sonData()
	{
		System.out.println("\n--------------------------------------------------------");
		System.out.println("This is Son class");
		System.out.printf("Name : %s\nWork: %s\nSalary is: %f\nHouse in :%s\nFriend : %s\nStudy : %s ",name,work,salary,house,friend,study);
		System.out.println("\n--------------------------------------------------------\n");
	}
}