public class reversedoublyll{
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
    public void reverse(){
        node curr=head;
        node prev=null;
        node next;
        while (curr !=null) { 
           next=curr.next;
           curr.next=prev;
           curr.prev=next;
           prev=curr;
           curr=next; 
        }
        head=prev;
    }
    public static void main(String[] args) {
        reversedoublyll dll=new reversedoublyll();
         dll.addFirst(5);
         dll.addFirst(4);
         dll.addFirst(3);
         dll.addFirst(2);
         dll.addFirst(1); 
         dll.printlist(); 
         dll.reverse();
         dll.printlist();
    }
    }