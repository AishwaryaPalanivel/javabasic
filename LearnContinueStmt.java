package week1.day2;

public class LearnContinueStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1 2 Three 4 5 6 7 8 9 10
		for (int i = 1; i <=10; i++) {
			if(i==3) {//3==3
				System.out.println("Three");
				continue;
			}
			System.out.println(i);
			
		}
	}

}
