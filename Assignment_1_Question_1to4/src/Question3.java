public class Question3 {
    public static ListNode swapNodes(ListNode head, int k) {
        k=k-1;
        ListNode first = head;
        while(k>0){
            first = first.next;
            k--;
        }
        ListNode temp1 = first;
        ListNode second = head;
        while(temp1.next!=null){
            second=second.next;
            temp1 = temp1.next;
        }
        int temp2 = first.val;
        first.val= second.val;
        second.val=temp2;
        return head;
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
       res = swapNodes(list,2);
        printList(res);




    }







}