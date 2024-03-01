package stringMethods;

public class ReverseAString {

	public static void main(String[] args) {
		//Approach1
		String s = "welcome";
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--) 
		{
			rev = rev+(s.charAt(i));
			
		}
		System.out.println("The reverse string is:" +rev);
		
		//Approach2
		StringBuffer s1 = new StringBuffer("welcome");
		System.out.println("The reverse of the string is:" +s1.reverse());
		
        //Approach3
		StringBuilder s2 = new StringBuilder("selenium");
		System.out.println("The reverse of the string is:" +s2.reverse());
	}

}
