/**
 * Write a program about factorial
 */
import java.util.Scanner;

public class FactorNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int i = 1;
        int facto = 1;

        while( i <= n){
           facto = i * facto;
            //System.out.println( facto );
            i++;

        }
        System.out.println("Factorial of the number " + n + " is " + facto);

    }
}
