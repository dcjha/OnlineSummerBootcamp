import java.io.*;
import java.util.*;

public class L {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    void addLast(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = null;

      if (size == 0) {
        head = tail = temp;
      } else {
        tail.next = temp;
        tail = temp;
      }

      size++;
    }

    public int size(){
      return size;
    }

    public void display(){
      for(Node temp = head; temp != null; temp = temp.next){
        System.out.print(temp.data + " ");
      }
      System.out.println();
    }

    public void removeFirst(){
      // write your code here
    }
  }

  public static void main(String[] args) throws Exception {
    LinkedList list = new LinkedList();
    Scanner scn  = new Scanner(System.in);
    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
    list.addLast(40);

    list.display();
    list.size();
    System.out.println(list.head);

   
  }
}