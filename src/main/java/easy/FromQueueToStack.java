package easy;

import java.util.LinkedList;

/**
 * User: chanson-pro
 * Date-Time: 2017-12-27 19:22
 * Description:两个队列实现一个栈,
 * 队列是先进先出，栈式先进后出，因此在push时，应该保证两个队列至少有一个为空
 * （换句话说，所有的元素都应该在一个队列中）
 */
public class FromQueueToStack {
    LinkedList<Integer> queue1 = new LinkedList<Integer>();
    LinkedList<Integer> queue2 = new LinkedList<Integer>();

    public void push(int node){
        if (queue1.isEmpty()){
            queue2.add(node);
        }
        if(queue2.isEmpty()){
            queue1.add(node);
        }
    }
    public int pop(){
        //两个栈都为空
        if (queue1.isEmpty() && queue2.isEmpty()){
            throw new IllegalArgumentException("stack is empty");
        }
        if (queue1.isEmpty()){
            while (queue2.size()>1){
                // poll使用方法,获取并删除列表的第一个元素
                // peek使用方法,获取并不删除列表的第一个元素
                // pop取堆栈中取出元素，并出栈
                queue1.add(queue2.poll());
            }
            return queue2.poll();
        }

        if (queue2.isEmpty()){
            while (queue1.size()>1){
                queue2.add(queue1.poll());
            }
            return queue1.poll();
        }
        return 0;
    }


}
