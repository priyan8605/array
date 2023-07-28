package arrays;

import java.util.Scanner;

public class co {
    static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of an array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("original array ");
        printarray(arr);// original array
        // copying arr in arr_2
        int[] arr_2 = arr.clone();
        System.out.println("copied arr_2");
        printarray(arr_2);
        // changing value of arr_2
        arr_2[0] = 0;
        arr_2[1] = 0;
        System.out.println("original array after changing arr_2");
        printarray(arr);
        System.out.println("copied arr_2 after changing arr_2");
        printarray(arr_2);

    }

}
