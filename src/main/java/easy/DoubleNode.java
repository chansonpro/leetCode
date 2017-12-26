package easy;

/**
 * User: chanson-pro
 * Date-Time: 2017-12-26 10:28
 * Description:
 */
public class DoubleNode {
    private int value;
    private DoubleNode pre;
    private DoubleNode next;

    public DoubleNode(int data) {
        this.value = data;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DoubleNode getLast() {
        return pre;
    }

    public void setLast(DoubleNode pre) {
        this.pre = pre;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }
}
