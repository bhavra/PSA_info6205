package com.company;

public class LinkedList {
    Node head;
    class Node {
        int val;
        Node next;
        Node(int d) {
            val = d;
            next = null;
        }
    }

    Node newNode(int data) {
        Node x = new Node(data);
        return x;
    }

    void sortedInsert(Node new_node) {
        Node current;
        if (head == null || head.val >= new_node.val) {
            new_node.next = head;
            head = new_node;
        }
        else {
            current = head;
            while (current.next != null && current.next.val < new_node.val)
                current = current.next;
            new_node.next = current.next;
            current.next = new_node;
        }
    }
    void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

}
