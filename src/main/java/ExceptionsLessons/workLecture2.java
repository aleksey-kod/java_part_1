package ExceptionsLessons;

import java.util.Arrays;

public class workLecture2 {
    public static int[][] create_m(int col, int row, int min, int max) {
        int[][] a = new int[col][row];
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                a[j][i] = (int) (Math.random() * ((max - min) + 1)) + min;
            }
        }
        return a;
    }

    public static int summ_m(int[][] m) {
        int sm = 0;
        for (int j = 0; j < m.length; j++) {
            if (m.length != m[j].length) {
                throw new RuntimeException("Количество строк не равно количеству столбцов");
            }
            for (int i = 0; i < m.length; i++) {
                if (m[j][i] != 0 && m[j][i] != 1) {
                    throw new RuntimeException("Допустимые значения: 0,1. Ваше значение" + m[j][i]);
                }
                sm += m[j][i];
            }
        }
        return sm;
    }

    public static void main(String[] args) {
        int col = 10,row = 10;
        int[][] a = create_m(col,row,0,1);
        System.out.print(Arrays.deepToString(a).replace("],", "],\n"));
        System.out.println(summ_m(a));
        System.out.println("------------------------------");
        a = create_m(col,row,0,15);
        System.out.print(Arrays.deepToString(a).replace("],", "],\n"));
        System.out.println(summ_m(a));
        System.out.println("------------------------------");
        a = create_m(12,1,0,15);
        System.out.print(Arrays.deepToString(a).replace("],", "],\n"));
        System.out.println(summ_m(a));
        System.out.println("------------------------------");

    }
}
