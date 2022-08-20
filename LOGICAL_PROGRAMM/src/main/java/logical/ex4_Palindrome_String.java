package logical;

import java.util.Scanner;

public class ex4_Palindrome_String {
public static void main(String[] args) {
	
	System.out.println("**** A palindrome String is string that remains the same when its character are reversed like MADAM *****");
	
	Scanner scan = new Scanner(System.in);
	System.out.println("please enter the Sting");
	String str = scan.next();
	System.out.println(str);
	String compareString = str;
	String reverse = "";
	int len = str.length();

	//System.out.println("*************** 1st concatenatio method **********************");
	// a.charAt(length);
	System.out.println(len);
	for (int i = len - 1; i >= 0; i--) {
		reverse = reverse + str.charAt(i);

	}
	System.out.println("Reverse value=> " + reverse);
	if(compareString.equals(reverse)) {
		System.out.println("it is palindrome String ="+compareString);
	}
	else {
		System.out.println("it is not a palindrome string ");
	}
}
}
