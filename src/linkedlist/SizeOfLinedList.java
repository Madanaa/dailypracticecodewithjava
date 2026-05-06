package linkedlist;

public class SizeOfLinedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public int getSize() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    static void main() {
        SizeOfLinedList linkedList = new SizeOfLinedList();
        linkedList.head = new Node(10);
        linkedList.head.next = new Node(20);
        linkedList.head.next.next = new Node(40);
        linkedList.display();
        System.out.println(linkedList.getSize());
    }
}
