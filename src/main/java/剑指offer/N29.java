package 剑指offer;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author Blse
 * @date 2018/6/20
 * @descriptionnn 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class N29 {

    public static void main(String[] args) {
        int[] arrs = {4,5,1,6,2,7,3,8};
        ArrayList<Integer> list = new N29().GetLeastNumbers_Solution(arrs, 4);
        for (int val : list) {
            System.out.println(val);
        }
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int length = input.length;
        if (k > length || k < 0) {
            return result;
        }
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                int temp = input[j];
                if (input[j] > input[j + 1]) {
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            result.add(input[i]);
        }
        return result;
    }
}
