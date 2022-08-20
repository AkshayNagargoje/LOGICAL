package logical;

public class Ex7_CountOddEven {
public static void main(String[] args) {
	 int num = 456451;
	 
	 int even_count= 0;
	 int odd_count=0;
	 
	while(num>0)
	{
		int rem = num%10;
		
		if(rem%2==0)
		{
			even_count++;
			System.out.println("even no="+rem);
		}
		else
		{
			System.out.println("odd no="+rem);
			odd_count++;
		}
		num= num/10;
	}
	System.out.println("the count of even num ="+ even_count);
	System.out.println("the count of odd num ="+ odd_count);
}
}
