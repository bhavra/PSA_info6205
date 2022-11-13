package com.company;

public class Main {

    public static void main(String args[]) {
        LinkedList llist = new LinkedList();
        LinkedList.Node new_node;
        new_node = llist.newNode(8);
        llist.sortedInsert(new_node);
        new_node = llist.newNode(13);
        llist.sortedInsert(new_node);
        new_node = llist.newNode(10);
        llist.sortedInsert(new_node);
        new_node = llist.newNode(6);
        llist.sortedInsert(new_node);
        new_node = llist.newNode(2);
        llist.sortedInsert(new_node);
        new_node = llist.newNode(12);
        llist.sortedInsert(new_node);
        llist.printList();
    }
}
