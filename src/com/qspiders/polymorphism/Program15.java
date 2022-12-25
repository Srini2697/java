package com.qspiders.polymorphism;

class Sam1
{
	byte r=5;
	void run()
	{
		System.out.println("run method........");
	}
}
class Sam2 extends Sam1
{
	int q=56;
}
class Sam3 extends Sam2
{
	void test()
	{
		System.out.println("test methos...");
	}
}
public class Program15
{
	public static void main(String[] args) 
	{
		Sam1 s1=new Sam3();
		System.out.println(s1.r);
		s1.run();
		Sam2 s2=(Sam2)s1;
		System.out.println(s2.r);
		s2.run();
		System.out.println(s2.q);
		
		Sam3 s3=(Sam3)s1;
		System.out.println(s3.r);
		s3.run();
		System.out.println(s3.q);
		s3.test();
	}
}
