public class iterativeSearch{
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
    public void addfirst(int data){
        node newnode=new node(data);
if(head==null) {
       head=tail=newnode;
       return;     
        }
        newnode.next=head;
        head=newnode;
        }
        public int isearch(int key){
            node temp=head;
            int i=0;
            while (temp !=null) { 
              if (temp.data==key) {
                 return i; 
              }  
              temp=temp.next;
              i++;
            }
            return -1;
        }
        public void printlist(){
            node temp=head;
            while(temp !=null){
System.out.print(temp.data+"->");
temp=temp.next;
            }
            System.out.println("null");
        }
        public static void main(String[] args) {
            iterativeSearch ll=new iterativeSearch();
            ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        System.out.println(ll.isearch(2));
        ll.printlist();
        }
    }
