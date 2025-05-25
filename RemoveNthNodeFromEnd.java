public class RemoveNthNodeFromEnd{
public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;
    public void addFirst(int data){
        node newnode=new node(data);
        if (head==null) {
           head=tail=newnode; 
           return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void end(int n){
        int size=0;
        node temp=head;
        while(temp !=null){
            temp=temp.next;
            size++;
        }
        if (n==size) {
           head=head.next;
           return; 
        }
        int i=1;
        int find=size-n;
        node prev=head;
        while (i<find) { 
           prev=prev.next;
           i++; 
        }
        prev.next=prev.next.next;
        
    }
     public void printList() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        RemoveNthNodeFromEnd ll = new RemoveNthNodeFromEnd();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printList();
        ll.end(3);
        ll.printList();
    }
}

