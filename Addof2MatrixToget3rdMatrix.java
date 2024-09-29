import java.util.Scanner;
public class Addof2MatrixToget3rdMatrix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        
        int[][] matrixA = new int[row][col];
        int[][] matrixB = new int[row][col];
        int[][] sumMatrix = new int[row][col];
        System.out.println("Enter elements of first matrix:");
        fillMatrix(matrixA, sc);
        System.out.println("Enter elements of  second matrix:");
        fillMatrix(matrixB, sc);
        for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
        sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        	}
        System.out.println("Sum of	two matrices:");
        printMatrix(sumMatrix);
		}
    private static void fillMatrix(int[][] matrix, Scanner sc) {
    for (int i=0;i<matrix.length;i++) {
    for (int j=0;j<matrix[i].length;j++) {
    System.out.print("Element ["+i+"]["+j+"]:");
    matrix[i][j] = sc.nextInt();
            }
        	}
    		}
    private static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
    for (int element : row) {
     System.out.println(element);
       }
       }
    	}
}


