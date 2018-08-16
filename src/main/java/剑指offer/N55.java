package 剑指offer;

/**
 * @author Blse
 * @date 2018/7/17
 * @description 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 *               例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 */
public class N55 {

    int[] array = new int[256];
    private int index = 1;

    //Insert one char from stringstream
    public void Insert(char ch) {
        if (array[ch] == 0) {
            array[ch] = index++;
        } else {
            array[ch] = -1;
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        int temp = Integer.MAX_VALUE;
        char result = '#';
        for (int i = 0; i < 256; i++) {
            if (array[i] > 0 && array[i] < temp) {
                temp = array[i];
                result = (char) i;
            }
        }
        return result;
    }
}
