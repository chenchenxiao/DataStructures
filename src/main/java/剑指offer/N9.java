package 剑指offer;

/**
 * @author Blse
 * @date 2018/6/18
 * @description  一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 *                求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class N9 {

    /**
     * 递归实现
     */
    public int reJumpFloorII(int target) {
        if (target <= 1) {
            return target;
        }
        return 2 * reJumpFloorII(target - 1);
    }

    /**
     * 非递归实现
     */
    public int JumpFloorII(int target) {
        if (target <= 2) {
            return target;
        }
        int[] arrays = new int[target + 1];
        arrays[0] = 1;
        arrays[1] = 1;
        for (int i = 2; i <= target; i++) {
            for (int j = 0; j < i; j++) {
                arrays[i] += arrays[j];
            }
        }
        return arrays[target];
    }

}
