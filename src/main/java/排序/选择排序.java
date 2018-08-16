package 排序;

/**
 * @author Blse
 * @date 2018/6/15
 * @description 每次都遍历整个数组，找到当前数组中相对的最小元素，往数组前面移
 *               最好情况
 *                  比较次数：n - 1 + n - 2 + ... + 1 = n ^ 2 / 2
 *                  移动次数：0
*                最坏情况
 *                  比较次数：n - 1 + n - 2 + ... + 1 = n ^ 2 / 2, 无论什么情况每一次的遍历都需要比较元素
 *                  移动次数：n - 1
 *
*                时间复杂度：O(n^2)
*
 */
public class 选择排序 {
    public static void main(String[] args) {
        int[] arrs = ArraysUtils.getArrs(10, 100);
        long start = System.currentTimeMillis() / 10000;
        System.out.println(start);
        for (int i = 0; i < arrs.length - 1; i++) {
            int temp = arrs[i];
            int index = i;
            for (int j = i + 1; j < arrs.length; j++) {
                if (temp > arrs[j]) {
                    temp = arrs[j];
                    index = j;
                }
            }
            arrs[index] = arrs[i];
            arrs[i] = temp;
        }
        long end = System.currentTimeMillis() / 10000;
        System.out.println(end);
        ArraysUtils.print(arrs);
    }
}
