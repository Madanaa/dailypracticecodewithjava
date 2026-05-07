package linkedlist;



public class DeleteFirstNode {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void deleteFirst(){
        if (head != null) {
            head = head.next;
        }
    }
    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    static void main() {
  DeleteFirstNode list = new DeleteFirstNode();
     list.head = new Node(20);
     list.head.next = new Node(30);
     list.deleteFirst();
     list.display();
    }
}
