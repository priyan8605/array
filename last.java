package arrays;

import java.util.Scanner;

public class last {
    static int occurence(int[] arr, int x) {
        int lastidx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastidx = i;
            }
        }
        return lastidx;
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
        System.out.println("Enter x:");
        int x = sc.nextInt();
        System.out.println("last occurence of  " + x + " is at index = " + occurence(arr, x));
    }
}
