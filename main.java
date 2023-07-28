package arrays;

class arr {
    static void demo() {
        int ages[] = new int[3];
        ages[0] = 10;
        // ages[3] = 15;
        ages[1] = 11;
        ages[2] = 16;
        System.out.println(ages[2]);
    }
}

public class main {
    public static void main(String[] args) {
        arr obj = new arr();
        obj.demo();
    }

}
