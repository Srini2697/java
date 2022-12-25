package com.qspiders.polymorphism;


class Corejavastudent
{
	void coding() 
	{
		System.out.println("coding......");
	}
}
class seleniumstudent extends Corejavastudent
{
	void automationtesting() 
	{
		System.out.println("automationtesting...");
	}
}
class company
{
	void interview(Corejavastudent ct)
	{
		ct.coding();
	}
}

public class Program8 
{
	public static void main(String[] args) 
	{
		company c1=new company();
		c1.interview(new Corejavastudent());
		c1.interview(new seleniumstudent());
		
		
	}
}

