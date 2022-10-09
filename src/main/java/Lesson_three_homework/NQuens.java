package Lesson_three_homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQuens {
    static int deskSize;
    static char[][] desk;
    static List<List<String>> ans;

    public static List<String> charToList() {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < deskSize; ++i) {
            for (int j = 0; j < deskSize; ++j) {
                if (desk[i][j] == 'Q' || desk[i][j] == '.') {
                    sb.append(desk[i][j]);
                } else {
                    sb.append('.');
                }
            }
            result.add(sb.toString());
            sb.setLength(0);
        }
        return result;
    }

    public static boolean solveNQueen(int col) {
        if (col == deskSize) {
            return true;
        }
        for (int row = 0; row < deskSize; row++) {
            if (isSafe(row, col, desk)) {
                desk[row][col] = 'Q';
                if (solveNQueen(col + 1)) {
                    ans.add(charToList());
                }
                desk[row][col] = '.';
            }
        }
        return false;
    }

    private static boolean isSafe(int row, int col, char[][] desk) {
        for (int i = col - 1; i >= 0; i--) {
            if (desk[row][i] == 'Q') return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (desk[i][j] == 'Q') return false;
        }

        for (int i = row + 1, j = col - 1; i < desk.length && j >= 0; i++, j--) {
            if (desk[i][j] == 'Q') return false;
        }

        return true;
    }

    public List<List<String>> solveNQueens(int n) {
        deskSize = n;
        ans = new ArrayList<>();
        desk = new char[deskSize][deskSize];
        solveNQueen(0);
        return ans;

    }
/*
    public static void main(String[] args) {

    }*/
}