package practice_programs;

public class Prime_number {
	public static void main(String[] args) {
		int n=173;
		
		for (int i = 2; i <=n/2; i++) {
			if (n%i==0) {
				System.out.println("The given number is prime-"+n);
				break;
				
			}else {
				System.out.println("The given number is not prime-"+n);
				break;
			}
			
		}
		
	}


}
