package 剑指offer;

import java.util.ArrayList;

/**
 * @author Blse
 * @date 2018/6/19
 * @description 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵：
 *               1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */

public class N23{
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer> ();
        if (matrix.length == 0) {
             return result;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        if (m == 0) {
            return result;
        }
        int layers = (Math.min(n, m) - 1) / 2 + 1;
        for (int i = 0; i < layers; i++) {
             for (int k = i;k < m - i; k++) {
                 result.add(matrix[i][k]);
             }
             for (int j = i + 1; j < n - i; j++) {
                 result.add(matrix[j][m - i - 1]);
             }
             for (int k = m - i - 2; (k >= i) && (n - i - 1 != i); k--) {
                 result.add(matrix[n - i - 1][k]);
             }
             for (int j = n - i - 2; (j > i) && (m - i - 1 != i); j--) {
                 result.add(matrix[j][i]);
             }
        }
        return result;
    }
}