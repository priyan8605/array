package arrays;

public class secmax {
    static int findmax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static int findsecondmax(int[] arr) {
        int mx = findmax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondmx = findmax(arr);
        return secondmx;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 8, 9, 6, 9, 5, 8 };
        System.out.println("Second maximum element in given array is : " + findsecondmax(arr));
    }
}
