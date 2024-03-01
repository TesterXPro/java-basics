package stringMethods;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		//String s = "welcome";
		//to find the length of a string
		//System.out.println(s.length());
		
		String s1="  welcome  ";
		String s2="to ";
		String s3="java ";
		String s4="automation";
		
		//concat
		System.out.println(s1 +s2 +s3);
		System.out.println(s1.concat(s2)+s3.concat(s4));
		
		//trim
		System.out.println("before trimming " +s1.length());
		System.out.println("after trimmed "+s1.trim().length());
		
		//charAt
		String s5 = "welcome";
		System.out.println(s5.charAt(0));
		System.out.println(s5.charAt(3));
		
		//contains
		String s6 = "automation";
		System.out.println(s6.contains("aut")); //true
		System.out.println(s6.contains("ma"));  //true
		System.out.println(s6.contains("COME")); //false
		
		//equals //equal ignore case
		System.out.println(s6.equals("automation"));  //true
		System.out.println(s6.equals("automaTION"));  //false
		System.out.println(s6.equalsIgnoreCase("AUTOMATION"));
		
		//replace
		String s7 = "selenium java";
		System.out.println(s7.replace('e','a'));
		System.out.println(s7.replace("java", "c++"));
		System.out.println(s7);
		
		//substring
		String s8 = "selenium";
		System.out.println(s8.substring(0,3));
		System.out.println(s8.substring(4,8));
		
		//split
		String s9 = "abc@gmail.com";
		String a[]=s9.split("@");
		System.out.println(Arrays.toString(a));
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		//to lower case
		String color = "BLUE";
		System.out.println(color.toLowerCase());
		
		//ex1
		String amount = "$15,20,25";
		System.out.println(amount.replace("$", ""));
		System.out.println(amount.replace("$", "").replace(",",""));
		
		//ex2
		String s = "abc,123@xyz";
		String[] arr1 = s.split(",");
		System.out.println(Arrays.toString(arr1));
		String[] arr2 = arr1[1].split("@");
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
		//ex3
		String s10 = "abc 123 xyz";
		String[]b = s10.split(" ");
		System.out.println(Arrays.toString(b));
		
		//ex4
		String name = "John kenedy";
		System.out.println(name.contains("john"));
		System.out.println(name.replace('J', 'j').contains("john"));
		System.out.println(name.toLowerCase().contains("john"));
		
		
		
		
		
	

	}

}
