/**
 *  enter a string and then prints out the number of vowels in the string
 */

import java.util.Scanner;
public class StringCountVowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the any sentence : ");
        String sent = sc.nextLine();
        int length = sent.length();
        //System.out.println("value of length : " + length);
        int count = 0;
        int i = 0;

        while( i < length){
            char c = sent.charAt(i);
            if( c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U'){
                count ++;
            }
             i ++;

        }
        System.out.println("The total number of vowel count is : " + count);
        sc.close();

    }
}
