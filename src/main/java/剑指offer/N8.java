package 剑指offer;

/**
 * @author Blse
 * @date 2018/6/18
 * @description     一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *                   本质上是斐波那契问题
 */
public class N8 {

    /**
     * 非递归实现
     * @param n
     * @return
     */
    public int JumpFloor(int n) {
        if (n <= 2) {
            return n;
        }
        int valA = 1;
        int valB = 2;
        int val = 0;
        for (int i = 3; i <= n; i++) {
            val = valA + valB;
            valA = valB;
            valB = val;
        }
        return val;
    }

    /**
     * 递归实现
     */

    public int reJumpFloor(int n) {
        if (n == 0) {
            return 0;
        }
        if (n > 2) {
            return reJumpFloor(n - 1) + reJumpFloor(n - 2);
        } else {
            return n;
        }
    }

}
