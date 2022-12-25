package com.qspiders.polymorphism;

class  Parent
{  
	   void PrintData() 
	   {  
	      System.out.println("method of parent class");  
	   }  
}  
	  
class Child extends Parent
{  
	   void PrintData1() 
	   {  
	      System.out.println("method of child class");  
	   }  
}  
class Upcasting1
{  
	   public static void main(String args[])
	   {  
		   Parent obj1=new Child();
		   Parent obj2=new Child();
	      obj1.PrintData();  
	    obj2.PrintData();  
	  
	    System.out.println("================");
	    Parent p1=new Child();
	    p1.PrintData();
	    
	   }  
}  
