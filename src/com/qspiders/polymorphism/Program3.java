package com.qspiders.polymorphism;
  
 
class landline
{
	void calling()
	{
		System.out.println("calling....");
	}
	
}
class mobile extends landline
{
	void browser()
	{
		System.out.println("use internet....");
	}
	void camera()
	{
		System.out.println("take pics...");
	}
}
public class Program3 
{
	public static void main(String[] args) 
	{
		mobile m1=new mobile();
		m1.calling();
		m1.browser();
		m1.camera();
		System.out.println("====================");
		landline l1=m1;  //upcasting
		l1.calling();
		//l1.browser();
		//l1.camera(); 
		System.out.println("==================");
		
		landline m2=new mobile();
		m2.calling();
		//m2.browser();
		//m2.camera();
		
				
	}
}
