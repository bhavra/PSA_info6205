import java.util.LinkedList;

public class Question1 {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head.next == null) {
            return head;
        }
        ListNode prev = null, curr = head;
        int size = 0;
        while (curr != null) {
            prev = curr;
            curr = curr.next;
            size++;
        }
        curr = head;
        prev.next = curr;
        int rotate = k % size;
        int location = size - rotate;
        for (int i = 0; i < location; i++) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        return curr;

    }

    private static void printList(ListNode list){
        if(list == null){
            System.out.println("List is empty");
        }
        ListNode temp = list;
        while(temp != null){
            System.out.printf(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next=new ListNode(2);
        list.next.next=new ListNode(3);
        list.next.next.next=new ListNode(4);
        list.next.next.next.next=new ListNode(5);
        printList(list);
        ListNode res = new ListNode();
        res = rotateRight(list,2);
        printList(res);
    }
}
