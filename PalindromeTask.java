import java.util.Scanner;

public class PalindromeTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String string1 = input.nextLine();
        StringBuilder sb = new StringBuilder(string1);
        String reversed = sb.reverse().toString();

        
        System.out.println(sb.toString());
        if (string1.equals(reversed)) {  
        System.out.println("The input string is a palindrome.");
        }
        else {
        System.out.println("The input string is not a palindrome.");
        }
        
        input.close();
    }
}