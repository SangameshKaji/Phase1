//41. Insert node at Head Position of Linked list
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Q43 {

    static Node insertInMiddle(Node head, int x) {
        Node newNode = new Node(x);
        if(head == null) return newNode;

        Node fast = head;
        Node slow = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        newNode.next = slow.next;
        slow.next = newNode;

        return head;
    }

    static void printList(Node head){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node temp = head;
            for(int i = 1;i<n;i++){
                Node node = new Node(sc.nextInt());
                temp.next = node;
                temp = node;
            }
            int x = sc.nextInt();
            head = insertInMiddle(head, x);
            printList(head);
        }
    }
}