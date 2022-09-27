public class Question2 {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode result = new ListNode();
        ListNode temp = result;
        while(head!=null){
            if(head.val!=val){
                temp.next = new ListNode(head.val);
                temp=temp.next;
            }
            head = head.next;
        }
        return result.next;
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

    public static void main(String[] args) {
        ListNode list = new ListNode();
        list=new ListNode(1);
        list.next=new ListNode(2);
        list.next.next=new ListNode(3);
        list.next.next.next=new ListNode(4);
        list.next.next.next.next=new ListNode(5);
        printList(list);
        ListNode res = new ListNode();
        res = removeElements(list,2);
        printList(res);
    }

}
