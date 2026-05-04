package linkedlist;

public class MyLinkedList1 {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void insertAtHead(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }

    static void main() {
        MyLinkedList1 list = new MyLinkedList1();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.display();
    }
}
