package com.qspiders.polymorphism;

class Psycho
{
	void abnormal()
	{
		System.out.println("dont know what they do");
	}
}
class Human extends Psycho
{
	void normal() 
	{
		System.out.println("normal beheaviour");
	}
}

public class Program1 
{
	public static void main(String[] args) 
	{	
		Psycho ref=new Human(); //upcasting 
		ref.abnormal();
		
	}
}
