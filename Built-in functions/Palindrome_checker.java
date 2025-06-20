import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = getInput();
        if (isPalindrome(input)) {
            displayResult(input + " is a palindrome.");
        } else {
            displayResult(input + " is not a palindrome.");
        }
    }

    private static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return scanner.nextLine().replaceAll("\\s+", "").toLowerCase(); // ignore spaces + case
    }

    private static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static void displayResult(String result) {
        System.out.println(result);
    }
}
