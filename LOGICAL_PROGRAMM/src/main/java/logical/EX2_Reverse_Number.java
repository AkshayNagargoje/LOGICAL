package logical;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class EX2_Reverse_Number {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter the number");
	int num = sc.nextInt();
	// 1st approach  algorithm 
	int rev = 0;
	
	while(num!=0)
	{
		rev= rev*10 +num%10;
		System.out.println("rev "+rev);// 0+ 1234%10 = 4   40+3=43		430+2=432   4320+1=4321
		num= num/10;
		System.out.println("num "+ num); // 1234/10=123  123/10=12  12/10=1	 1/10=0
		
	}
	System.out.println("reverse number "+ rev);
	
	System.out.println();
	// STRINGBUFFER CLASS 
	System.out.println("using STRING BUFFER CLASS");
	 
	StringBuffer sb= new StringBuffer(String.valueOf(123456));
	StringBuffer rev1 = sb.reverse();
	System.out.println("reverse number "+ rev1);
	
	StringBuffer sb2 = new StringBuffer(String.valueOf("dcba"));
	StringBuffer rev2 = sb2.reverse();
	System.out.println("reverse number "+ rev2);
}
}
