package arrays;

public class ArrayExample2 {

	public static void main(String[] args) {
		String s [] = new String[4];
		
		s[0]="Welcome";
		s[1]="to";
		s[2]="online";
		s[3]="training";
		System.out.println(s.length); //returns length of an array
		for(String i:s)
		{
		System.out.println(i);
		}

		
	}

}
