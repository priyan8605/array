package arrays;

import java.util.Arrays;

public class chec {
    static int[] check(int[] arr) {
        Arrays.sort(arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i] + " ");
        // }
        int[] ans = { arr[0], arr[arr.length - 1] };
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 4,3, 1, 2 };
        int[] ans = check(arr);
        System.out.println("smallest : " + ans[0]);
        System.out.println("largest : " + ans[1]);
    }
}
