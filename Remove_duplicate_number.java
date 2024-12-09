package practice_programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicate_number {
	public static void main(String[] args) {
		int[] data={1,3,3,3,3,5,6,6,7,7,7};
		 // Get the length of the array
		int n=data.length;
		//// LinkedHashSet is used to store the duplicate numbers (preserving the order of insertion)
		Set<Integer> dupNumbers = new LinkedHashSet<Integer>();
	    // Outer loop to iterate through each element of the array
		for (int i = 0; i < n; i++) {
			 // Inner loop to compare the current element with all subsequent elements
			for (int j = i+1; j < n; j++) {
				//If a duplicate is found
				if (data[i]==data[j]) {
					// Add the duplicate element to the set (this ensures duplicates are stored only once)
					dupNumbers.add(data[i]);

				}

			}

		}
		System.out.println(dupNumbers);
		System.out.println();
	}
}

