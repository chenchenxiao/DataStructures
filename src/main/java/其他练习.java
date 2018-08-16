/**
 * @author Blse
 * @date 2018/7/9
 * @description  结合位运算，输出一个整数的二进制
 */
public class 其他练习 {

    public static void main(String[] args) {
         int num = 10;
         while (num > 0) {
             if (num >> 1 == 0) {
                 System.out.print(1 + " ");
             } else {
                 System.out.print(0 + " ");
             }
             num = num >> 1;
         }

    }

}
