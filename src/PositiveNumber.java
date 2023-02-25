/**
 * @class PositiveNumber
 * @author Sonal Sekhda
 * @course ITEC 2140 Section 04.
 * @date February 24, 2023
 * Write a program about any number that count from 1 to that number
 */
import java.util.Scanner;
public class PositiveNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the any number : ");
        int num = input.nextInt();
        int count = 1;

        while (num <= 0) {
                System.out.println("Reenter the positive value : ");
                num = input.nextInt();
            }
        while (count <= num ){

            System.out.println(count );
            count ++;
        }
        }
    }

