import java.util.Scanner;
import java.util.InputMismatchException;
class student{
	 int roll;	
	private static int fees;

	void setdata(){
		int a=0;
		while(a==0){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter roll no.");
		try{
		roll=sc.nextInt();
		System.out.println("Enter fees");
		fees=sc.nextInt();a=1;
	}catch(InputMismatchException e){
		System.out.println("Invalid Entry");a=0;
	}}
	}
	 void display(){System.out.println("Fees:"+fees);}
	 void displayRoll(){System.out.println("Roll No:"+roll);}
}
public class test{
	public static void main(String[] args) {
		student s=new student();
		s.setdata();
		s.display();
		s.roll=123;
		s.displayRoll();
	}
}