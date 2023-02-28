import java.util.Scanner;
public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the integer number : ");
        int n = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int fibonacci;
        System.out.println("The first " + n + " terms of Fibonacci series  are: ");
        for(int i = 1; i <= n; i++){
            System.out.print(num1 + " ");
            fibonacci = num1 + num2;
            num1 = num2;
            num2 = fibonacci;

        }

    }
}
