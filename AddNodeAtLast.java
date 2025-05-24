public class AddNodeAtLast{
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
    public void addLast(int data){
        node newnode=new node(data);
if (head==null) {
    head=tail=newnode;
    return;
}
tail.next=newnode;
tail=newnode;
        
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
        AddNodeAtLast ll=new AddNodeAtLast();
        ll.addLast(1);
        ll.addLast(4);
        ll.addLast(8);
        ll.printList();
    }
}