package 剑指offer;

import java.util.ArrayList;

/**
 * @author Blse
 * @date 2018/6/24
 * @description 约瑟夫环问题
 */
public class N47 {

    public static void main(String[] args) {
        int result = new N47().LastRemaining_Solution(5, 3);
        System.out.println(result);
    }


    public int LastRemaining_Solution(int n, int m) {
        if (n == 1) {
            return 0;
        } else if (n == 0) {
            return -1;
        }
        int index = 0;
        int num = 0;
        ArrayList<Integer> resultList = new ArrayList<Integer>(m);
        for (int i = 0; i < n; i++) {
            resultList.add(i);
        }
        while (resultList.size() != 1) {
            num++;
            if (index >= resultList.size()) {
                index -= resultList.size();
            }
            if (num == m) {
                resultList.remove(index);
                num = 0;
            } else {
                index++;
            }
        }
        return  resultList.get(0);
    }
}
