// Q1: Merge two arrays.
import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of X: ");
        int m = scanner.nextInt();
        
        System.out.print("Enter the size of Y: ");
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
        
        mergeArrays(X, Y);
        
        System.out.println("Merged array X:");
        for (int num : X) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
    
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
        int i = m - 1;
        for (int j = m - 1; j >= 0; j--) {
            if (X[j] != 0) {
                X[i--] = X[j];
            }
        }
        
        i = n;
        int j = 0;
        int k = 0;
        
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[k++] = X[i++];
            } else {
                X[k++] = Y[j++];
            }
        }

        while (j < n) {
            X[k++] = Y[j++];
        }
    }
}
