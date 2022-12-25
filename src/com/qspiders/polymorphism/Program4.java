package com.qspiders.polymorphism;


class Demo1
{
	int a=89;
	void test()
	{
		System.out.println("test method.....");
	}
}
class Demo2 extends Demo1
{
	double b=89.34;
}
class Demo3 extends Demo2
{
	byte w=3;
	void run()
	{
		System.out.println("run method....");
	}
	void disp()
	{
		System.out.println("disp method...");
	}
}
public class Program4 
{
	public static void main(String[] args) 
	{
		System.out.println("upcasting.......");
	    Demo2 d6=new Demo3();
	  //Demo3 d6=new Demo3();
	//	Demo2 d6=d3;
		System.out.println(d6.b);
		System.out.println(d6.a);
		d6.test();
		
		//System.out.println(d3.w);  //hidding the subclass
		//d3.run();
		//d3.disp();
		System.out.println("=====================");
		
		Demo1 d5=new Demo3();       
		d5.test();
		System.out.println(d5.a);
	//	System.out.println(d1.b); 
		
		System.out.println("===================");
		
		 Demo3 d3=new Demo3();
		 System.out.println(d3.a);
		 d3.test();
		 System.out.println(d3.b);
		 System.out.println(d3.w);
		 d3.run();
		 d3.disp();
		 
		 Demo2 d2=d3;
		 System.out.println(d2.b);
		 System.out.println(d2.a);
		 d2.test();
		 
		 
		 Demo1 d1=d2;
		 System.out.println(d1.a);
		 d1.test();
		  
	}
}
