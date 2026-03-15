//41. Insert node at Head Position of Linked list
import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Q41 {
    static Node insert(int data, Node head){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            for(int i = 1;i<n;i++){
                head = insert(sc.nextInt(), head);
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
}
