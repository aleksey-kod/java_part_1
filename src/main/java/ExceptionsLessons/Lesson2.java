package ExceptionsLessons;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson2 {
   /* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
    приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.*/
    public static void task1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дробное число");
        while (true) {
            try {
                float b = in.nextFloat();
                System.out.println("Вы ввели дробное: " + b);
                break;
            } catch (Exception e) {
                in.reset();
                System.out.println("Возникла ошибка " + e.toString());
                in.next();
                System.out.println("Повторите ввод");
            }
        }
    }

    public static void task3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex2) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex3) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static void task4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите не пустую строку число");
        while (true) {
            try {
                String str = in.toString();
                if ("".equals(str)) {
                    throw new RuntimeException("Надо ввести не пустую строку");
                }
                System.out.println("Вы ввели дробное: " + b);
                break;
            } catch (Exception e) {
                in.reset();
                System.out.println("Возникла ошибка " + e.toString());
                in.next();
                System.out.println("Повторите ввод");
            }
        }

    }

    public static int[] task5(int[] a, int[] b) {
        try {
            if (a == null | b == null) {
                throw new RuntimeException("Один из массивов равен null");
            }
            if (a.length != b.length) {
                throw new RuntimeException("Массивы разной длины");
            }
        } catch (Exception e) {
            System.out.println("Возникла ошибка " + e.getMessage());
            return null;
        }
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; ++i) {
            result[i] = a[i] - b[i];
        }
        return result;
    }


    public static void main(String[] args) {
        task1();
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4};
//        int[] b = null;
        System.out.println(Arrays.toString(task4(a, b)));
        task3();
//        Задание Исправьте данный код
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException ex2) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }





}
