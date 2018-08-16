package 剑指offer;

/**
 * @author Blse
 * @date 2018/7/10
 * @description 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 */
public class N50 {

    public static void main(String[] args) {
        int i = new N50().StrToInt("123");
        System.out.println(i);
    }

    public int StrToInt(String str) {
        if (str.equals("") || str == null ) {
            return 0;
        }
        char[] array = str.toCharArray();
        char first = array[0];
        boolean isAdd  = true;
        int result = 0;
        if (first == '-') {
            isAdd =  false;
        } else if (first == '+') {
            isAdd = true;
        } else if ((int)first > 57 || (int)first < 48) {
            return 0;
        } else {
            result = first - 48;
        }

        for (int i = 1; i < array.length; i++) {
            char temp = array[i];
            if (temp < 57 && temp > 48) {
                result = (result * 10) + (temp - 48);
            } else {
                return 0;
            }
        }
       if (isAdd) {
            return result;
       } else {
            return 0 - result;
       }
    }
}
