package Lesson_one_homework;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int copyidx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[copyidx] = nums[i];
                copyidx = copyidx + 1;
            }
        }
        return copyidx;
    }
}
