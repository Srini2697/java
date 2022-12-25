package com.qspiders.polymorphism;

class Hello 
{
	int a=78;
}
class Attitude
{
	void behavior()
	{
		System.out.println("behave yourself in class");
	}
}
class overacting
{
	String name="no comments";
}
class World
{
	void test(Object ob)
	{
		System.out.println("object class");
	}
}

public class Program12 
{
	public static void main(String[] args) 
	{
		World w1=new World();
		w1.test(new Attitude());
		w1.test(new overacting());
		w1.test(new Hello());
		w1.test(new Program12());
	}
}
