import java.util.Scanner;
public class Addof2Dmatrices {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number of rows and columns of matrices:");
		        int row = sc.nextInt();
		        int col = sc.nextInt();
		        int[][] matrix1 = new int[row][col];
		        int[][] matrix2 = new int[row][col];
		        int[][] resultMatrix = new int[row][col];
		        System.out.println("Enter the value for first matrix:");
		        for (int i=0;i<row;i++) {
		        for (int j=0;j<col;j++) {
		        matrix1[i][j] = sc.nextInt();
		            }
		        	}
		        System.out.println("Enter the value for second matrix:");
		        for (int i=0;i<row;i++) {
		            for (int j=0;j<col;j++) {
		                matrix2[i][j] = sc.nextInt();
		            }
		        	}
		        for (int i=0;i<row;i++) {
		        for (int j=0;j<col;j++) {
		        resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
		            }
		        	}
		        System.out.println("Addition of two matrices:");
		        for (int i=0;i<row;i++) {
		            for (int j=0;j<col;j++) {
		                System.out.println(resultMatrix[i][j] );
		            } 
		        	}
	}
}
