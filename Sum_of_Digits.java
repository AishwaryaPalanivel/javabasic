package practice_programs;

public class Sum_of_Digits {
public static void main(String[] args) {
	int input=201,original,remainder,sumofdigits = 0 ;
	original=input;
	while (original>0) {
		remainder=original%10;
		sumofdigits=sumofdigits+remainder;
		original=original/10;
	}
	System.out.println("The sumof digit is:"+sumofdigits);
	
}
}
