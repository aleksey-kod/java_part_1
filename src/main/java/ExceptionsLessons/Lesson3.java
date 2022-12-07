package ExceptionsLessons;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson3 {
    public static boolean isLetter(String name) {
        char[] chars = name.toCharArray();
        for (char c : chars) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidDate(String input) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.mm.yyyy");
        try {
            dateFormat.parse(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static String[] inputData() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Ввведите данные разделенные пробелами:");
                System.out.println("Фамилия Имя Отчество");
                System.out.println("Дата рождения dd.mm.yyyy");
                System.out.println("Номер телефона 7##########");
                System.out.println("Пол F / M");

                String str = in.nextLine();
                str = str.replaceAll("[\\s]{2,}", " ");
                String[] Data = str.split(" ");
                if (Data.length != 6) {
                    throw new RuntimeException("Вы ввели не все данные");
                }
                for (int i = 0; i < 3; ++i) {
                    if (!isLetter(Data[i])) {
                        throw new RuntimeException("ФИО должно содержать только символы");
                    }
                }
                if (!isValidDate(Data[3])) {
                    throw new RuntimeException("Дата записана не верно");
                }
                ;
                if (!Data[4].matches("^\\d{11}$")) {
                    throw new RuntimeException("Телефон записан не верно");
                }
                if (!Data[5].matches("^[f,F]|^[m,M]")) {
                    throw new RuntimeException("Данные пола записаны не верно");
                }
                for (String word : Data) {
                    System.out.println(word);
                }
                return Data;
            } catch (Exception e) {
                System.out.println("Возникла ошибка " + e.getMessage());
                System.out.println("Повторите ввод");
                System.out.println("---------------");
            }
        }
    }

    public static void writeData(String[] data) {
        try {
            FileWriter writer = new FileWriter(data[0], true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(Arrays.toString(data).replace("[","").replace("]",""));
            bufferWriter.newLine();
            bufferWriter.close();
            writer.close();

        } catch (IOException e) {
            System.out.println("Возникла ошибка ");
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        writeData(inputData());
    }
}
