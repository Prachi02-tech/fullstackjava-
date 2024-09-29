import java.util.Scanner;
public class CalculationOfStudentGrades {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int marks; 
	  String grade;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The Marks:");
			marks=sc.nextInt();
			if(marks>=90) {
				grade="A";	
			}
			else if(marks>=80) {
				grade="B";
				
			}
			else if(marks>=70) {
				grade="C";
				
			}
			else if(marks>=60) {
				grade="D";	
			}
			else if(marks>=50) {
				grade="E";
			}
			else {
				grade="F";
			}
			System.out.println("The grade for the marks is: "+grade);
			
		}

	}
