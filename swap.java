package arrays;

public class swap {
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("values after swap  a= " + a + " b= " + b);
    }

    public static void main(String[] args) {
        int a = 9, b = 3;
        swap(a, b);
    }
}
