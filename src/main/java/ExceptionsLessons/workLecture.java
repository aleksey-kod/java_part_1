package ExceptionsLessons;

public class workLecture {
    public static int p(int[] m, int c, int min_size) {
        if (m == null) {
            return -3;
        }
        if (min_size > m.length) {
            return -1;
        }
        for (int i = 0; i < m.length; i++) {
            if (m[i] == c) {
                return i;
            }
        }
        return -2;
    }

    public static String pois(int a) {
        if (a == -1)
            return "Длина массива меньше заданного";
        if (a == -2)
            return "Искомый элемент не найден";
        if (a == -3)
            return "Вместо массива пришел null";
        return "Индекс искомого значения равен:" + a;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4,}, b = null;
        System.out.println(pois(p(b,5,5)));
        System.out.println(pois(p(a,5,4)));
        System.out.println(pois(p(a,5,7)));
        System.out.println(pois(p(a,4,3)));


    }
}
