package oops;

public class StaticExample {
	
	int a;       //non static
	static int b;//static
	
	void m1()
	{
		System.out.println("I am non static method....");
	}
	static void m2()
	{
		System.out.println("I am a static method....");
	}
	void m3() //non static
	{
		a= 20; //non static variable
		b=30;  //static variable
		
		m1(); //non static method
		m2(); //static method
		
	}
	

	public static void main(String[] args) 
	{
		//static method can access only static stuff;
		m2();
		b=20;
		System.out.println(b);
		
		//a = 10; //not accessible becoz it is non static
		//m1; //not accessible becoz it is non static
         StaticExample se = new StaticExample();
         se.a=10;
         System.out.println(se.a);
         se.m1();
	}

}
