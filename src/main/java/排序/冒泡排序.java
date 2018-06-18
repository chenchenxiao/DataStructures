package 排序;

/**
 * @author Blse
 * @date 2018/6/15
 * @description 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
 *               对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
 *               最好情况：
 *                  比较次数: n - 1
 *                  移动次数：0
*                最坏情况：
 *                  比较次数：n - 1 + n - 2 + n - 3 + ..+ 1   =  n (n - 1) / 2
 *                  移动次数：同理也是  n (n - 1) / 2
 *
*                时间复杂度：O(n^2),最好是O(n),也就是数组是已经排好序的情况
 */
public class 冒泡排序 {
    public static void main(String[] args) {
        int[] arrs = ArraysUtils.getArrs(100, 10000000);
        long start = System.currentTimeMillis() / 1000;
//        System.out.println(start);
        for (int i = 0; i < arrs.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arrs.length - 1 - i; j++) {
                int temp = arrs[j];
                if (temp > arrs[j + 1]) {
                    arrs[j] = arrs[j + 1];
                    arrs[j + 1] = temp;
                    flag = true;
                }
            }
            ArraysUtils.print(arrs);
//            System.out.println("");
            if (flag == false) {
                return;
            }
        }
        long end = System.currentTimeMillis() / 1000;
        System.out.println(end);
    }

}
