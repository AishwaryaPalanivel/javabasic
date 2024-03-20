package week1.day1;

public class LearnOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a= 21;
int b=5;
System.out.println(a+b);
System.out.println(a-b);
System.out.println(a*b);
System.out.println(a/b);
System.out.println(a%b);

System.out.println(a==b);
System.out.println(a!=b);
System.out.println(a<b);
System.out.println(a>b);
System.out.println(a<=b);
System.out.println(a>=b);

System.out.println(a<b && a>b);//21<5->f&&21>5->t both are true
System.out.println(a<b || a>b);

System.out.println(a++);//post increment->21+1
System.out.println(a);
System.out.println(++a);//pre increment->22+1
	}

}
