package com.qspiders.packages;

public class Program2 
{
	public static void main(String[] args) 
	{
		Program1 p1=new Program1();       //public
		System.out.println(p1.a);
		p1.test();
		System.out.println(p1.b);        //protected
		p1.run();
		System.out.println(p1.c);    //defualt
		p1.disp();
		
		// System.out.println(p1.out);     //private
		// p1.task();
		//we cant call the private variables and methods
		//without geter and seter method
		
		Program3 p3= new Program3();

		
		
	}
}
