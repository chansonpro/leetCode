package easy;

/**
 * User: chanson-pro
 * Date-Time: 2017-12-25 22:55
 * Description:时间复杂度为O(N)
 */
public class ReverseList {
    //1.反转单向链表,返回新的链表的头结点（遍历节点）
    public Node reverseList(Node head){
        Node pre = head;// 上一节点
        Node cur = head.getNext();// 当前结点
        Node tmp = null;
        while (cur !=null){
            tmp = head.getNext();//当前结点的指针域
            cur.setNext(pre);// 反转指针域的指向
            // 指针往下移动
            pre = cur;
            cur = tmp;
        }
        // 最后将原链表的头节点的指针域置为null，还回新链表的头结点，即原链表的尾结点
        head.setNext(null);
        return pre;
    }
}
