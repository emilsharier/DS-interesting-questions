package ds.interesting.questions.selection_sort;

import java.util.Scanner;

class SelectionSort {
    public static void main(String[] args) {
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.println("Enter the elements");
        for(i = 0; i < 10; i ++)
            a[i] = sc.nextInt();
        a = selectionSort(a);
        System.out.println("The sorted elements are");
        for(i = 0; i < a.length; i ++)
            System.out.print(a[i] + " ");
        sc.close();
    }
    static int[] selectionSort(int a[]) {
        int i, j, min;
        for(i = 0; i < a.length - 1; i ++) {
            min = i;
            for(j = i + 1; j < a.length; j ++)
                if(a[min] < a[j])
                    min = j;
            int t = a[min];
            a[min] = a[i];
            a[i] = t;
        }
        return a;
    }
}