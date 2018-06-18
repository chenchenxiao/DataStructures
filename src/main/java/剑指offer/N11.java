package 剑指offer;

/**
 * @author Blse
 * @date 2018/6/18
 * @description 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class N11 {
    public int NumberOf1(int n) {
        int result = 0;
        while (n != 0) {
            result++;
            n = n & (n - 1);
        }
        return result;
    }
}
