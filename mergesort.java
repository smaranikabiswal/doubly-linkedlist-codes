public class mergesort{
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
 private node getmid(node head){
        node slow=head;
        node fast=head.next;
        while (fast !=null && fast.next !=null) { 
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public node mergesort(node head){
        if (head ==null || head.next ==null) {
           return head; 
        }
        node mid=getmid(head);
        node righthead=mid.next;
        mid.next=null;
        node newleft=mergesort(head);
        node newright=mergesort(righthead);
        return merge(newleft,newright);
    }
   
    private node merge(node head1,node head2){
        node mergell=new node(-1);
        node temp=mergell;
        while(head1 !=null && head2 !=null){
            if (head1.data <=head2.data) {
               temp.next=head1;
               head1=head1.next;
               temp=temp.next; 
            }else{
              temp.next=head2;
               head2=head2.next;
               temp=temp.next;   
            }
        }
        while(head1 !=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2 !=null){
            temp.next=head2;
               head2=head2.next;
               temp=temp.next;
        }
        return mergell.next;
    }
    public static void main(String[] args) {
        mergesort ll = new mergesort();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.printList();
        ll.head=ll.mergesort(ll.head);
        ll.printList();
    }
}
