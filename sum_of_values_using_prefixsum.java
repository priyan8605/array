package arrays;

import java.util.Scanner;

public class sum_of_values_using_prefixsum {
    static int[] prefixsums(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();

        }
        // System.out.println("prefixsum of array is = ");
        int[] prefixsum = prefixsums(arr);
        System.out.println("Enter number of queries = ");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.println("Enter ranges = ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prefixsum[r] - prefixsum[l - 1];
            System.out.println("Sum of range " + l + " and " + r + " = " + ans);
            q--;
        }
    }

}
