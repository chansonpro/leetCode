package easy;

/**
 * User: chanson-pro
 * Date-Time: 2017-12-25 22:59
 * Description: 单向链表
 */
public class Node {
    private int value; //元素值
    private int next; // 后驱

    public Node(int data) {
        this.value = data;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }
}
