package arrays;

import java.util.Scanner;

public class cp {
    static void change_array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        change_array(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("after calling change_array : ");
            System.out.println(arr[i]);
        }

    }

}
