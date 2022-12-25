package com.qspiders.encapsulation;

import com.qspiders.packages.Program3;
// import use present the class in different package 
import com.qspiders.packages.Program1;


public class Packageimport extends Program1
{
	public static void main(String[] args) 
	{
		Program1 p1=new Program1();
		System.out.println(p1.a); 	  //public
		p1.test();
		//System.out.println(p1.b);    //protected
		//p1.run();
		//System.out.println(p1.c);    //defualt
		//p1.disp();
		//System.out.println(p1.out);   //private
		//p1.task();
	
		System.out.println("=======================");
		Packageimport p4=new Packageimport();
		System.out.println(p4.b);    //public
		p4.run();
		System.out.println(p4.a);	//protected
		p4.test();
		//System.out.println(p4.c);  // defualt 
		//p4.disp();
		
		// System.out.println(p1.out);   //private
		// p1.task();


		Program3 p3= new Program3();
	}
	
}
