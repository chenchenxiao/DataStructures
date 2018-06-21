package 剑指offer;

/**
 * @author Blse
 * @date 2018/6/20
 * @description 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 *               由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class N28 {

    public int MoreThanHalfNum_Solution(int [] array) {
        if (array.length == 1) {
            return array[0];
        }
        int length = array.length;
        int result = 0;
        int num = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]){
                    num++;
                    if (num >= length / 2) {
                        result = array[i];
                        return result;
                    }
                }
            }
            num = 0;
        }
        return result;
    }
}
