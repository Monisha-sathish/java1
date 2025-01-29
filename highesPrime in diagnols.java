import java.util.*;
public class Main {
    
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int row=sc.nextInt();
      int col=sc.nextInt();
      int matrix[][]=new int[row][col];
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            matrix[i][j]=sc.nextInt();
        }
      }

        int max = -1;

        for (int i = 0; i < 3; i++) {
            if (isPrime(matrix[i][i])) {
               max = Math.max(max, matrix[i][i]);
            }
        }

        for (int i = 0; i < 3; i++) {
            if (isPrime(matrix[i][2 - i])) {
               max = Math.max(max, matrix[i][2 - i]);
            }
        }

        if (max!= -1) {
            System.out.println("Highest prime among the diagonals: " + max);
        } else {
            System.out.println("No prime numbers found in diagonals.");
        }
    }
}
