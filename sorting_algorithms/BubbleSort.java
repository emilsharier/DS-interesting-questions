package ds.interesting.sorting_algorithms;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String args[]) {
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter the elements");
        for (i = 0; i < 10; i++)
            a[i] = sc.nextInt();
        a = bubbleSort(a);
        System.out.println("The sorted elements are : \n");
        for (i = 0; i < 10; i++)
            System.out.print(a[i] + " ");
        sc.close();
    }

    static int[] bubbleSort(int a[]) {
        int i, j;
        for (i = 0; i < a.length - 1; i++) {
            for (j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        return a;
    }
}
