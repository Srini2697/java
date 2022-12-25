package com.qspiders.polymorphism;

class pen 
{
	String colour="black";
	void provideink() 
	{
		System.out.println("provid ink");
	}
}
class notebook
{
	int noofpages=200;
	void providesheet()
	{
		System.out.println("provide the sheets");
	}
}
class you
{
	void writenote(pen p1,notebook n1)
	{
		System.out.println(p1.colour);
		p1.provideink();
		System.out.println(n1.noofpages);
		n1.providesheet();
		
	}
}
public class Program7 
{
	public static void main(String[] args) 
	{
		you y1=new you();
		y1.writenote(new pen(),new notebook());
	}
}
