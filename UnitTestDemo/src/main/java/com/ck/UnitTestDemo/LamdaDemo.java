package com.ck.UnitTestDemo;


interface Squre{
	public abstract int squre(int s);
}
public class LamdaDemo {
	int no=1;
	
	public void m1(){
		int no1=2;
		//Squre s=(n)->{return n*n;};
		Squre s=(n)->{
			no=2;//class instance variable can be changed in lamada expression
			//no1=2; //local variable must be final or effictivly final
			System.out.println(no1);
			int a=10;
			a= a + no1+no;			 
			return a;
		};
		int j=s.squre(1);
		System.out.println(j);
	}
}
