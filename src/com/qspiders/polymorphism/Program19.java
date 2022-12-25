package com.qspiders.polymorphism;

class Day1
{
	void brain()
	{
		System.out.println("java is difficult");
	}
}
class Today extends Day1
{
	void brain()
	{
		System.out.println("java made easy with trainer effects");
	}
}
public class Program19 
{
	public static void main(String[] args) 
	{
		Today tod=new Today();  //over raiding
		tod.brain();
		
	}
}
