package easy;

import sun.awt.SunHints;

import java.util.Stack;

/**
 * User: chanson-pro
 * Date-Time: 2017-12-27 19:08
 * Description:两个栈实现一个队列
 */
public class FromStackToQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node){
        stack1.push(node);
    }
    public int pop(){
        while (stack1.size()<1){
            stack2.push(stack1.pop());
        }
        int value = stack1.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return value;
    }
}
