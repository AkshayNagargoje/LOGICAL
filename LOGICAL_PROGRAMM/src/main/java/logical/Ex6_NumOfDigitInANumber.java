package logical;

import java.util.Scanner;

public class Ex6_NumOfDigitInANumber {
public static void main(String[] args) {
	System.out.println("123456  ==> count 6 ");
Scanner scan = new Scanner(System.in);
int num = scan.nextInt();
int count = 0;

 while(num>0) {
	 num = num/10;
	 count++;
 }
 System.out.println("the count is ="+ count);


}
}
