package ca.qc.bdeb.info.regex;

public class Main {

    public static void main(String[] args) {
        System.out.println(fib(8));
        System.out.println(fib2(8));
    }

    public static int fib(int n) {
        if (n == 1) {
            return 1;
        } else if(n == 0){
            return 0;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int fib2(int n){
        int a = 0;
        int b = 1;
        int fib = 0;

        for(int i = 0 ; i < n-1 ; i++){
            fib = a+b;
            a = b;
            b = fib;
        }
        return fib;
    }
}
