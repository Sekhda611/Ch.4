import java.util.Scanner;
public class MultiplyNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the positive integer number : ");
        int number = input.nextInt();
        int i;
        for(i = 1; i <= 10; i++){
            int product;
            product = number * i;

            System.out.println( number + " x " + i + " = " + product);

        }
    }
}
