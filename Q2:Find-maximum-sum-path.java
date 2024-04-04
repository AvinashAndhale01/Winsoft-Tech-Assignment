// Q2:Find maximum sum path involving elements of given arrays
import java.util.Scanner;

public class MaximumSumPath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter size of array X: ");
        int m = scanner.nextInt();
        
        System.out.print("Enter size of array Y: ");
        int n = scanner.nextInt();
        
        int[] X = new int[m];
        int[] Y = new int[n];
        
        System.out.println("Enter elements of array X:");
        for (int i = 0; i < m; i++) {
            X[i] = scanner.nextInt();
        }
        System.out.println("Enter elements of array Y:");
        for (int i = 0; i < n; i++) {
            Y[i] = scanner.nextInt();
        }
        
        int maxSum = findMaximumSumPath(X, Y);
        
        System.out.println("Maximum sum path is: " + maxSum);
        
        scanner.close();
    }
    
    public static int findMaximumSumPath(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
        int i = 0, j = 0;
        int sumX = 0, sumY = 0, totalSum = 0;
        
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                sumX += X[i++];
            } else if (X[i] > Y[j]) {
                sumY += Y[j++];
            } else { 
                totalSum += Math.max(sumX, sumY);
                totalSum += X[i];
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
        }
        
        while (i < m) {
            sumX += X[i++];
        }
        
        while (j < n) {
            sumY += Y[j++];
        }
  
        totalSum += Math.max(sumX, sumY);
        
        return totalSum;
    }
}
