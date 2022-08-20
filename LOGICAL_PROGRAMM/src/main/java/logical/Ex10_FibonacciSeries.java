package logical;

public class Ex10_FibonacciSeries {
public static void main(String[] args) {
	System.out.println("a series of number in which the number is ");
	System.out.println("the sum of the two preceding numbers");
	System.out.println("0,1,1,2,3,5,8,13,21.......n");
	 int n1 = 0,n2 =1 ,sum=0;

	 // n n1 sum = n+n1 sum 
	 System.out.print(n1+ " "+ n2);
	  for(int i=2;i<10;i++)
	  {
		   sum = n1+n2; //0+1,1+1 ,1+2
		   System.out.print(" "+sum);//1,2,3
		   n1=n2;//1 ,1,2
		   n2=sum;//1,2,3
	  }
	
}
}
