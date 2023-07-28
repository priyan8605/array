package arrays;

public class prefixsum {
    static int[] makeprefixsum(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }

    static void show(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 4, 5 };
        int[] prefixsum = makeprefixsum(arr);
        System.out.println("prefixsum of array is = ");
        show(prefixsum);
    }
}
