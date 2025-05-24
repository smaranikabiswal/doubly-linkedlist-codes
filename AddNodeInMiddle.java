public class AddNodeInMiddle{
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
public void addMiddle(int idx,int data){
    node newnode=new node(data);
    node temp=head;
    int i=0;
    while (i<idx-1) { 
        temp=temp.next;
        i++;
    }
newnode.next=temp.next;
temp.next=newnode;
}
public void printlist(){
  node temp=head;
  while (temp!=null) { 
     System.out.print(temp.data+"->"); 
     temp=temp.next;
  } 
  System.out.println("null"); 
}
public static void main(String[] args) {
    AddNodeInMiddle ll=new AddNodeInMiddle();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addMiddle(2, 5);
    ll.printlist();
}
}