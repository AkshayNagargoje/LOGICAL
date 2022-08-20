package logical;

import java.util.Scanner;

public class ex5_Palindrome_number {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the number ");
	int num = scan.nextInt();
	int compare = num;
	
	int rev = 0 ;
	while(num!=0) {
		rev= rev*10 +num%10;
		num= num/10;
	}
	System.out.println(rev);
	if(compare==rev) {
		System.out.println("this is palindrome");
	}else {
		System.out.println("this is not palindrome ");
	}
}
}
