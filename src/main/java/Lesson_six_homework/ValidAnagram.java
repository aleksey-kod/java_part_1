package Lesson_six_homework;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] schars = s.toCharArray();
        char[] tchars = t.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < schars.length; i++) {
            map.putIfAbsent(schars[i], 0);
            map.put(schars[i], map.get(schars[i]) + 1);
        }
        for (int j = 0; j < tchars.length; j++) {
            if (map.containsKey(tchars[j])) {
                map.put(tchars[j], map.get(tchars[j]) - 1);
                if (map.get(tchars[j]) == 0) {
                    map.remove(tchars[j]);
                }
            }
        }
        if (map.isEmpty()) {
            return true;
        }
        return false;
    }
}