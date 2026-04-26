package day15;

public class SizeOfLInkedList {
       public int getSize(Node head) {
           int count = 0;
           Node current = head;
           while (current != null) {
               count++;
               current = current.next;
           }
           return count;
       }

    static void main() {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node four = new Node(40);

        head.next = second;
        second.next = third;
        third.next = four;

        SizeOfLInkedList length = new SizeOfLInkedList();
        int size = length.getSize(head);
        System.out.println(size);

    }
}

class Node{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}