package 剑指offer;

/**
 * @author Blse
 * @date 2018/6/22
 * @description 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */
public class N41 {
    public static void main(String[] args) {
        int[] array = {2,4,3,6,3,2,5,5};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        new N41().FindNumsAppearOnce(array, num1 ,num2);
    }

    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int length = array.length;
        boolean isFind = false;
        if (length == 0) {
            num1[0] = 0;
            num2[0] = 0;
        }
        for (int i = 0; i < length; i++) {
            int temp = array[i];
            int number = 1;
            for (int j = 0; j < length; j++) {
                if (j != i && temp == array[j]) {
                    number++;
                }
            }
            if (number == 1) {
               if (!isFind) {
                   num1[0] = temp;
                   isFind = true;
               } else {
                   num2[0] = temp;
               }
            }
        }
    }

}
