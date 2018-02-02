package easy;

/**
 * User: chanson-pro
 * Date-Time: 2017-12-25 22:55
 * Description:时间复杂度为O(N)
 */
public class ReverseList {
    //1.反转单向链表,返回新的链表的头结点（遍历节点）
    private static Node reverseList(Node head){
        Node pre = head;// 上一节点
        Node cur = head.getNext();// 当前结点
        Node tmp;
        while (cur !=null){
            tmp = cur.getNext();//当前结点的指针域
            cur.setNext(pre);// 反转指针域的指向
            // 指针往下移动
            pre = cur;
            cur = tmp;
        }
        // 最后将原链表的头节点的指针域置为null，还回新链表的头结点，即原链表的尾结点
        head.setNext(null);
        return pre;
    }
    //2.双向链表，反转
    /*private static DoubleNode reverseList(DoubleNode head){

    }*/

    public static void main(String[] args) {
        Node head = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        // 打印反转前的链表
        Node h = head;
        while (null != h) {
            System.out.print(h.getValue() + " ");
            h = h.getNext();
        }
        // 调用反转方法
        // head = reverse1(head);
        head = reverseList(head);

        System.out.println("\n**************************");
        // 打印反转后的结果
        while (null != head) {
            System.out.print(head.getValue() + " ");
            head = head.getNext();
        }
    }
}
