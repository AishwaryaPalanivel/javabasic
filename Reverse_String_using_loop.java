package practice_programs;

public class Reverse_String_using_loop {

	public static void main(String[] args) {
		String original=" i am going out today";
		String reverse="";
		//check string is empty
		if(!original.isEmpty()) {
			//loop through original from end to start
			for (int i = original.length() -1;i >= 0;  i--) {     
				//append each character to the reversed string
				reverse +=original.charAt(i);
			} }
			else {
				System.out.println("the string is empty");
			}

			System.out.println("the original string is: " + original);
			System.out.println("the reverse string is: " + reverse);

		}
	}
