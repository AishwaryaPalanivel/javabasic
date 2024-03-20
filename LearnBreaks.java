package week1.day2;

public class LearnBreaks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print numbers from 1to3>print 3 in words and break the iteration
		
for (int i = 1; i <=10; i++) {//i=1;1<=10->t;1++
	if(i==3) {//1==3->f
		System.out.println("Three");
		break;
	}
	System.out.println(i);//1
}
System.out.println("out of loop");
	}

}
