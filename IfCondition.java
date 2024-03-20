package week1.day2;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=0;// input

// output = Check whether the given input is positive or negative or neutral

// Only if the input is greater than 0 -> Given input  is positive
// shortcut to create if block -> type if -> ctrl+space -> Enter
if (number>0) {//0>0->F
	System.out.println("The given number:"+number+" is positive");
	
}
else if (number<0) {//0<0->F
	System.out.println("The given number:"+number+" is negative");
	
}
else {
	System.out.println("The given number:"+number+" is Neutral");
}

	}

}
