package arrays;

public class suffix {
    static int[] suff(int[] arr) {
        int n = arr.length;
        int[] sum = new int[n];
        sum[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sum[i] = arr[i] + sum[i + 1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 6, 3, 1 };
        int[] suffixsum = suff(arr);
      for(int i=0;i<suffixsum.length;i++)
      {
        System.out.println(suffixsum[i]);
      }
    }
}
