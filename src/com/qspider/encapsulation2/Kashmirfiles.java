package com.qspider.encapsulation2;

public class Kashmirfiles
{
	private int noofkilled;
	private float location;
	private double propertydamage;
	
	Kashmirfiles(int noofkilled,float location,double propertydamage)
	{
		this.noofkilled=noofkilled;
		this.location=location;
		this.propertydamage=propertydamage;
	} 
		
		public int getnoofkilled()
		{
			System.out.println("generate special code");
			System.out.println("validate the special code");
			return noofkilled;
		}
		public float getlocation()
		{
			System.out.println("generate special code");
			System.out.println("validate the special code");
			return location;
		}
		
		public double getpropertydamage()
		{
			System.out.println("generate special code");
			System.out.println("validate the special code");
			return propertydamage;
		}
		
		public void setnoofkilled(int kl)
		{
			System.out.println("generate special code");
			System.out.println("validate the special code");
			noofkilled=kl;
		}
		public void setlocation(float lc)
		{
			System.out.println("generate special code");
			System.out.println("validate the special code");
			location=lc;
		}
		
		public void setpropertydamage(double pr)
		{
			System.out.println("generate special code");
			System.out.println("validate the special code");
			propertydamage=pr;
		}
}
	
