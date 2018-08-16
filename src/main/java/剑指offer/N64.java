package 剑指offer;

import java.util.ArrayList;

/**
 * @author Blse
 * @date 2018/8/13
 * @description 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 *               例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
 *               针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 */
public class N64 {

    public static void main(String[] args) {
        int[] nums = {2,3,4,2,6,2,5,1};
        ArrayList<Integer> list = maxInWindows(nums, 3);
        System.out.println(list);
    }

    public static  ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> result = new ArrayList();
        int length = num.length;
        if (num == null || length == 0 || size > num.length || size == 0) {
            return result;
        }
        for (int i = 0; i < length - size + 1; i++) {
            int val = num[i];
            for (int j = i; j < i + size; j++) {
                System.out.println(j);
                int temp = num[j];
                if (temp > val) {
                    val = temp;
                }
            }
            result.add(val);
        }
        return result;
    }

}
