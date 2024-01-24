public class PalindromeChecker {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221)); // true
        System.out.println(isPalindrome(707));   // true
        System.out.println(isPalindrome(11212)); // false
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = reverseNumber(Math.abs(number));

        return reversedNumber == Math.abs(number);
    }
    private static int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}