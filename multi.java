package arrays;

class twoarr {

    void demo() {
        int[] ages = { 1, 4, 8, 6, 7 };
        for (int x : ages) {
            System.out.println(x);
        }
    }

}

public class multi {
    public static void main(String[] args) {
        twoarr obj = new twoarr();
        obj.demo();
    }

}
