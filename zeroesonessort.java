package arrays;

import java.util.Scanner;

public class zeroesonessort {
    static void sort(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i < count - 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    static void show(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("input array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        System.out.println("Sorted array is : ");
        show(arr);
    }
}
