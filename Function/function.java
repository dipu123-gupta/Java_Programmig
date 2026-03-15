package Function;

public class function {
    public static void main(String[] args) {
        // function calling
        greet();
        sayHello("Aditya");// passing value to function Argument
        int num = getNumber();// storing value from function
        System.out.println(num);
        int sum = sum(10, 20);// passing value and storing value from function
        System.out.println(sum);// output 30

        // function overloading
        int sum1 = sum(10, 20, 30);
        System.out.println(sum1);// output 60
        int sum2 = sum(10, 20, 30, 40);
        System.out.println(sum2);// output 100
        int sum3 = sum(10.5, 20.5);
        System.out.println(sum3);// output 31

    }

    // No I/P, No O/p
    static void greet() {
        System.out.println("Hello World");
        return;// optinal
    }

    // I/P, No O/p
    static void sayHello(String name) { // number of parameters can be anything
        System.out.println("Hello " + name);
        return;
    }

    // No I/P, O/p
    static int getNumber() {
        return 10;
    }

    // I/P, O/p
    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // function overloading
    static int sum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    // function overloading
    static int sum(int a, int b, int c, int d) {
        int sum = a + b + c + d;
        return sum;
    }

    // function overloading
    static int sum(double a, double b) {
        int sum = (int) (a + b);
        return sum;
    }

}
