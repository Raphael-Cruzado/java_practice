package IsPalindrome;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("bob"));
        System.out.println(isPalindrome("good"));
        System.out.println(isPalindrome("never odd or even"));
    }

    public static boolean isPalindrome(String input) {
        input = input.replaceAll("\\s", "").toLowerCase();

        // Check if the string is a palindrome
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false; // Characters don't match, not a palindrome
            }
            left++;
            right--;
        }

        return true; // All characters match, it's a palindrome
    }

}
