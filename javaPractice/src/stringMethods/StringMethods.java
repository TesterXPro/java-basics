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
		System.out.println("1" +s1 +s2 +s3);
		System.out.println("2" +s1.concat(s2)+s3.concat(s4));
		
		//trim
		System.out.println("3" +"before trimming " +s1.length());
		System.out.println("4" +"after trimmed "+s1.trim().length());
		
		//charAt
		String s5 = "welcome";
		System.out.println("5" +s5.charAt(0));
		System.out.println("6" +s5.charAt(3));
		
		//contains
		String s6 = "automation";
		System.out.println("7" +s6.contains("aut")); //true
		System.out.println("8" +s6.contains("ma"));  //true
		System.out.println("9" +s6.contains("COME")); //false
		
		//equals //equal ignore case
		System.out.println("10" +s6.equals("automation"));  //true
		System.out.println("11" +s6.equals("automaTION"));  //false
		System.out.println("12" +s6.equalsIgnoreCase("AUTOMATION"));//true
		
		//replace
		String s7 = "selenium java";
		System.out.println("13" +s7.replace('e','a'));
		System.out.println("14" +s7.replace("java", "c++"));
		System.out.println("15" +s7);
		
		//substring
		String s8 = "selenium";
		System.out.println("16" +s8.substring(0,3));
		System.out.println("17" +s8.substring(4,8));
		
		//split
		String s9 = "abc@gmail.com";
		String a[]=s9.split("@");
		System.out.println("18" +Arrays.toString(a));
		System.out.println("19" +a[0]);
		System.out.println("20" +a[1]);
		
		//to lower case
		String color = "BLUE";
		System.out.println("21" +color.toLowerCase());
		
		//ex1
		String amount = "$15,20,25";
		System.out.println("22 " +amount.replace("$", ""));
		System.out.println("23 " +amount.replace("$", "").replace(",",""));
		
		//ex2
		String s = "abc,123@xyz";
		String[] arr1 = s.split(",");
		System.out.println("24" +Arrays.toString(arr1));
		String[] arr2 = arr1[1].split("@");
		System.out.println("25" +Arrays.toString(arr2));
		
		System.out.println("26" +arr1[0]);
		System.out.println("27" +arr2[0]);
		System.out.println("28" +arr2[1]);
		
		//ex3
		String s10 = "abc 123 xyz";
		String[]b = s10.split(" ");
		System.out.println("29" +Arrays.toString(b));
		
		//ex4
		String name = "John kenedy";
		System.out.println("30" +name.contains("john"));
		System.out.println("31" +name.replace('J', 'j').contains("john"));
		System.out.println("32" +name.toLowerCase().contains("john"));
		
		
		
		
		
	

	}

}
