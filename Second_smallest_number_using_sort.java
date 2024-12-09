package practice_programs;

import java.util.Arrays;

public class Second_smallest_number_using_sort {
	public static void main(String[] args) {
	int data[]= {54,76,32,28,5,14};
	Arrays.sort(data);
	System.out.println("The second smallest number is: "+data[1]);
}
}