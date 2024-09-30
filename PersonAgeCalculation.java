import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class PersonAgeCalculation {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter your date of birth (yyyy-mm-dd): ");
	        String dobInput = scanner.nextLine();

	        
	        LocalDate dob = LocalDate.parse(dobInput);
	        LocalDate currentDate = LocalDate.now();

	       
	        Period age = Period.between(dob, currentDate);

	        // Display the age
	        System.out.println("Your age is: " + age.getYears() + " years, " +
	                age.getMonths() + " months, and " + age.getDays() + " days.");

	        // Close the scanner
	        scanner.close();
	    }
	}



		



