import java.util.*;
class L{

    
    public static class Node{
        int data;
        Node next;
        public Node(int val){
            this.data = val;
            this.next = null;
        }
    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        void addLast(int val){
            if(size==0){
                Node nn = new Node(val);
                // nn.data = val;
                // nn.next = null;
                head = nn;
                tail = nn;
                size++;
            }else{
                Node nn = new Node(val);
                // nn.data = val;
                // nn.next = null;
                tail.next = nn;
                tail = nn;
                size++;
            }
        }


        public void printLL(){
            Node temp = head;

            while(temp != null){
                System.out.print(temp.data+"  ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.printLL();
        ll.addLast(50);
        ll.printLL();
        System.out.println(ll.size);
    }

}