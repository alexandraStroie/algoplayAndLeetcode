package leetcode;

//import linkedList.ListNode;
import linkedLists.ListNode;
import linkedLists.singlyLinkedList.SinglyLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PalindromeLinkedList234 {
    public static void main(String[] args) {
        LinkedList<Integer> nrs = new LinkedList<>();

        nrs.add(1);
        nrs.add(2);
        nrs.add(2);
        nrs.add(1);

    }

    public static boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<>();
        ListNode currentNode = head;

        while (currentNode != null) {
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }

        //reverse arraylist
        List<Integer> reverseVals = new ArrayList<>();
        for (int i = vals.size() -1 ; i >= 0; i--) {
            reverseVals.add(vals.get(i));
        }

        for (int i = 0; i < vals.size() - 1; i++) {
            if (vals.get(i) != reverseVals.get(i)) {
                return false;
            }
        }
        return true;
    }


//    public boolean isPalindromeTwoRunnerTechnique(ListNode head) {
//
//    }
}
