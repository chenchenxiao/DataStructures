package 剑指offer;

/**
 * @author Blse
 * @date 2018/6/21
 * @description 把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含因子7。
 *               习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class N33 {

    public static void main(String[] args) {
        System.out.println(0.5 / 2);
    }

    public int GetUglyNumber_Solution(int target) {
        if (target < 1) {
            return 0;
        }
        int result = 1;
        double index = 1;
        while (result == target) {
            boolean flag = false;
            double temp = index;
            while (temp % 2 == 0) {
                temp /= 2;
            }
        }

        return 0;
    }

}
