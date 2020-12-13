package fibonacci_series;

import fibonacci_series.Fibonacci;

public class Main {

      public static void main(String args[]){
        int n=20;
        System.out.print(Fibonacci.n1+" "+ Fibonacci.n2);
        Fibonacci.printFibonacci(n-2);
    }
}
