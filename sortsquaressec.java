package arrays;

import java.util.Scanner;

public class sortsquaressec {

    static int[] srtsqr(int[] arr) {
        int n = arr.length;
        int i = 0, j = n - 1;
        int[] ans = new int[n];
        int k = n - 1;// to traverse on ans[] from 0th index
        while (i <= j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                ans[k] = arr[i] * arr[i];
                k--;
                i++;
            } else {
                ans[k] = arr[j] * arr[j];
                k--;
                j--;
            }
        }

        return ans;
    }

    static void show(int[] ans) {
        int n = ans.length;
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
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
        int[] ans = srtsqr(arr);
        System.out.println("Sorted squares of an array  in non decreasing order");
        show(ans);
    }
}
