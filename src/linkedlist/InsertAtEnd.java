package linkedlist;

public class InsertAtEnd {
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }

    static void main() {
   InsertAtEnd list = new InsertAtEnd();
   list.insertAtEnd(20);
   list.insertAtEnd(50);
   list.display();
    }
}
