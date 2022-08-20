package logical;

public class ex8_SumofDigit {
public static void main(String[] args) {
	int num= 1234;
	int sum =0;
	while(num>0)
	{
		int num2= num%10;
		
		sum = sum+num2; // sir ways ==> sum = sum+num%10
		num= num/10; 
	}
	System.out.println(sum);
}
}
