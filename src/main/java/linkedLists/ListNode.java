package linkedLists;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public void next(ListNode next) {
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    //    public ListNode makeList(int[] values) {
//        ListNode head = new ListNode();
//        ListNode it = head;
//        for (int el : values) {
//            ListNode newNode = new ListNode(el);
//            it.next(newNode);
//            it = it.next();
//        }
//        return head.next();
//    }


}
