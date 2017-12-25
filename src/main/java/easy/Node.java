package easy;

/**
 * User: chanson-pro
 * Date-Time: 2017-12-25 22:59
 * Description: 单向链表
 */
public class Node {
    private int value; //元素值
    private Node next; // 后驱

    public Node(int data) {
        this.value = data;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
