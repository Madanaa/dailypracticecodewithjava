package linkedlist;

public class TraverseByRecursionLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void traverseList(Node head){
        if (head == null){
            System.out.println();
            return;
        }
        System.out.print(head.data+" Current Node");

        if (head.next != null) {
            System.out.println("->");
        }
        traverseList(head.next);
    }
    public void display(){

    }

    static void main() {
        //TraverseByRecursionLinkedList list = new TraverseByRecursionLinkedList();
        Node head = new Node(10);
        head = new Node(20);
        head.next = new Node(30);
        head.next.next = new Node(40);
        traverseList(head);
    }
}
