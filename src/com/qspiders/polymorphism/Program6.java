package com.qspiders.polymorphism;

class Laptop
{
	boolean internet=true;
	void browser(String link)
	{
		System.out.println("use link and join");
	}
}
class Person
{
	void onlineclass(Laptop la1)
	{
		System.out.println(la1.internet);
	la1.browser("qspider.com");
	}
}
public class Program6 
{
	public static void main(String[] args) 
	{
		Person p1=new Person();
		p1.onlineclass(new Laptop());
	}
}
