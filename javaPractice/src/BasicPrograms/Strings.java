package BasicPrograms;

public class Strings {

	public static void main(String[] args) {
		String s1="welcome to";
		String s2=" training";
		
		//concat
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		//Equals
		String s3="WELCOME";
		String s4 = "welcome";
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		System.out.println(s3.substring(0,3)); //WEL
		System.out.println(s3.substring(2,6)); //LCOM
		
		System.out.println(s4.replace('e','a'));
		System.out.println(s4.replace("come","gone"));
		System.out.println(s1.length());
	}

}
