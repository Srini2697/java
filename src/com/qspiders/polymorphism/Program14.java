package com.qspiders.polymorphism;

class Demo11
{
	int a=56;
	void test()
	{
		System.out.println("test method...");
	}
}
class Demo12 extends Demo11
{
	void run()
	{
		System.out.println("run method....");
	}
}
public class Program14
{
	public static void main(String[] args) 
	{
		Demo11 ref=new Demo12();
		System.out.println(ref.a);
		ref.test();
	//	ref.run();    
		Demo12 ref2=(Demo12)ref;
		System.out.println(ref2.a);
		ref2.test();
        ref2.run(); 
	}
}
