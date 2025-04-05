import java.util.Scanner;

public class DStrassens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] x = new int[2][2];
        int[][] y = new int[2][2];
        int[][] z = new int[2][2];
        
        System.out.println("Enter elements for the first 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                x[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Enter elements for the second 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                y[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("The first matrix is:");
        printMatrix(x);
        
        System.out.println("The second matrix is:");
        printMatrix(y);
        
        int m1 = (x[0][0] + x[1][1]) * (y[0][0] + y[1][1]);
        int m2 = (x[1][0] + x[1][1]) * y[0][0];
        int m3 = x[0][0] * (y[0][1] - y[1][1]);
        int m4 = x[1][1] * (y[1][0] - y[0][0]);
        int m5 = (x[0][0] + x[0][1]) * y[1][1];
        int m6 = (x[1][0] - x[0][0]) * (y[0][0] + y[0][1]);
        int m7 = (x[0][1] - x[1][1]) * (y[1][0] + y[1][1]);
        
        z[0][0] = m1 + m4 - m5 + m7;
        z[0][1] = m3 + m5;
        z[1][0] = m2 + m4;
        z[1][1] = m1 - m2 + m3 + m6;
        
        System.out.println("Product achieved using Strassen's algorithm:");
        printMatrix(z);
        
        scanner.close();
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}