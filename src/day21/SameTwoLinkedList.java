package day21;

public class SameTwoLinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static boolean areIdentical(Node head1, Node head2) {
        Node curr1 = head1;
        Node curr2 = head2;
        while (curr1 != null && curr2 != null) {
            if (curr1.data != curr2.data) {
                return false;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return curr1 == null && curr2 == null;
    }

    static void main() {
        SameTwoLinkedList list = new SameTwoLinkedList();
        list.head = new Node(4);
        list.head.next = new Node(5);
        list.head.next.next = new Node(6);
        SameTwoLinkedList list2 = new SameTwoLinkedList();
        list2.head = new Node(4);
        list2.head.next = new Node(5);
        list2.head.next.next = new Node(6);
//        SameTwoLinkedList list3 = new SameTwoLinkedList();
//        list3.head.next.next.next = new Node(4);
//        list3.head.next.next.next.next = new Node(5);
//        list2.head.next.next.next.next.next = new Node(6);
        System.out.println(areIdentical(list.head, list2.head));
    }
}
