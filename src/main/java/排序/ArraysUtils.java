package 排序;

import java.util.Random;

/**
 * @author Blse
 * @date 2018/6/15
 * @description     随机生成元素大小在指定范围内的数组
 */
public class ArraysUtils {

    private ArraysUtils(){}

    public static int[] getArrs(int num, int range) {
        int[] arrs = new int[num];
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            arrs[i] = random.nextInt(range);
        }
        return arrs;
    }

    public static void print(int[] arrs) {
        for (int val : arrs) {
            System.out.print(val + " ");
        }
        System.out.println(" ");
    }
}
