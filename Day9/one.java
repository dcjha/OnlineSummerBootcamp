import java.util.*;
class Codechef{

    
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
        
        Node nodeat(int idx){
            if(idx>size){
                return null;
            }
            Node temp = head;
            while(--idx>0){
                temp  = temp.next;
            }
            return temp;
        }
         void addFirst(int val){
            Node nn = new Node(val);
            if(size==0){
                head=nn;
                tail=nn;
            }else{
                nn.next = head;
                head = nn;
            }
            size++;
            
         }
         public void addAt(int val,int idx){
             Node nn = new Node(val);
             Node prev = nodeat(idx-1); // 2
             if(idx==1 || size==0){
                 addFirst(val);
                 return;
             }
             if(prev==null){
                 return;
             }
             nn.next = prev.next;   //6->3
             prev.next = nn;
             size++;
         }
         
         Node removeFirst(){
             if(size==0){
                 return null;
             }
             Node temp = head;
             head = head.next;
             size--;
             return temp;
         }
         
         Node removeLast(){
             if(size==0){
                 return null;
             }
             Node temp = nodeat(size-1);
             Node t = tail;
             temp.next=null;
             tail = temp;
             size--;
             return t;
         }
         
        Node removeAt(int idx){
            if(size==0 || idx==1){
                Node t = removeFirst();
                return t;
            }
            if(size==idx){
                Node t = removeLast();
                return t;
            }
            
            Node prev = nodeat(idx-1);
            Node temp = prev.next;
            prev.next = temp.next;
            size--;
            return temp;
            
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
        // ll.printLL();
        ll.addLast(50);
        // ll.printLL();
        ll.addFirst(0);
        // ll.printLL();
        // System.out.println(ll.nodeat(10).data);
        ll.addAt(-1,1);
        ll.printLL();
        System.out.println(ll.removeLast().data);
        ll.printLL();
        System.out.println(ll.removeFirst().data);
        ll.printLL();
        System.out.println(ll.removeAt(3).data);
        ll.printLL();
    }

}