package day4;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "Welcome";
		String s1 = "Java";
		
		//length() used to find length of string
		System.out.println("Length of string :"+s.length());
		
		//concat() used to join 2 strings
		System.out.println(s.concat(s1));
		
		String s3 = "  welcome  ";
		
		// trim() used to remove spaces but not between the words only from left or right of words
		System.out.println("Before Trimming : "+s3);
		System.out.println("After Trimming : "+s3.trim());
		
		// charAt() returns the char value of the given index number. Index number starts from 0
		System.out.println("Char at index 3 :"+s.charAt(3));
		
		// contains() searches the sequence of characters in this string
		System.out.println("Search if 'Wel' in string : "+s.contains("Wel"));
		
		// equals() compare the two given strings based on the content of the string
		System.out.println("Equal or not :"+s.equals("Welcome"));
		System.out.println("Equal or not :"+s.equals("welcome"));
		
		// equalsIgnoreCase() Compares two strings on the basis of the content but it does not 
		// check the case like equals() method
		System.out.println("Ignore the case :"+s.equalsIgnoreCase("welcome"));
		System.out.println("Ignore the case :"+s.equalsIgnoreCase("Welcome"));
		
		/* replace() Returns a string, replacing all the old characters to new characters.
		   There are two methods:                                       
		 */
		
		String s4 = "Welcome to Java";
		System.out.println("Method 1: "+s4.replace('o', 'x'));
		System.out.println("Method 2: "+s4.replace("Java", "Selenium"));
		
		// Substring() returns the substring of a string based on starting and ending index
		System.out.println("Substring in between :"+s.subSequence(0,4));
		System.out.println("Substring in between :"+s.subSequence(1,3));
		
		//toLowerCase() returns the string in lower case
		//toUpperCase() returns the string in upper case
		System.out.println("In Upper Case :"+s.toUpperCase());
		System.out.println("In Lower Case :"+s.toLowerCase());

	}

}
