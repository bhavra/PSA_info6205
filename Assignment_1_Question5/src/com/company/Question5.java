package com.company;
public class Question5 {
    static class Node {
        private int val;
        public Node next;
        public Node() {}
        public Node(int _val) {
            val = _val;
        }
        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    };
    public static Node insert(Node head, int insertVal) {
        if (head == null) {
            head = new Node();
            head.val = insertVal;
            head.next = head;
            return head;
        }
        Node next = head.next, pre = head;
        while (next != head) {if (pre.val == insertVal || (pre.val < insertVal && insertVal < next.val)) {
                Node cur = new Node(insertVal, next);
                pre.next = cur;
                return head;
            }
            if (pre.val > next.val && (insertVal < next.val || insertVal > pre.val)) {
                Node cur = new Node(insertVal, next);
                pre.next = cur;
                return head;
            }

            pre = next;
            next = next.next;
        }
        Node cur = new Node(insertVal, next);
        pre.next = cur;
        return head;
    }
    private static void printList(Node list){
        if(list == null){
            System.out.println("List is empty");
        }
        Node temp = list;
        while(temp != null){
            System.out.printf(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Node list = new Node();
        list=new Node(1);
        list.next=new Node(2);
        list.next.next=new Node(3);
        list.next.next.next=new Node(4);
        list.next.next.next.next=new Node(8);
        printList(list);
        Node res = new Node();
        res = insert(list,6);
        printList(res);
    }
}


