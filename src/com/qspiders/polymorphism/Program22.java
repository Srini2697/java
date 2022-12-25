package com.qspiders.polymorphism;

class Trai
{
	void signalStrenth()
	{
		System.out.println("provide network");
	}
}
class Actfiber extends Trai
{
	void signalStrenth()
	{
		System.out.println("actfiber signals implementaion");
	}
}
class Airtelxtrame extends Trai
{
	void signalStrenth()
	{
		System.out.println("Airtelxtrame signals Implementaion");
	}
}
class Jiofiber extends Trai
{
	void signalStrenth() 
	{
		System.out.println("jio fiber signal implementaion");
	}
}

class Wifirouter
{
	void reciver(Trai ref)
	{
		ref.signalStrenth();
	}
}
public class Program22 
{
	public static void main(String[] args) 
	{
		Wifirouter rot=new Wifirouter();
		rot.reciver(new Airtelxtrame());
		rot.reciver(new Actfiber());
		rot.reciver(new Jiofiber());
	}
}
