package 剑指offer;

/**
 * @author Blse
 * @date 2018/6/18
 * @description 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class N12 {

    public double Power(double base, int exponent) {
        double result = 1;
        if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
        } else {
            exponent = exponent -(2 * exponent);
            System.out.println(exponent);
            base = 1 / base;
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }

        }
        return result;
    }
}
