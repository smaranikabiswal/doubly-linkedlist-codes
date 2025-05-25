public class RecursiveSearch{
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
    public int helper(node head,int key){
        if (head==null) {
           return -1; 
        }
        if (head.data==key) {
           return 0; 
        }
        int idx=helper(head.next,key);
        if (idx==-1) {
          return -1;  
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);

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
        RecursiveSearch ll=new RecursiveSearch();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printlist();
       System.out.println(ll.recSearch(3));
    }
}