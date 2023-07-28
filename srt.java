package arrays;

import java.util.Scanner;

class sr {
    static boolean sorted(int[] arr) {
        boolean check = true;
        for (int i = 1; i <= arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;
            }
        }

        return true;
    }
}

public class srt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of an array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sr obj = new sr();
        obj.sorted(arr);
        if (obj.sorted(arr) == true) {
            System.out.println("Array is sorted");
        } else {
            System.out.print("not sorted");
        }

    }
}
