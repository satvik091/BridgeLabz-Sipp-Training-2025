import java.util.Scanner;

class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0, j = cleanText.length() - 1;
        while (i < j) {
            if (cleanText.charAt(i) != cleanText.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    void displayResult() {
        if (isPalindrome())
            System.out.println("'" + text + "' is a palindrome.");
        else
            System.out.println("'" + text + "' is not a palindrome.");
    }
}

public class PalindromeProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker(input);
        checker.displayResult();

        sc.close();
    }
}
