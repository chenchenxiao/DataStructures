package 剑指offer;

import java.util.ArrayList;

/**
 * @author Blse
 * @date 2018/6/22
 * @description 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
 *               如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class N43 {


    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        int length = array.length;
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        if (length == 0) {
            return resultList;
        }
        int first = 0;
        int second = 0;
        int result = Integer.MAX_VALUE;
        boolean isFind = false;
        for (int i = 0; i < length; i++) {
            int temp = array[i];
            for (int j = 0; j < length; j++) {
                if (j != i) {
                    int tempTwo = array[j];
                    if (temp + tempTwo == sum) {
                        int val = temp * tempTwo;
                        if (val < result) {
                            first = temp;
                            second = tempTwo;
                            result = val;
                            isFind = true;
                        }
                    }
                }
            }
        }
        if (isFind) {
            resultList.add(first);
            resultList.add(second);
        }
        return resultList;
    }

}
