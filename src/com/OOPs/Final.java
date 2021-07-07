/*
 *  -------------RULES YOU SHOULD KNOW--------------------
 *  @ Final variable work as a constant. It restrict programmer from giving new value to variable if it has already assigned a value..
 *  @Final class variable can't be defined in any method of that similar class....
 *  @Final method can't be override by child class.....
 *  @If a class declare as Final then that class can't be inherited....
 *  @Finalize() method work as destructor in java programming language
 *  @Finalize() method  
 */
package com.OOPs;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVar2 fv=new FinalVar2();
		fv.finalVar();
		fv.method();

	}

}


 class FinalVar											//If we make this class as final class then this class can't be inherited by any class....
{
	final int age=10;									//Final variable
	 final String name="Ashish Khati";
    final String collage="Government Polytechnic Dehradun";
	public void finalVar()      						//If we make this method Final then child class can't override this method..
	{
		System.out.printf("Age: %d\n Name: %s\nCollage: %s",age,name,collage);
	}
}
class FinalVar2 extends FinalVar
{
	public void finalVar()
	{
		System.out.println("This is FinalVar  class method");
	}
	public void method()
	{
		System.out.println("The quick brown fox jumps over the lazy dog. ");
	}
}