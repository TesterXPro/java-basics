package arrays;

public class TwoDimensionalArray1 {

	public static void main(String[] args) {
		int a[][]= {{30,45,60},{23,34,67},{56,82,37},{12,34,56},{87,45,46}};
		
		for(int i[]:a) 
		{
			for(int j:i) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
