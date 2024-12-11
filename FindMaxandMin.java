package practice_programs;

import java.util.Iterator;

public class FindMaxandMin {
	public static void main(String[] args) {
		int [] data = {1, 45, 77, 88, 33, 23, 4};
		int smallnumber=data[0];
		int largernumber=data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i]> largernumber) {
				largernumber=data[i];
				
			}else if (data[i]<smallnumber) {
				smallnumber=data[i];
			}
			
		}
		System.out.println("the largest number is =>"+largernumber);
		System.out.println("the largest number is =>"+ smallnumber);
	}

}
