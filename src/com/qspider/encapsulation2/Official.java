package com.qspider.encapsulation2;

public class Official
{
	public static void main(String[] args) 
	{
		Kashmirfiles ref=new Kashmirfiles(123213,45.32f,234234.123);
		
		System.out.println(ref.getnoofkilled());
		System.out.println(ref.getlocation());
		System.out.println(ref.getpropertydamage());

		ref.setnoofkilled(24533123);
		ref.setlocation(34534345.1231132f);
		ref.setpropertydamage(324234.1231132);
		
		System.out.println(ref.getnoofkilled());
		System.out.println(ref.getlocation());
		System.out.println(ref.getpropertydamage());
	}
}
