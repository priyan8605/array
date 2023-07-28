package arrays;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class frequency {
    static int[] makefreq(int[] arr) {
        int[] freq = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 5, 6, 5, 400, 560, 1000, 400 };
        int[] freq = makefreq(arr);
        int q = 5;
        while (q > 0) {
            System.out.println("enter number to be searched");
            int x = sc.nextInt();
            if (freq[x] > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            q--;
        }
    }

}
