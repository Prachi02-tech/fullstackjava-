import java.util.Arrays;
import java.util.Scanner;
public class SortArrayInAscendingOrder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			   Scanner sc = new Scanner(System.in);
		       System.out.print("Enter the number of elements in the array: ");
		        int n = sc.nextInt();
		        int[] array = new int[n];//created an array of size n so n number can be fixed 
		        System.out.println("Enter the elements of the array:");
		        for (int i = 0; i < n; i++) {
		            array[i] = sc.nextInt();
		        }
		        Arrays.sort(array);//sorting array in ascending order using this method
		        System.out.println("Sorted array: " + Arrays.toString(array));
		       }
		}


