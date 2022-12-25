package com.qspider.libraies;

import java.util.Scanner;

public class Program1 
{
	public static void main(String[] args) 
	{
	System.out.println("welcom to Register");
	Scanner ref=new Scanner(System.in);
	System.out.println("enter the name");
	String name=ref.next();
	System.out.println("Name="+name);
	System.out.println("enter the age");
	int age=ref.nextInt();
	System.out.println("age="+age);
	System.out.println("enter the phno");
	long phno=ref.nextLong();
	System.out.println("phno="+phno);
	String sentance=ref.nextLine();
	System.out.println("Sentance="+sentance);
	}

}

