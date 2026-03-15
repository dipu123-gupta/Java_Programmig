package Function;

public class funScop {
    public static void main(String[] args) {
        int x = 8;
        int y = 10;
        System.out.println(x + "," + y);

        fun(x);
    }

    static void fun(int x) {
        System.out.println(x);
    }
}
