package Lesson_six_homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> nums2Set = new HashSet<>();
        for (int i : nums1) {
            nums1Set.add(i);
        }
        for (int i : nums2) {
            nums2Set.add(i);
        }
        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(new ArrayList<>());
        resultList.add(new ArrayList<>());
        for (int num : nums1Set) {
            if (!nums2Set.contains(num)) {
                resultList.get(0).add(num);
            }
        }
        for (int num : nums2Set) {
            if (!nums1Set.contains(num)) {
                resultList.get(1).add(num);
            }
        }
        return resultList;
    }
}
