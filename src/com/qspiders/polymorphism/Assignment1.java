package com.qspiders.polymorphism;


class EarnMoney
{
	void invest()
	{
		System.out.println("there are lots of way to Earn the Money");
	}
}
class Srinivas extends EarnMoney
{
	void invest()
	{
		System.out.println("invest time and Money to Do bussines");
	}
}
class Likith extends EarnMoney
{
	void invest()
	{
		System.out.println("invest time to do job");
	}
}
class Girish extends EarnMoney
{
	void invest()
	{
		System.out.println("invest time and Money to do trading");
	}
}
class Chethan extends EarnMoney
{
	void invest()
	{
		System.out.println("invest time and Money to do job and trading");
	}
}
class Earnings	 				//polymorphism
{
	void monthend(EarnMoney erm)
	{
		erm.invest();
	}
}

public class Assignment1
{
	public static void main(String[] args) 
	{
		Earnings sal=new Earnings();
		sal.monthend(new Srinivas());
		sal.monthend(new Likith());
		sal.monthend(new Girish());
		sal.monthend(new Chethan());
		
		
		
	}
}
