package 排序;

/**
 * @author Blse
 * @date 2018/6/15
 * @description     插入排序是从第一个元素开始，每次取下一个元素，与前面的元素进行比较，
 *                   把大于该元素的元素的向后移，将该元素插入到当前最小元素的位置
 *                   最好情况：本来就是有序的
 *                      比较次数：n - 1
 *                      移动次数：0
*                    最坏情况：
 *                      比较次数：2 + 3 + ... + n 也就是等差数列， (n + 2) n / 2
 *                      移动次数：1 + 2 + ... + n - 1 ，同理，n * n / 2
*                    平均时间复杂度为O(n^2)
 */
public class 插入排序 {
    public static void main(String[] args) {
        int[] arrs = ArraysUtils.getArrs(100, 100000);
        int length = arrs.length;
        for (int i = 0; i < length; i++) {
            int index = i;
            for (int j = i; j > 0; j--) {
                if (arrs[j] < arrs[j - 1]) {
                    int temp = arrs[j - 1];
                    arrs[j - 1] = arrs[j];
                    arrs[j] = temp;
                }
            }
        }
        ArraysUtils.print(arrs);
    }
}
