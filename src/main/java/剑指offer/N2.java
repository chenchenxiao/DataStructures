package 剑指offer;

/**
 * @author Blse
 * @date 2018/6/17
 * @description 请实现一个函数，将一个字符串中的空格替换成“%20”。
 *               例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class N2 {

    public String replaceSpace(StringBuilder str) {
        //该情况为str没有添加任何字符的情况
        if (str.toString().equals("")) {
            return str.toString();
        }
        //当前索引
        int i = 0;
        //当前索引对应的字符
        char s = 0;
        //传进来的str长度
        int length = str.length();
        //循环执行的标志
        boolean flag = true;
        while (flag) {
            //取出当前位置的字符
            s = str.charAt(i);
            //判断当前字符是否为空格
            if (s == ' ') {
                //替换空格为'%'，接下来在当前位置后面插入'20'
                str.setCharAt(i, '%');
                str.insert(i + 1, '2');
                str.insert(i + 2, '0');
                //索引位置和str的长度加二，因为插入了两个字符
                i += 2;
                length += 2;
                //重新设置str的长度
                str.setLength(length);
            }
            else {
                //索引位置加一
                i++;
                //索引位置与str的长度相同时，证明替换结束
                if (i == length) {
                    flag = false;
                }
            }
        }
        return str.toString();
    }

}
