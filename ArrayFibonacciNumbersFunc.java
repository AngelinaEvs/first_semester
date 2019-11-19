import java.util.Scanner;

public class ArrayFibonacciNumbersFunc {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println ("Enter the end number(number > 0) of the Fibonacci number sequence:");
		int n = sc.nextInt();
		int size = n + 1;
		int[] a = new int[size];
		a[1] = 1;
		a[2] = 1;
		calcFib(a, n);
		printAr(a, n);
	}
	public static int calcFib (int[] a, int n) {
		if (a[n] == 0) {
			a[n] = calcFib(a, n - 1) + calcFib(a, n - 2);
			return a[n];
		}
		else
			return a[n];
	}
	public static void printAr (int[] a, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}