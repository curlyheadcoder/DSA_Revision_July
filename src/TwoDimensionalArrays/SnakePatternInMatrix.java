package TwoDimensionalArrays;

import java.util.Scanner;

public class SnakePatternInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        int [][] arr = new int [row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        printSnake(arr);
    }

    private static void printSnake(int mat [][]){
        int r = mat.length, c = mat[0].length;
        for (int i = 0; i < r; i++) {
            if(i % 2 == 0){
                for (int j = 0; j < c; j++) {
                    System.out.print(mat[i][j] + " ");
                }
            }else{
                for (int j = c-1; j >= 0; j--) {
                    System.out.print(mat[i][j]+ " ");
                }
            }
        }
    }
}
