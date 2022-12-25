package com.qspiders.polymorphism;

class Skill
{
	int ratings=3;
	void coading()
	{
		System.out.println("coading..");
	}
}
class Learning
{
	void concentrate(Object ob)
	{
		System.out.println("Object class");
		Skill st=(Skill)ob;
		System.out.println(st.ratings);
		st.coading();
	}
}
public class Program18 
{
	public static void main(String[] args) 
	{
		Learning l1=new Learning();
		l1.concentrate(new Skill());
	}
}
