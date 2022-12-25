package com.qspiders.polymorphism;

class Sample11
{
	int a=45;
	void test()
	{
		System.out.println("test method....");
	}
}
class Sample12 extends Sample11
{
	double b=45.23;
	void run()
	{
		System.out.println("executing run method....");
	}
}
public class Program17 
{
	public static void main(String[] args) 
	{	
	
		Object ref=new Sample12();   //upcasting
	//	ref.test();
	//	ref.run();
		
		Sample11 s1=(Sample11)ref;		//downcasting
		System.out.println(s1.a);
		s1.test();
		
	
		Sample12 s2=(Sample12)ref;
		System.out.println(s2.a);
		s2.test();
		s2.run();
		System.out.println(s2.b);
								
	//	Sample11 ref=new Sample12();
	//	System.out.println(ref.a);
	//	ref.test();

	//	Sample12 s2=(Sample12)ref;
	//	System.out.println(s2.a);
	//	s2.test();
	//	s2.run();
	//	System.out.println(s2.b);
	}
}