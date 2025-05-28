public class zigzagLinkedList{
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
    public void zigzag(){
        node slow=head;
        node fast=head.next;
        while(fast !=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        node mid=slow;
        node curr=mid.next;
        mid.next=null;
        node prev=null;
        node next;
        while (curr !=null) { 
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node left=head;
        node right=prev;
        node nextl,nextr;
        while(left !=null && right !=null){
            nextl=left.next;
            left.next=right;
            nextr=right.next;
            right.next =nextl;
            left=nextl;
            right=nextr;
        }
    }
    public static void main(String[] args) {
        zigzagLinkedList ll = new zigzagLinkedList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printList();
        ll.zigzag();
        ll.printList();
    }

}