package com.qspiders.polymorphism;

class Atmcard
{
	long cardnumber=5731838172128l;
	void swip()
	{
		System.out.println("swip to transact");
	}
}
class Bank
{
	void atmMachine(Atmcard ref)
	{
		ref.swip();
		System.out.println(ref.cardnumber);
	}
}
public class Program5 
{
	public static void main(String[] args) 
	{
		Bank b1=new Bank();
		b1.atmMachine(new Atmcard());
		
	}
}
