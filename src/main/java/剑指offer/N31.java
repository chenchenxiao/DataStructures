package 剑指offer;

/**
 * @author Blse
 * @date 2018/6/20
 * @description 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 *               为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
 *               ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数。
 */
public class N31 {

    public static void main(String[] args) {
        int result = new N31().NumberOf1Between1AndN_Solution(20);
        System.out.println(result);
    }

    public int NumberOf1Between1AndN_Solution(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp > 0) {
                int val = temp % 10;
                if (val == 1) {
                    result++;
                }
                temp /= 10;
            }
        }
        return result;
    }
}
