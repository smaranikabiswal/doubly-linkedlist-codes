public class ReverseALinkedList{
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
    public void reverse(){
        node prev=null;
        node curr=tail=head;
        node next;
        while (curr !=null) { 
          next=curr.next;
          curr.next=prev;
          prev=curr;
          curr=next;  
        }
        head=prev;
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
        ReverseALinkedList ll = new ReverseALinkedList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printList();
        ll.reverse();
        ll.printList();
    }
}
