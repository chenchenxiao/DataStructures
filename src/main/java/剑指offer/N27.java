package 剑指offer;

import java.security.Permission;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Blse
 * @date 2018/6/20
 * @description 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 *               例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
public class N27 {

    public static void main(String[] args) {
        ArrayList<String> abc = new N27().Permutation("abcd");
        for (String str : abc) {
            System.out.print(str + " ");
        }
    }

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<String>();
        if (str == null) {
            return result;
        }
        char[] arrs = str.toCharArray();
        int length = arrs.length;
        for (int i = 0; i < length; i++) {
            for (int k = 0; k < length; k++){
                //取得当前的第一个字母
                String temp = String.valueOf(arrs[i]);
                //表示是否继续排列
                boolean flag = false;
                //当与取得的temp不同时开始排列
                if (k != i) {
                    temp += arrs[k];
                    flag = true;
                }
                //排列
                if (flag) {
                    for (int j = 0; j < length; j++) {
                        if (j != i && j != k) {
                            temp += arrs[j];
                        }
                    }
                }
                if (flag || length == 1) {
//                    if (!result.contains(temp)) {
                        result.add(temp);
//                    }
                }
            }
        }
        return result;
    }
}
