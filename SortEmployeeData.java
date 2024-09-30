import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class Employee {
    int empId;
    String name;
    double salary;
    String location;
    public Employee(int empId, String name, double salary, String location) {
     this.empId = empId;
     this.name = name;
     this.salary = salary;
     this.location = location;
    }
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" 
				+ salary + ", location=" + location + "]";
	}
}
public class SortEmployeeData {
	 public static Employee searchEmployeeById(ArrayList<Employee> employees, int empId) {
		  for (Employee emp : employees) {
		  if (emp.empId == empId) {
		  return emp;
		  }
		  }
		  return null;
		 }
		  
		  public static void displayEmp(ArrayList<Employee> employees) {
		  for (Employee emp : employees) {
		  System.out.println(emp);
		   }
		  }
		  
		  
		  public static void sortByEmpId(ArrayList<Employee> employees) {
		        Collections.sort(employees, Comparator.comparingInt(emp -> emp.empId));
		        System.out.println("Employees sorted by Employee ID:");
		        displayEmp(employees);
		    }
		  
		  
		  public static void sortBySalary(ArrayList<Employee> employees) {
		  Collections.sort(employees, Comparator.comparingDouble(emp -> emp.salary));
		  System.out.println("Employees sorted by Salary:");
		  displayEmp(employees);
		    }
		  public static void main(String[] args) {
		   // TODO Auto-generated method stub
		    ArrayList<Employee> employees = new ArrayList<>();
		     Scanner sc = new Scanner(System.in);
		     while (true) {
		            System.out.println("1. Add Employee");
		            System.out.println("2. Search Employee by ID");
		            System.out.println("3. Sort Employees by Employee ID");
		            System.out.println("4. Sort Employees by Salary");
		            System.out.println("5. Display All Employees");
		            System.out.println("6. Exit");
		            System.out.print("Enter your choice: ");
		            int choice = sc.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter employee ID: ");
		                    int empId = sc.nextInt();
		                    sc.nextLine();  
		                    System.out.print("Enter employee name: ");
		                    String name = sc.next();
		                    System.out.print("Enter employee salary: ");
		                    double salary = sc.nextDouble();
		                    sc.nextLine();  
		                    System.out.print("Enter employee Location: ");
		                    String location = sc.next();
		                    employees.add(new Employee(empId, name, salary, location));
		                    System.out.println("Employee added successfully");
		                    break;
		                case 2:
		                	System.out.print("Enter employee ID to search: ");
		                    int searchId = sc.nextInt();
		                    Employee emp = searchEmployeeById(employees, searchId);
		                    if (emp != null) {
		                    System.out.println("employee Found: " + emp);
		                    } else {
		                    System.out.println("employee with ID " + searchId + " not found.");
		                    }
		                    break;

		                case 3:
		                sortByEmpId(employees);
		                break;

		               case 4:
		               sortBySalary(employees);
		               break;

		                case 5:
		                 System.out.println("All employees:");
		                 displayEmp(employees);
		                 break;

		                case 6:
		                System.out.println("Exiting");

		                default:
		                System.out.println("Invalid choice .Please choose a valid option.");
		            }
		        }
		    }
		  }
