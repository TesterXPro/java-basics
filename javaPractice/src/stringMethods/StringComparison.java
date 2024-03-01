package stringMethods;

public class StringComparison {

	public static void main(String[] args) {
		/*String s1 = "welcome";
		String s2 = "welcome";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));*/
		
		String s1 = new String("welcome");
		String s2 = new String("welcome");
		System.out.println(s1==s2); //to compare the objects
		System.out.println(s1.equals(s2)); //to compare the values of the objects

	}

}
