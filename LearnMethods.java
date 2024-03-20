package week1.day2;

public class LearnMethods {
	// shortcut to create a method -> type method name -> ctrl+space -> click enter
	private int noofbicylce() {
		// TODO Auto-generated method stub
return 2;
	}
	public String bicycledata(String brandName,String brandColor) {
	// TODO Auto-generated method stub
return brandName+" "+brandColor;

}
public boolean isJavaPlatformDependaent() {
	// TODO Auto-generated method stub
return false;
}
public void addTwoNumbers(int num1,float num2) {
System.out.println(num1+num2);
	}
public static void main(String[] args) {
	 // Classname objectname = new Classname();
	LearnMethods lm=new LearnMethods();
	lm.addTwoNumbers(23, 2.3f);
	boolean result =lm.isJavaPlatformDependaent();
System.out.println(result);
String data=lm.bicycledata("Honda", "Red");
System.out.println(data);
}

}