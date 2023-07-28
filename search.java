package arrays;

class arrs {
    static void show() {
        int[] ar = { 1, 3, 4, 2, 6, 9 };
        int x = 4;
        int ans = -1;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == x) {
                ans = i;
            }
        }
        System.out.println("found " + x + " at index " + ans);
    }
}

public class search {
    public static void main(String[] args) {

        arrs obj = new arrs();
        obj.show();
    }

}
