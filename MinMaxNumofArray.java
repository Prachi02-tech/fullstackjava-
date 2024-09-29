//Minimum And Maximum Number of Given Array
public class MinMaxNumofArray {
	public static void findMinMaxfromArray(int[] arr) {
        int min=arr[0];
        int max=arr[0];
        for (int i=1;i<arr.length;i++) {
        if (arr[i]<min) {
        min=arr[i];
            }
        if (arr[i]>max) {
        max =arr[i];
            }
        	}
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]num = {3, 5, 7, 2, 8, -1, 4, 10, 12};
		 findMinMaxfromArray(num);
		}
}
