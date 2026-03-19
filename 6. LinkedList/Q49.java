//49. Reversing a linked list Iterative and Recursive)
import java.util.*;

public class Q49 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node insert(Node head, int data){
        Node newNode = new Node(data);
        if(head == null) return newNode;
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        temp.next = newNode;
        return head;
    }

    static void printlist(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node reverse(Node head){
        if(head == null || head.next== null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            Node head = null;

            for(int i = 0; i < n; i++){
                head = insert(head, sc.nextInt());
            }

            printlist(head);

            head = reverse(head);

            printlist(head);
        }
    }
}
