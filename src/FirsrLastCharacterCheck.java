import java.util.Scanner;
public class FirsrLastCharacterCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the word : ");
        String word = sc.next();
        char c = word.charAt(0);
        int length = word.length();
        char l = word.charAt(length-1);
        if ( c == l){
            System.out.println("the first and last character are same");
        }
        else{
            System.out.println("The first and last character are not same ");
        }
    }
}
