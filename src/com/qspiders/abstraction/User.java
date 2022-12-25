package com.qspiders.abstraction;

interface ZomatoCompany
{
	void menu();
	void onlineorder();
	void deliver();
}
class Empire implements ZomatoCompany
{
	public void menu()
	{
		System.out.println("north indian dish");
		System.out.println("south indian dish");
	}

	@Override
	public void onlineorder()
	{
	System.out.println("recive order from zomato");	
	System.out.println("prepare the order from empire ");
	System.out.println(" issue the order to zomato");
	}

	@Override
	public void deliver() 
	{
		System.out.println("hande over the order to customer");	
		
	}
}

class Taj implements ZomatoCompany
{
	public void menu()
	{
		System.out.println("north indian dish");
		System.out.println("south indian dish");
	}

	@Override
	public void onlineorder()
	{
	System.out.println("recive order from zomato");	
	System.out.println("prepare the order from Taj ");
	System.out.println(" issue the order to zomato");
	}

	@Override
	public void deliver() 
	{
		System.out.println("hande over the order to customer");	// TODO Auto-generated method stub
		
	}
}

class ZomatoApp
{
	ZomatoCompany selectRestourent(char ch)
	{
		if (ch=='e')
		{
			return new Empire();
		}
		else
		{
			return new Taj();

		}
	}
}

public class User
{
	public static void main(String[] args) 
	{
		ZomatoApp ref=new ZomatoApp();
		ZomatoCompany zc=ref.selectRestourent('t');
		zc.menu();
		zc.onlineorder();
		zc.deliver();
		
	}
}
