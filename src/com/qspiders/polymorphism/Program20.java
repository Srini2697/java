package com.qspiders.polymorphism;

class Father			
{
	void house()
	{
		System.out.println("pld house");
	}
}
class Son extends Father
{
	void house()
	{
		System.out.println("renovates the house");
	}
	void car()
	{
		System.out.println("car......");
	}
}
public class Program20
{
	public static void main(String[] args) 
	{
		Father ref=new Son();   // upcasting with overriding
		ref.house();
	//	ref.car();
		
		Son ref1=(Son)ref;		//downcasting
		ref1.house();
		ref1.car();
		
	//	System.out.println("==========");
	//	Son ref1=new Son();				
	//	ref1.house();								
	//	ref1.car();
		
	//	Father ref2=new Father();
	//	ref2.house();
		
	}
}
