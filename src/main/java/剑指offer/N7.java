package 剑指offer;

/**
 * @author Blse
 * @date 2018/6/18
 * @description 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。n <= 39
 */
public class N7 {

    public static void main(String[] args) {
        int fibonacci = new N7().reFibonacci(6);
        System.out.println(fibonacci);
    }

    /**
     * 非递归实现
     */
    public int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }

        int valA = 1;
        int valB = 1;
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

    public int reFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n > 2) {
            return reFibonacci(n - 1) + reFibonacci(n - 2);
        } else {
            return 1;
        }
    }
}
