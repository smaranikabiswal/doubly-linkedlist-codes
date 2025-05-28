public class removeNodeDoublyLL{
    public static class node{
int data;
node next;
node prev;
public node(int data){
    this.data=data;
    this.next=null;
    this.prev=null;
}
    }
    public static node head;
    public static node tail;
    public static int size;
    public void addFirst(int data){
        node newnode=new node(data);
        size++;
        if (head ==null) {
           head=tail=newnode; 
           return;
        }
newnode.next=head;
head.prev=newnode;
head=newnode;
    }
    public void printlist(){
        node temp=head;
        while (temp !=null) { 
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int remove(){
        if (head ==null) {
            System.out.println("the linkedlist is empty");
           return Integer.MIN_VALUE; 
        }if (size==1) {
          int val=head.data;
          head=tail=null;
          size--;
          return val;  
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public static void main(String[] args) {
        removeNodeDoublyLL dll=new removeNodeDoublyLL();
         dll.addFirst(5);
         dll.addFirst(4);
         dll.addFirst(3);
         dll.addFirst(2);
         dll.addFirst(1); 
         dll.printlist(); 
         dll.remove();
         dll.printlist();
    }
    }