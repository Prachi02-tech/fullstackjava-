import java.util.Scanner;
public class PowerCalculation {
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int num;
			System.out.println("Enter the number: ");
			num=sc.nextInt();
			int power=num*num*num;
			System.out.println(+ num  +  " raised to the power of three is :" + power);
		}
	}

