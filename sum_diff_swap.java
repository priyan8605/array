package arrays;

public class sum_diff_swap {
    static void swap(int a,int b)
    {
        a=a+b;//9+3=12
        b=a-b;//12-3=9
        a=a-b;//12-9=3
        System.out.println("values after swap a= "+a+" b= "+b);
    }
    public static void main(String[] args) {
        int a=9,b=3;
        swap(a,b);
    }
}
