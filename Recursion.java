public class Recursion {

    static int fact(int n) {
        if(n == 0)
            return 1;
        if(n == 1)
            return 1;
        return n * fact(n - 1);
    }

    static int fib(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    static int trib(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        if(n == 2)
            return 1;
        return trib(n - 1) + trib(n - 2) + trib(n - 3);
    }

    public static void main(String[] args) {
        System.out.println("Factorial: " + fact(5));
        System.out.println("Fibonacci: " + fib(6));
        System.out.println("Tribonacci: " + trib(6));
    }
}
