package ExceptionsLessons;

import java.util.Arrays;

public class Lesson1 {
    public static int[] massivsub(int[] a, int[] b) {
            if (a==null | b==null ){
                throw new RuntimeException("Один из массивов равен null");}
            if (a.length != b.length) {
                throw new RuntimeException("Массивы разной длины");
            }

            int[] result = new int[a.length];
            for (int i = 0; i < a.length; ++i) {
                result[i] = a[i] - b[i];
            }
            return result;
        }
    public static float[] quotientMassiv(int[] a, int[] b) {
        if (a==null | b==null ){
            throw new RuntimeException("Один из массивов равен null");}
        if (a.length != b.length) {
            throw new RuntimeException("Массивы разной длины");
        }

        float[] result = new float[a.length];
        for (int i = 0; i < a.length; ++i) {
            if (b[i] == 0){
                throw new RuntimeException("На ноль делить нельзя");
            }
            result[i] = a[i] / b[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4};
//        int[] b = null;
        System.out.println(Arrays.toString(massivsub(a, b)));
        int[] c = {1, 2, 3, 4};
        int[] d= {1, 2, 3, 4};
//        int[] b = null;
        System.out.println(Arrays.toString(quotientMassiv(c, d)));
    }
}