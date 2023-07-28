package arrays;

import java.util.Scanner;

public class suffix_sum {
    static int findarraysum(int[] arr) {
        int totalsum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalsum += arr[i];
        }
        return totalsum;
    }

    static boolean equalsumpartition(int[] arr) {
        int totalsum = findarraysum(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int prefsum = 0;
            prefsum += arr[i];
            int suffsum = totalsum - prefsum;
            if (suffsum == prefsum) {
                return true;
            }
        }
        return false;
    }

    static void show(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array= ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array= ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Equal partition possible: " + equalsumpartition(arr));
    }
}
