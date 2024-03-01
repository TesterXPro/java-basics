package stringMethods;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) 
	{
	    int [] arr = {90,50,60,80,70}; //mutable
	    System.out.println(Arrays.toString(arr));
	    Arrays.sort(arr);
	    System.out.println(Arrays.toString(arr));
	    
	    String s = new String("welcome"); //immutable
	    System.out.println(s);
	    String concatstring = s.concat(" to String");
	    System.out.println(concatstring);
	    
	}

}
