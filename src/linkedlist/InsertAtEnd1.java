package linkedlist;

public class InsertAtEnd1 {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    static Node insertAtEnd(Node head, int x) {
        Node newNode = new Node(x);
        if (head == null) {
           return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
         temp.next = newNode;
        return head;
    }
    public  void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
