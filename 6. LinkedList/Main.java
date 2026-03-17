//Template
import java.util.*;

public class Main {
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

    static Node functionName(Node head){
        return head;
    }

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            Node head = null;

            for(int i = 0; i < n; i++){
                head = insert(head, sc.nextInt());
            }

            printlist(head);

            head = functionName(head);

            printlist(head);
        }
    }
}