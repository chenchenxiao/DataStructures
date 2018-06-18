package 剑指offer;

/**
 * @author Blse
 * @date 2018/6/18
 * @description 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *               本质上是斐波那契问题
 */
public class N10 {

    public static void main(String[] args) {
        int i = new N10().reRectCover(5);
        System.out.println(i);
    }

    /**
     * 非递归实现
     */
    public int RectCover(int target) {
        if (target <= 2) {
            return target;
        }
        int result = 0;
        int valA = 1;
        int valB = 2;
        for (int i = 2; i < target; i++) {
            result = valA + valB;
            valA = valB;
            valB = result;
        }
        return result;
    }

    /**
     * 递归实现
     */
    public int reRectCover(int n) {
        if (n == 0) {
            return 0;
        }
        if (n > 2) {
            return reRectCover(n - 1) + reRectCover(n - 2);
        } else {
            return n;
        }
    }
}
