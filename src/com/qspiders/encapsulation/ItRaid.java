package com.qspiders.encapsulation;

public class ItRaid 
{
	private String raidedlocation;
	private int nohouseraided;
	private double amountseized;
	
	ItRaid(String raidedlocation,int nohouseraided,double amountseized)
	{
	this.raidedlocation=raidedlocation;
	this.nohouseraided=nohouseraided;
	this.amountseized=amountseized;
	}
	
	public String getraidedlocation()
	{
		System.out.println("genrate code");
		System.out.println("validate the code");
		return raidedlocation;
	}
	public int getnohouseraided()
	{
		System.out.println("genrate code");
		System.out.println("validate the code");
		return nohouseraided;
	}
	public double getamountseized()
	{
		System.out.println("genrate code");
		System.out.println("validate the code");
		return amountseized;
	}
	public void setraidedlocation(String loc)
	{
		System.out.println("genrate code");
		System.out.println("validate the code");
		raidedlocation=loc;
	}
	
	public void setnohouseraided(int hos)
	{
		System.out.println("genrate code");
		System.out.println("validate the code");
		nohouseraided=hos;
	}
	public void setamountseized(double amo)
	{
		System.out.println("genrate code");
		System.out.println("validate the code");
		amountseized=amo;
	}
	
}
