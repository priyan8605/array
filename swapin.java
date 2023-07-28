package arrays;

public class swapin {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void same(int[] arr, int i, int j) {
        int n = arr.length;
        i = 0;
        j = n - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int i = 0;
        int j = arr.length - 1;
        same(arr, i, j);
        // show the swapped array
        show(arr);
    }
}
