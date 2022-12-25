package com.qspiders.polymorphism;

class Corejavatraining		//polymorphism runtime 
{
	void coding()
	{
		System.out.println("coading with real example....");
	}
}
class Jhon extends Corejavatraining
{
	void coding()
	{
		System.out.println("learnt by practecing...");
	}
}
class Mark extends Corejavatraining
{
	void coding()
	{
		System.out.println("learnt by byharting....");
	}
}
class Sam extends Corejavatraining
{
	void coding()
	{
		System.out.println("not practiced....");
	}
	
}
class Companyinterview
{
	void attend(Corejavatraining cj)
	{
		cj.coding();
	}
}

public class Program21 
{
	public static void main(String[] args) 
	{
		Companyinterview ct=new Companyinterview();
		ct.attend(new Jhon());
		ct.attend(new Mark());
		ct.attend(new Sam());
		
		
	}
}
