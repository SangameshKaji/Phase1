//48. Search in Linked List
import java.util.*;

public class Q48 {

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

    static boolean searchKey(Node head, int key){
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node head = null;

        for(int i = 0; i < n; i++){
            head = insert(head, sc.nextInt());
        }

        int key = sc.nextInt();

        printlist(head);

        boolean found = searchKey(head, key);
        System.out.println(found);
    }
}