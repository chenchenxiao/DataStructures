package 剑指offer;

import java.util.ArrayList;

/**
 * @author Blse
 * @date 2018/6/18
 * @description 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 *               使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 *               并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class N13 {

    public void reOrderArray(int [] array) {
        ArrayList<Integer> oddList = new ArrayList();
        ArrayList<Integer> evenList = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenList.add(array[i]);
            } else {
                oddList.add(array[i]);
            }
        }
        int evenIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < oddList.size()) {
                array[i] = oddList.get(i);
            } else {
                array[i] = evenList.get(evenIndex);
                evenIndex++;
            }
        }
    }
}
