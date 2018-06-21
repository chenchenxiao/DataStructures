package 剑指offer;

/**
 * @author Blse
 * @date 2018/6/20
 * @description 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 *               例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */
public class N32 {

    public static void main(String[] args) {
        int[] arss = {3,5,1,4,2};
        String result = new N32().PrintMinNumber(arss);
        System.out.println(" ");
        System.out.println(result);
    }

    public String PrintMinNumber(int [] numbers) {
        int length = numbers.length;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                boolean flag = false;
                int val = numbers[i];
                if (j != i) {
                    int temp = numbers[j];
                    for (int k = 0; k < String.valueOf(temp).length(); k++) {
                        val *= 10;
                    }
                    val += temp;
                    flag = true;
                }
                if (flag) {
                    for (int n = 0; n < length; n++) {
                        if (n != i && n != j) {
                            int tempTwo = numbers[n];
                            for (int k = 0; k < String.valueOf(tempTwo).length(); k++) {
                                val *= 10;
                            }
                            val += tempTwo;
                        }
                    }
                    System.out.print(val + " ");
                    if (result > val) {
                        result = val;
                    }
                }
            }
        }
        return String.valueOf(result);
    }

}
