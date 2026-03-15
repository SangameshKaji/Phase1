//42. Insert node at specific position in Linked List
import java.util.*;

public class Q42 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node insert(Node temp, int data){
        Node n = new Node(data);
        temp.next = n;
        temp = n;
        return temp;
    }
    static void printlist(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node insertAtPosition(Node head, int a, int b){
        Node A = new Node(a);
        if(b==1){
            A.next = head;
            return A;
        }
        Node t = head;
        for(int i = 1;i<b-1;i++){
            t = t.next;
        }
        A.next = t.next;
        t.next = A; 
        return head;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node temp = head;
            for(int i = 1;i<n;i++){
                temp = insert(temp,sc.nextInt());
            }
            int a = sc.nextInt();//Data to insert
            int b = sc.nextInt();//Place to insert
            printlist(head);
            head = insertAtPosition(head, a, b);
            printlist(head);
        }
    }    
}
