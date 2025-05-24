public class RemoveNodeAtFirst{
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
            return;
        }else{
        tail.next=newnode;
        tail=newnode;
        }
        size++;
    }
    public int removefirst(){
        if (size==0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        int val=head.data;
        if(size==1){
          
          head=tail=null;  
        }else{
        
        head=head.next;
        }
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
        RemoveNodeAtFirst ll=new RemoveNodeAtFirst();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.removefirst();
        ll.printlist();
    }
}