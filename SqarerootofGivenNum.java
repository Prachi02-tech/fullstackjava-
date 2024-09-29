import java.util.Scanner;
public class SqarerootofGivenNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        double num = sc.nextDouble();
	        double squareroot = Math.sqrt(num);
	        System.out.println("The square root of " + num + " is:" + squareroot);
	    }
}
