package fibonacci_series;

import fibonacci_series.Fibonacci;

import java.util.Scanner;

public class MainFibonacci {

      public static void main(String args[]) throws FibonacciException {

          Scanner scan = new Scanner(System.in);
          System.out.println("Please enter the length of the Fibonacci string:");

          int n = scan.nextInt();

          try {

              System.out.println(n);
              System.out.print(Fibonacci.n1 + " " + Fibonacci.n2);
              Fibonacci.printFibonacci(n - 2);
          } catch (Exception e) {
              System.out.println("Make sure 'n' is an integer value!");
          }
          if (n<0) {
              throw new FibonacciException("Make sure 'n' has a positive value");
          }
      }
}
