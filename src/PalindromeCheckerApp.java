import java.util.LinkedList;

public class PalindromeCheckerApp {
        public static void main(String[] args) {


            String input = "level";

            // Edge cases
            if (input == null) {
                System.out.println("Input is null");
                return;
            }

            // Create LinkedList
            LinkedList<Character> list = new LinkedList<>();

            // Add characters to list
            for (char c : input.toCharArray()) {
                list.add(c);
            }

            boolean isPalindrome = true;

            // Compare first and last until 0 or 1 element remains
            while (list.size() > 1) {
                if (!list.removeFirst().equals(list.removeLast())) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + isPalindrome);
        }
    }

