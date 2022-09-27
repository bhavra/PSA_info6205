public class Question4 {
    public static ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res = new ListNode[k];
        if (k == 1) {
            res[0] = head;
            return res;
        }
        int n = getLength(head);
        ListNode pre = null;
        for (int i = 0; i < k; i++) {
            res[i] = head;
            int j = n / k + (i < n % k ? 1 : 0);
            while (head != null && j > 0) {
                pre = head;
                head = head.next;
                j--;
            }
            if (pre != null) pre.next = null;
        }
        return res;
    }
    public static void printList(ListNode list){
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
    public static int getLength(ListNode root) {
        int len = 0;
        while (root != null) {
            len++;
            root = root.next;
        }
        return len;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode();
        list=new ListNode(1);
        list.next=new ListNode(2);
        list.next.next=new ListNode(3);
        list.next.next.next=new ListNode(4);
        list.next.next.next.next=new ListNode(5);
       // printList(list);
        ListNode[] res = new ListNode[0];
        res = splitListToParts(list,2);
        printList(res);
    }
}
