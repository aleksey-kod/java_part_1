package Lesson_one_homework;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start += 1;
            }
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end -= 1;
            }

            char sChar = Character.toLowerCase(s.charAt(start));
            char eChar = Character.toLowerCase(s.charAt(end));
            if (start < end && sChar != eChar) {
                return false;
            }
            start += 1;
            end -= 1;
        }
        return true;
    }
}
