package Lesson_five_homework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> nums2Set = new HashSet<>();
        for (int i : nums1) {
            nums1Set.add(i);
        }
        for (int i : nums2) {
            nums2Set.add(i);
        }
        nums1Set.retainAll(nums2Set);
        return nums1Set.stream().mapToInt(Integer::intValue).toArray();
    }
}
