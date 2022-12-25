package com.qspiders.polymorphism;

class Flightinair
{
	void wings()
	{
		System.out.println("use wings to fly");
	}
}
class Flightonroad extends Flightinair
{
	void wheels()
	{
		System.out.println("use the wheels to move on land");
	}
}
public class Program13 
{
	public static void main(String[] args) 
	{
		 Flightinair takeoff=new Flightonroad();       //upcasting
		 takeoff.wings();
		  //takeoff.wheels();
		 
		 System.out.println("=======================" );
		 
		 Flightonroad landing=(Flightonroad)takeoff;    //downcasting
		 landing.wings();
		 landing.wheels(); 
	}
}
