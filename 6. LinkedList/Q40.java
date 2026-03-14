//40. Construct a Singly Linked list
import java.util.*;

class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
    this.next = null;
  }
}
public class Q40 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0;i<n;i++) arr[i] = sc.nextInt();
      Node head = arrayToList(arr);
      while(head.next != null){
        System.out.print(head.data + "->");
        head = head.next;
      }
      System.out.println(head.data);
    }
  }

  static Node arrayToList(int arr[]) {
      Node head = new Node(arr[0]);
      Node temp = head;
      for(int i = 1; i<arr.length;i++){
        Node n = new Node(arr[i]);
        temp.next = n;
        temp = n;
      }
      return head;
  }
}
