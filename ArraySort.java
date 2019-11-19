import java.util.Scanner;
//import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length:");
        int n = sc.nextInt();
        double[] a = new double [n];
        System.out.println("Enter the elements of an array of " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a [i] = sc.nextDouble();
        }
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] > a[j + 1]) {
                    double rememb = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = rememb;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
