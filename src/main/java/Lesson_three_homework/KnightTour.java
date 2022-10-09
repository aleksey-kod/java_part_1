package Lesson_three_homework;
import java.util.Arrays;

public class KnightTour {
    static int desksize;
    static int[][] desk;
    static int step;
    static int[][] moves = {{1, 2}, {-1, 2}, {1, -2}, {-1, -2}, {2, 1}, {-2, 1}, {2, -1}, {-2, -1}};

    public static boolean ifNullKnight(int curRow, int curCol) {
        if (desk[curRow][curCol]!=0){
            step-=1;
            return false;
        }
        if (step == desksize * desksize) {
            desk[curRow][curCol] = step;
            return true;
        }
        desk[curRow][curCol] = step;
        System.out.println(step);
        for (var move : moves) {
            if (curRow+move[0]>=0 && curRow+move[0] < desksize){
                if (curCol+move[1]>=0 && curCol+move[1]< desksize){
                    System.out.println(step);
                    step+=1;
                    if (ifNullKnight(curRow+move[0],curCol+move[1]))
                    {
                        return true;
                    }
                }
            }
        }
        desk[curRow][curCol] = 0;
        step-=1;
        return false;
    }

    public static void main(String[] args) {
        step = 1;
        desksize = 5;
        desk = new int[desksize][desksize];
        if (ifNullKnight(2,2)){
            for (var row : desk) {
                System.out.println(Arrays.toString(row));
            }
        }
        else {
            System.out.println("Решения нет");
        }
    }

}
