public class RemoveNodeAtLast{
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
    public static int size;
    public void addlast(int data){
        node newnode=new node(data);
        if (head==null) {
            head=tail=newnode;
            size++;
            return;
            
        }else{
        tail.next=newnode;
        tail=newnode;
        }
        size++;
    }
    public int removelast(){
        if (size==0) {
          System.out.println("ll is empty"); 
          return Integer.MIN_VALUE; 
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        node prev=head;
        for (int i = 0; i < size-2; i++) {
          prev=prev.next;  
        }
        int val=tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public void printlist(){
        node temp=head;
        while (temp !=null) { 
           System.out.print(temp.data+"->"); 
           temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        RemoveNodeAtLast ll=new RemoveNodeAtLast();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        
        ll.removelast();
        ll.printlist();
    }
}