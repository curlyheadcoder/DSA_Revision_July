package TwoDimensionalArrays;

public class PrintBoundary {
    public static void main(String[] args) {
        int [][] mat = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9},
                        {10,11,12}
                        };
        getBoundaryElements(mat);
    }
    private static void getBoundaryElements(int [][] mat){
        int n = mat.length;
        int m = mat[0].length;

        // Top Row
        for (int i = 0; i < m; i++) {
            System.out.print(mat[0][i] + " ");
        }

        // Right column (excluding first row)
        for (int i = 1; i < n; i++) {
            System.out.print(mat[i][m-1] + " ");
        }

        // Bottom row (if more than 1 row)
        if(n > 1){
            for (int i = m-2; i >= 0; i--) {
                System.out.print(mat[n-1][i] + " ");
            }
        }

        // Left column (if more than 1 column)
        if(m > 1){
            for (int i = n-2; i > 0; i--) {
                System.out.print(mat[i][0] + " ");
            }
        }
    }
}
