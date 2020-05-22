package ds.interesting.sorting_algorithms;

import java.util.Scanner;

public class InsertionSort {
    
    static int[] insertionSort(int a[]) {
        int i, j, key;
        for(i = 1; i < a.length; i ++) {
            key = a[i];
            j = i - 1;
            while(j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j --;
            }
            j ++;
            if(j >= 0) {
                a[j] = key;
            }
        }
        return a;
    }
    
    public static void main(String[] args) {
        int a[] = new int[10];
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        for(i = 0; i < 10; i ++)
            a[i] = sc.nextInt();
        a = insertionSort(a);
        System.out.println("The sorted array elements are");
        for(i = 0; i < 10; i ++)
            System.out.print(a[i] + " ");
        sc.close();
    }
}
