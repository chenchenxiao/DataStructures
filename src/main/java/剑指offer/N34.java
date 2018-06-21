package 剑指offer;

import java.util.HashMap;

/**
 * @author Blse
 * @date 2018/6/21
 * @description 在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置
 */
public class N34 {

    public static void main(String[] args) {
        int val = new N34().FirstNotRepeatingChar("NXWtnzyoHoBhUJaPauJaAitLWNMlkKwDYbbigdMMaYfkVPhGZcrEwp");
        System.out.println(val);
    }

    public int FirstNotRepeatingChar(String str) {
        char[] array = str.toCharArray();
        HashMap<Character, Integer> resultMap = new HashMap<Character, Integer>();
        for (int i = 0; i < array.length; i++) {
            char val = array[i];
            Integer integer = resultMap.get(val);
            if (integer == null) {
                resultMap.put(val, 1);
            } else {
                resultMap.put(val, integer + 1);
            }
        }
        for (int i = 0; i < array.length; i++) {
            int val = resultMap.get(array[i]);
            if (val == 1) {
                return i;
            }
        }
        return -1;
    }

}
