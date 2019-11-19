package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayReverse1 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length:");
        int n = sc.nextInt();
        int[] a = new int[n];
        if (n == 0) {
            System.out.println("This array contains no elements");
        }
        if (n >= 1) {
            System.out.println("Enter the elements of an array of " + a.length + " elements:");
            for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            }
            System.out.println("The inverted output of the array:");
            ArrReverse(a);
        }
    }

    public static int[] ArrReverse (int[] a) {
        for (int i = 0; i < a.length/2; i++) {
            int k = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = k;
        }
        System.out.println(Arrays.toString(a));
        return a;
    }
}