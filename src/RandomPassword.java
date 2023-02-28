import java.util.Scanner;
public class RandomPassword {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length fo password ");
        int length = sc.nextInt();
         double password = StrictMath.random();
        System.out.println("the password is : " + password);

    }
}
