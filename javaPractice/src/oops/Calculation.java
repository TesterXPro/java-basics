package oops;

public class Calculation {
	
	int a;
	int b;
	//1)method may not take parameters
	//method may not return any value
	/*void sum() 
	{
		System.out.println(a+b);
	}*/
	//2)method may take parameters
	/*void sum(int x,int y) 
	{
		a=x;
		b=y;
		System.out.println(a+b);
	}*/
	//method may return some value
			int sum()
			{
				return a+b;
			}

	public static void main(String[] args) 
	{
		Calculation cal = new Calculation();
		/*cal.a=100;
		cal.b=200;
		cal.sum();*/
		//cal.sum(1000, 2000);
		cal.a=100;
		cal.b=200;
		int r=cal.sum();
		System.out.println(r);
	 
		

	}

}
