public class MatrixMultiplication {
    public static void main(String[] args) {
        // Defining two 2x2 matrices for simplicity
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        
        // Result matrix will also be 2x2
        int[][] result = new int[2][2];

        // Multiplying matrices
        for (int i = 0; i < 2; i++) { // rows of a
            for (int j = 0; j < 2; j++) { // columns of b
                for (int k = 0; k < 2; k++) { // columns of a / rows of b
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Displaying the result
        System.out.println("Resulting Matrix:");
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}