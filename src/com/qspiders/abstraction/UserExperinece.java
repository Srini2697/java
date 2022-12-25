package com.qspiders.abstraction;

interface Upiapp
{
	void sendMoney();
	void reciveMoney();
	void checkbalance();
}
// object implementation layer
class Phonepe implements Upiapp
{
	public void sendMoney() 
	{
		System.out.println("connect phonepe sender bank gatway");
		System.out.println("verify the sender");
		System.out.println("connect phonepe Reciver bank gatway");
		System.out.println("verify the Reciver");
		System.out.println("after verifiy send the money to reciver");
	}
	public void reciveMoney()
	{
		System.out.println("connect phonepe Reciver bank gatway");
		System.out.println("verify the Reciver");
		System.out.println("after verifiy Reciver he will get the money from sender");
	}
	public void checkbalance() 
	{
		System.out.println("connect phonepe  bankaccount gatway");
		System.out.println("verify the bankaccount");
		System.out.println("disply the balance amount");	
	}
}


class Gpay implements Upiapp
{
	public void sendMoney() 
	{
		System.out.println("connect Gpay sender bank gatway");
		System.out.println("verify the sender");
		System.out.println("connect Gpay Reciver bank gatway");
		System.out.println("verify the Reciver");
		System.out.println("after verifiy send the money to reciver");
	}
	public void reciveMoney()
	{
		System.out.println("connect Gpay Reciver bank gatway");
		System.out.println("verify the Reciver");
		System.out.println("after verifiy Reciver he will get the money from sender");
	}
	public void checkbalance() 
	{
		System.out.println("connect Gpay  bankaccount gatway");
		System.out.println("verify the bankaccount");
		System.out.println("disply the balance amount");	
	}
}
//object creation layer
class Mobilephone
{
	Upiapp selectapp(char type)
	{
		if(type=='p')
		{
			return new Phonepe();
		}
		else
		{
			return new Gpay();
		}
	}
}
//object utilization
public class UserExperinece 
{
	public static void main(String[] args) 
	{
		Mobilephone ref=new Mobilephone();
		Upiapp  m1=ref.selectapp('p');
		m1.sendMoney();
		m1.reciveMoney();
		m1.checkbalance();
		
	}
}
