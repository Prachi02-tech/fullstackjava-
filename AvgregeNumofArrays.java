import java.util.Scanner;
public class AvgregeNumofArrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of values: ");
     int n = sc.nextInt();
	 double[] num = new double[n];
     double sum = 0;
     System.out.println("Enter the value:");
	 for (int i = 0; i < n; i++) {
	 num[i] = sc.nextDouble();
	 sum += num[i];
	}
	  double average = sum / n;
       System.out.println("The average is: " + average);
       }
}
