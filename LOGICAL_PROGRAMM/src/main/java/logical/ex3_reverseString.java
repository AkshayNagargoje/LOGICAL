package logical;

public class ex3_reverseString {
	public static void main(String[] args) {
		// using concat operator (String Concatenation )
		String a = "ABC";
		String reverse = "";

		// 1st length of string ==> then iterate string in loop
		// extract the and savein reverse variable
		// then concat and save the string in reverse var
		// two method string===> length() & charat()
		int len = a.length();

		System.out.println("*************** 1st concatenatio method **********************");
		// a.charAt(length);
		System.out.println(len);
		for (int i = len - 1; i >= 0; i--) {
			reverse = reverse + a.charAt(i);

		}
		System.out.println("1st Reverse way (Concatenation)=> " + reverse);
		System.out.println();

		System.out.println("************* 2nd Char ARRAY **************");
		String b = "ABCD";
		char cha[] = b.toCharArray();
		System.out.println(cha);
		int ab =cha.length;
		String revs = "";
		for(int i = ab-1;i>=0;i--) {
			revs = revs+cha[i];		
		}
		System.out.println("Char Array method ==> "+revs);
		
		System.out.println();
		System.out.println("************* 3rd String buffer class **********");
		String s= "dcba";
		StringBuffer str = new StringBuffer(s);
        System.out.println("String buffer class ==> "+ str.reverse());
	}
}
