package oops;

public class ConstructorOverloading {
	
	int a=0;
	int b=0;
	double c=0;
	
	ConstructorOverloading() //first constructor
	{
	    a=10;
	    b=20;
		c=20.5;
	}
	ConstructorOverloading(int x,int y) //second constructor
	{
		a=x;
		b=y;
	}
	ConstructorOverloading(int x,double y)  //third constructor
	{
		a=x;
		c=y;
	}
	ConstructorOverloading(int x,int y,int z) //fourth constructor
	{
		a=x;
		b=y;
		c=z;
	}
	ConstructorOverloading(int x,double y,int z)  // fifth constructor
	{
		a=x;
		b=z;
		c=y;
	}
	
	void display() 
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		
		//ConstructorOverloading co = new ConstructorOverloading(); //call first constructor
		 //ConstructorOverloading co = new ConstructorOverloading(30,40); //call second constructor
		//ConstructorOverloading co = new ConstructorOverloading(50,30.4);  //call third constructor
		//ConstructorOverloading co = new ConstructorOverloading(50,30,60);  //call fourth constructor
		ConstructorOverloading co = new ConstructorOverloading(50,30.4,60);  //call third constructor
		
		
		
		co.display();
		

	}

}
