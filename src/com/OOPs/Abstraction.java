/*
 *  -------------RULES YOU SHOULD KNOW--------------------
 *  @Data Abstraction is the property by virtue of which only the essential details are displayed to the user.....
 *  @Abstraction can be achieved by abstract class and interface...
 *  @We can achieve 100% abstraction using interfaces...
 *  @there can be no object of an abstract class. That means,an abstract class can not be directly instantiated with the new operator...
 *  @  
 */
package com.OOPs;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c=new Circle("Red",1);
		c.area();
		c.toString();
		c=new Rectangle1("Blue",12,12);
		c.area();
		c.toString();
		

	}

}

abstract class Shape
{
	String color;
	abstract double area();
	public abstract String toString();
	public Shape(String color)
	{
		System.out.println("This is Shape class constructor");
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}
}
class Circle extends Shape
{
	double radius;
	public Circle(String color,double radius)
	{
		super(color);
		System.out.println("Circle constructor called");
		this.radius=radius;
   }
	
	double area()
	{
		return Math.PI*Math.pow(radius,2);
	}
	public String toString()
	{
		return "Circle color is "+super.getColor()+"area of Circle is: "+area();
	}

}
class Rectangle1 extends Shape
{
	double length;
	double width;
	public Rectangle1(String color,double length,double width)
	{
		super(color);
		System.out.println("Rectangle constructor called ");
		this.length=length;
		this.width=width;
	}
	double area()
	{
		return length*width;
	}
	public String toString()
	{
		return "Rectangle color is "+super.getColor() +"Area of Rectangle is: "+area();
	}
}
