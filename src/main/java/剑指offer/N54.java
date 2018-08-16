package 剑指offer;

/**
 * @author Blse
 * @date 2018/7/17
 * @description 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 *               例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 * 1.整数开始部分遇到+、-号跳过
 * 2.小数点只能出现一次
 * 3.小数点之前不能存在e
 * 4.e之前必须有整数
 * 5.e只能出现一次
 * 6.e之后可存在+、-号，但+-之后必须有整数
 */
public class N54 {
    public boolean isNumeric(char[] str) {
        int length = str.length;
        if (str == null || length == 0) {
            return false;
        }
        int index = 0;
        boolean hasE = false;
        boolean sign = false;
        boolean dian = false;
        if (!Character.isDigit(str[0])) {
            if (str[0] == '+' || str[0] == '-') {
                sign = true;
                index++;
            } else if (str[0] == '.'){
                dian = true;
                index++;
            } else {
                return false;
            }
        }
        if (index == length - 1) {
            return false;
        }
        for (int i = index; i < length; i++) {
            char temp = str[i];
            if (!Character.isDigit(temp)) {
                if (temp == '+' || temp == '-') {
                    if (sign) {
                        return false;
                    } else if (str[i - 1] == 'E' || str[i - 1] == 'e'){
                        sign = true;
                    } else {
                        return false;
                    }
                } else if (temp == '.') {
                    if (dian) {
                        return false;
                    }
                    dian = true;
                } else if (temp == 'e' || temp == 'E') {
                    if (hasE || i == length - 1) {
                        return false;
                    } else if (str[i - 1] == '.' || Character.isDigit(str[i - 1])) {
                        hasE = true;
                        dian = true;
                        sign = false;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
