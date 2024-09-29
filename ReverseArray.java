import java.util.Arrays;
public class ReverseArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method 1 for reversing an array
		int[] array = {1, 2, 3, 4, 5};
		 		System.out.println("Original array: " + Arrays.toString(array));
		        reverseArray(array);
		        System.out.println("Reversed array: " + Arrays.toString(array));
		    }
				public static void reverseArray(int[] array) {
		        int start = 0;
		        int end = array.length - 1;
		        while (start < end) {
		            int temp = array[start];
		            array[start] = array[end];
		            array[end] = temp;
		            start++;
		            end--;
		        }
		 //method 2 for reversing an array
			int [] arr = {10, 20, 30, 40, 50}; 
			reverse(arr, arr.length); } 
			static void reverse(int a[], int n) 
			{ int[] b = new int[n]; 
				int j = n; 
				for (int i = 0; i < n; i++) { 
				b[j - 1] = a[i]; 
				j = j - 1; 
				} 
				System.out.println("Reversed array is: \n"); 
				for (int k = 0; k < n; k++) { 
				System.out.println(b[k]); 
				} 
				}
	}

