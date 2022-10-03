package Lesson_one_homework;

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int copyindx = n + m - 1;
        while (n != 0) {
            if (m > 0 && nums1[m - 1] > nums2[n - 1]) {
                nums1[copyindx] = nums1[m - 1];
                m = --m;
            } else {
                nums1[copyindx] = nums2[n - 1];
                n = --n;
            }
            copyindx = --copyindx;
        }
    }
}