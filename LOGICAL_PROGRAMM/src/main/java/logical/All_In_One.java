package logical;

import java.util.Scanner;

public class All_In_One {

	/*
	 * 
	 * public class EX1_Swaping_2_NUMBERS {
	 * 
	 * public static void main(String[] args) { // logic 1 creation of 3rd variable
	 * System.out.println("logic 1 ==> using 3  variable  "); int a = 10, b = 20;
	 * System.out.println("before swaping" + a + " " + b);
	 * 
	 * int c = a; // c= a (10) ===> c=10 a = b; // a= b (20) ===> a=20 b = c; // c
	 * (10) = b(20) ==> b= 10 change/ swap // new a = 20 , b= 10
	 * 
	 * System.out.println("after swaping " + a + " " + b); System.out.println();
	 * 
	 * // logic 2 use +, - & - and without using 3rd variable System.out.
	 * println("logic 2 ==> by adding and sub without using 3rd variable "); int d =
	 * 10, e = 20; System.out.println("before swaping logic 2 ==>" + d + " " + e); d
	 * = d + e; // d= 10+20 ==> 30 e = d - e; // e= 30-20 ==> 10 d = d - e; // d=
	 * 30-10 ==> 20
	 * 
	 * System.out.println("After swaping logic 2 ==>" + d + " " + e);
	 * System.out.println();
	 * 
	 * //Logic 3 ==> using * & / without using 3rd variable // here f and g should
	 * not be zero
	 * 
	 * System.out.println("logic 3 ==> using * & / without using 3rd variable ");
	 * int f= 10 , g=20; System.out.println("before swaping logic 3 ==>" + f + " " +
	 * g); f= f*g; //10*20=200 g=f/g; //200/20=10 f=f/g; //200/10=20
	 * System.out.println("after swaping logic 3 ==>" + f + " " + g);
	 * System.out.println();
	 * 
	 * // LOGIC 4 BITWISE XOR (^) System.out.println("LOGIC 4 ==> BITWISE XOR (^)");
	 * // bitwise calculator online website
	 * easyonlineconvertor.com/convertor/bitwise-calculator.html // it a binary
	 * convertor int h =10, i=20; System.out.println("before swaping logic 4 ==>" +
	 * h + " " + i); h=h^i; i=h^i; h=h^i;
	 * System.out.println("after swaping logic 4 ==>" + h + " " + i);
	 * System.out.println();
	 * 
	 * //logic 5 ==> single Statment
	 * System.out.println("logic 5 ==> single Statment "); int j=10,k=20;
	 * System.out.println("before swaping logic 5 ==>" + j + " " + k);
	 * k=j+k-(j=k);// 10+20 -(10=20) ===> 10+20 - (20) //===> 30-20==> k=10;
	 * System.out.println("before swaping logic 5 ==>" + j + " " + k); }
	 * 
	 * ***********************************************************************
	 * ************************** EX 2 **************************************
	 * 
	 *
	 * public class EX2_Reverse_Number { public static void main(String[] args) {
	 * Scanner sc = new Scanner(System.in);
	 * System.out.println("please enter the number"); int num = sc.nextInt(); // 1st
	 * approach algorithm int rev = 0;
	 * 
	 * while(num!=0) { rev= rev*10 +num%10; System.out.println("rev "+rev);// 0+
	 * 1234%10 = 4 40+3=43 430+2=432 4320+1=4321 num= num/10;
	 * System.out.println("num "+ num); // 1234/10=123 123/10=12 12/10=1 1/10=0
	 * 
	 * } System.out.println("reverse number "+ rev);
	 * 
	 * System.out.println(); // STRINGBUFFER CLASS
	 * System.out.println("using STRING BUFFER CLASS");
	 * 
	 * StringBuffer sb= new StringBuffer(String.valueOf(123456)); StringBuffer rev1
	 * = sb.reverse(); System.out.println("STRING BUFFER reverse number "+ rev1);
	 * 
	 * StringBuffer sb2 = new StringBuffer(String.valueOf("dcba")); StringBuffer
	 * rev2 = sb2.reverse(); System.out.println(" STRING BUFFER reverse number "+
	 * rev2);
	 * 
	 * System.out.println();
	 * 
	 * // STRING BUILDER System.out.println("using STRING BUILDER CLASS");
	 * StringBuilder sb3= new StringBuilder(); sb3.append(987654); StringBuilder
	 * rev4 =sb3.reverse(); System.out.println("STRING BULDER reverse number "+
	 * rev4);
	 * 
	 * } *************************************************************************
	 * *************************** EX 3 ****************************************
	 * 
	 * 
	 * public class ex3_reverseString { public static void main(String[] args) { //
	 * using concat operator (String Concatenation ) String a = "ABC"; String
	 * reverse = "";
	 * 
	 * // 1st length of string ==> then iterate string in loop // extract the and
	 * savein reverse variable // then concat and save the string in reverse var //
	 * two method string===> length() & charat() int len = a.length();
	 * 
	 * System.out.
	 * println("*************** 1st concatenatio method **********************"); //
	 * a.charAt(length); System.out.println(len); for (int i = len - 1; i >= 0; i--)
	 * { reverse = reverse + a.charAt(i);
	 * 
	 * } System.out.println("1st Reverse way (Concatenation)=> " + reverse);
	 * System.out.println();
	 * 
	 * System.out.println("************* 2nd Char ARRAY **************"); String b =
	 * "ABCD"; char cha[] = b.toCharArray(); System.out.println(cha); int ab
	 * =cha.length; String revs = ""; for(int i = ab-1;i>=0;i--) { revs =
	 * revs+cha[i]; } System.out.println("Char Array method ==> "+revs);
	 * 
	 * System.out.println();
	 * System.out.println("************* 3rd String buffer class **********");
	 * String s= "dcba"; StringBuffer str = new StringBuffer(s);
	 * System.out.println("String buffer class ==> "+ str.reverse()); }
	 * 
	 * *****************************************************************************
	 * ************************* EX 4 **********************************************
	 * 
	 * 
	 * public class ex4_Palindrome_String { public static void main(String[] args) {
	 * 
	 * System.out.
	 * println("**** A palindrome String is string that remains the same when its character are reversed like MADAM *****"
	 * );
	 * 
	 * Scanner scan = new Scanner(System.in);
	 * System.out.println("please enter the Sting"); String str = scan.next();
	 * System.out.println(str); String compareString = str; String reverse = ""; int
	 * len = str.length();
	 * 
	 * //System.out.
	 * println("*************** 1st concatenatio method **********************"); //
	 * a.charAt(length); System.out.println(len); for (int i = len - 1; i >= 0; i--)
	 * { reverse = reverse + str.charAt(i);
	 * 
	 * } System.out.println("Reverse value=> " + reverse);
	 * if(compareString.equals(reverse)) {
	 * System.out.println("it is palindrome String ="+compareString); } else {
	 * System.out.println("it is not a palindrome string "); } }
	 * 
	 * ******************************************************************************
	 * **************************** EX 5 ********************************************
	 * 
	 * 
	 */
}
