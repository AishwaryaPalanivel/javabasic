package practice_programs;



public class Second_smallest_number {

	public static void main(String[] args) {
		int data[]= {54,76,32,28,5,14};
		if (data.length<2) {
			System.out.println("invalid input");

		}else {
			int smallest=Integer.MAX_VALUE;
			int secondSmallest= Integer.MAX_VALUE;
			for (int i = 0; i < data.length; i++) {
				if (data[i]<smallest) {
					secondSmallest=smallest;
					smallest=data[i];
				}else if (data[i]<secondSmallest) {
					secondSmallest=data[i];

				}

			}
			System.out.println("The smallest number is: " +smallest +"and Second smallest number is: " + secondSmallest );
		}
	}
}
