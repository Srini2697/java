package com.qspiders.encapsulation;

public class Teamhead 
{
	public static void main(String[] args) 
	{
		ItRaid r1=new ItRaid("mys",6,8200000.500);
		System.out.println(r1.getraidedlocation());
		System.out.println(r1.getnohouseraided());
		System.out.println(r1.getamountseized());
		
		r1.setraidedlocation("bng");
		r1.setnohouseraided(5);
		r1.setamountseized(8100000.500);
		
		System.out.println(r1.getraidedlocation());
		System.out.println(r1.getnohouseraided());
		System.out.println(r1.getamountseized());
	}
}