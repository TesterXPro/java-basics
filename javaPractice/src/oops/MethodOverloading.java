package oops;

public class MethodOverloading {
	
	int a;
	int b;
	void sum()
	{
		a=10;
		b=20;
		System.out.println(a+b);
	}
	void sum(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(x+y);
	}
	void sum(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}
	void sum(int x,double y) 
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) 
	{
		MethodOverloading m = new MethodOverloading();
		m.sum();
		m.sum(20, 30);
		m.sum(20, 20, 5);
		m.sum(20, 60.5);

	}

}
