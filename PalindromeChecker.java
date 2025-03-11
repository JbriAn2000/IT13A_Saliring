import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter first word: ");
        String james1 = input.nextLine();

      
        System.out.print("Enter second word: ");
        String james2 = input.nextLine();

        
        if (isPalindrome(james1)) {
            System.out.println(james1 + " is a palindrome.");
        } else {
            System.out.println(james1 + " is not a palindrome.");
        }

        if (isPalindrome(james2)) {
            System.out.println(james2 + " is a palindrome.");
        } else {
            System.out.println(james2 + " is not a palindrome.");
        }

     
        input.close();
    }

    public static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                return false; 
            }
        }
        return true; 
    }
}