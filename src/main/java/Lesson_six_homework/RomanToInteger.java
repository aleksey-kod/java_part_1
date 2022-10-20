package Lesson_six_homework;

import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> RomanMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i < s.length() - 1) && (RomanMap.get(s.charAt(i + 1)) > RomanMap.get(s.charAt(i)))) {
                result = result - RomanMap.get(s.charAt(i));
            } else {
                result = result + RomanMap.get(s.charAt(i));
            }
        }
        return result;
    }
}