package BasicPrograms;

public class LargestOfThree {

	public static void main(String[] args) {
		int a = 30;
		int b =20;
		int c = 10;
		if((a>b) && (a>c))
		{
			System.out.println("a is largest");
		}else if ((b>c) && (b>a))
		{
			System.out.println("b is largest");
		}else if((c>a) && (c>b)) 
		{
			System.out.println("c is largest");
		}

		
	}

}
