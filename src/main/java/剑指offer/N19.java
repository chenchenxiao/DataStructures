package 剑指offer;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author Blse
 * @date 2018/6/19
 * @description 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
public class N19 {

    private Stack<Integer> stack = new Stack<Integer>();

    public void push(int node) {
        stack.push(node);
    }

    public int pop() {
        return stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        Integer min = stack.peek();
        int temp = 0;
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()){
            temp = iterator.next();
            if (min>temp){
                min = temp;
            }
        }
        return min;
    }
}
