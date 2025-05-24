public class AddNodeAtFirst{
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
     public void printList() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        AddNodeAtFirst ll = new AddNodeAtFirst();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.printList();
    }
}