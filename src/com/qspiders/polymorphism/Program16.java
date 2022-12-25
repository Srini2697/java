package com.qspiders.polymorphism;
 
class Topfloor
{
	void cafeteria()
	{
		System.out.println("cafeteria....");
	}
}

class Firstfloor extends Topfloor
{
	void office()
	{
		System.out.println("office.....");
	}
}
class Groundfloor extends Firstfloor
{
	void reciption()
	{
		System.out.println("reciption......");
	}
}
public class Program16 
{
	public static void main(String[] args) 
	{
	//	Topfloor t1=new Groundfloor(); // upcasting
	//	t1.cafeteria();
	//	Firstfloor f1=(Firstfloor)t1;   // downcasting
	//	f1.cafeteria();
	//	f1.office();
	//	Groundfloor g1=(Groundfloor)f1;
	//	g1.cafeteria();
	//	g1.office();
	//	g1.reciption();
		
		Topfloor t1=new Groundfloor();      // upcasting
		if (t1 instanceof Groundfloor)
		{
			Groundfloor g1=(Groundfloor)t1;  // downcasting
		}
		else 
		{
			System.out.println("cant downcasting");
		}
	 	
		Topfloor tp=new Groundfloor(); // upcasting
			tp.cafeteria();
			Firstfloor f1=(Firstfloor)tp;   // downcasting
			f1.cafeteria();
			f1.office();
			Groundfloor g1=(Groundfloor)f1;
			g1.cafeteria();
			g1.office();
			g1.reciption();
		
		
	}

}
