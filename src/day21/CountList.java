package day21;

import org.w3c.dom.Node;

public class CountList {
    Node Head;
    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next =null;
        }
    }
    public static int countList(Node head){
        if (head == null)
            return 0;
        return 1 + countList(head.next);
    }
public static int countNodes(int data) {
        Node head = new Node(data);
        int count = 0;
    while (head != null){
            count++;
            head = head.next;
        }
        return count;
}

public static int countList2(Node head){
        int count = 0;
        while (head != null){
            count++;
            head = head.next;

        }
        return count;
}
    static void main() {
        CountList list = new CountList();
        list.Head = new Node(1);
        list.Head.next = new Node(2);
        list.Head.next.next = new Node(3);
        list.Head.next.next.next = new Node(4);
        System.out.println(countList(list.Head));
        System.out.println(countNodes(1));
        System.out.println(countList2(list.Head));

    }
}
