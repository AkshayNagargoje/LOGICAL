package logical;

public class EX1_Swaping_2_NUMBERS {
	public static void main(String[] args) {
		// logic 1 creation of 3rd variable
		System.out.println("logic 1 ==> using 3  variable  ");
		int a = 10, b = 20;
		System.out.println("before swaping" + a + " " + b);

		int c = a; // c= a (10) ===> c=10
		a = b; // a= b (20) ===> a=20
		b = c; // c (10) = b(20) ==> b= 10 change/ swap
		// new a = 20 , b= 10

		System.out.println("after swaping " + a + " " + b);
		System.out.println();

		// logic 2 use +, - & - and without using 3rd variable
		System.out.println("logic 2 ==> by adding and sub without using 3rd variable ");
		int d = 10, e = 20;
		System.out.println("before swaping logic 2 ==>" + d + " " + e);
		d = d + e; // d= 10+20 ==> 30
		e = d - e; // e= 30-20 ==> 10
		d = d - e; // d= 30-10 ==> 20

		System.out.println("After swaping logic 2 ==>" + d + " " + e);
		System.out.println();
		 
		//Logic 3 ==> using * & / without using 3rd variable 
		// here f and g should not be zero 
		
		System.out.println("logic 3 ==> using * & / without using 3rd variable ");
        int f= 10 , g=20;
    	System.out.println("before swaping logic 3 ==>" + f + " " + g);
        f= f*g; //10*20=200
        g=f/g;  //200/20=10
        f=f/g;  //200/10=20
        System.out.println("after swaping logic 3 ==>" + f + " " + g);
        System.out.println();
        
        // LOGIC 4 BITWISE XOR (^)
        System.out.println("LOGIC 4 ==> BITWISE XOR (^)"); 
        // bitwise calculator online website easyonlineconvertor.com/convertor/bitwise-calculator.html  	
        // it a binary convertor 
        int h =10, i=20;
        System.out.println("before swaping logic 4 ==>" + h + " " + i);
        h=h^i;
        i=h^i;
        h=h^i;
        System.out.println("after swaping logic 4 ==>" + h + " " + i);
	System.out.println();
	
	//logic 5 ==> single Statment 
	System.out.println("logic 5 ==> single Statment ");
	int j=10,k=20;
	   System.out.println("before swaping logic 5 ==>" + j + " " + k);
	   k=j+k-(j=k);// 10+20 -(10=20) ===> 10+20 - (20)
	                               //===> 30-20==> k=10;
	   System.out.println("before swaping logic 5 ==>" + j + " " + k);
	}

}
