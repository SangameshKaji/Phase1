//46. Delete node at specific position in linked list
import java.util.*;

public class Q46 {
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
        while(temp.next!=null) temp = temp.next;
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
    static Node deleteAtK(Node head,int k){
        if(k == 1) return head.next;
        Node prev = head;
        Node temp = head.next;

        while(k>2){
            prev = temp;
            temp = temp.next;
            k--;
        }
        prev.next = temp.next;
        return head;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            Node head = null;
            for(int i = 0;i<n;i++){
                head = insert(head,sc.nextInt());
            }
            int k = sc.nextInt();
            printlist(head);
            head = deleteAtK(head,k);
            printlist(head);
        }
    }    
}


