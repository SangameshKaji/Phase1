//47. Finding length of Linked list (Iterative and Recursive)
import java.util.*;

public class Q47 {
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

    static int getCount(Node head){
        int sum = 0;
        Node temp = head;
        while(temp != null){
            sum++;
            temp = temp.next;
        }
        return sum;
    }

    static int getCountRec(Node head){
        if(head == null) return 0;
        return 1 + getCountRec(head.next);
    }

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            Node head = null;
            for(int i = 0; i < n; i++){
                head = insert(head, sc.nextInt());
            }

            printlist(head);

            System.out.println(getCount(head));
            System.out.println(getCountRec(head));
        }
    }
}