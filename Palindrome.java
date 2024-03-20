package week1.ass;

public class Palindrome {

public static void main(String[] args) {
	 int a = 1234;
	 int m = a;
	 int d = 4;
	 int ne = 0;
	 int r;
	 
	 for (int i = d; i > 0; --i) {
		
		 r = a%10;
		 a = a/10;
		 ne = ne + (r * (int)Math.pow (10, (i-1)));
		 System.out.println(ne);
		 
	}
	 if(m == ne)
	  System.out.println("The given number is a Palindrome: " + m);
	 else
		 System.out.println("The given number is not a Palindrome: " + m); 
}
}
