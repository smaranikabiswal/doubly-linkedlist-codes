
public class doublyll{
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
    public static void main(String[] args) {
        doublyll dll=new doublyll();
         dll.addFirst(5);
         dll.addFirst(4);
         dll.addFirst(3);
         dll.addFirst(2);
         dll.addFirst(1); 
         dll.printlist(); 
    }
    }