
public class LinkedList {
   class Node{
	   int data;
	   Node next;
	   
	   public Node(int value) {
		   data=value;
		   next=null;
	   }
   }
   private Node tail;
   
   public LinkedList() {
	   tail=null;
   }
   public boolean isEmpty() {
	   return tail==null;
   }
   public void addLast(int value) {
	   Node newnode= new Node(value);
	   //if list is empty
	   if(tail==null) {
		   tail=newnode;
		   //make it circular
		   tail.next=tail;
	   }else {
		//if list has items already 
		   newnode.next=tail.next;
		   tail.next=newnode;
		     tail=newnode;
	   }
   }
   public void addFirst(int value) {
	   Node newnode= new Node(value);
	   if(tail==null) {
		   tail=newnode;
		   tail.next=tail;
	   }else {
		   newnode.next=tail.next;
		   tail.next=newnode;
	   }
   }
   public void deleteFirst() {
	   if(tail==null) {
		   return;
	   }
	   tail.next=tail.next.next;
   }
   public void deleteLast() {
	   if(tail==null) {
		   return;
	   }else if(tail.next==tail) {
		   tail=null;
		   return;
	   }else {
		   Node trav=tail.next;
		   while(trav.next != tail) {
			   trav=trav.next;
		   }
		   trav.next=tail.next;
		   tail=trav;
	   }
	   
   }
   public void addPosition(int value,int pos) {
	   Node newnode=new Node(value);
	   if(tail==null) {
		   tail=newnode;
		   tail.next=tail;
	   }else if(pos==1) {
		   addFirst(value);
	   }else {
		   Node trav=tail.next;
		   for(int i=1;i<pos-1;i++) {
			   trav=trav.next;
		   }
		   newnode.next=trav.next;
		   trav.next=newnode;
	   }
   }
   public void deletePosition(int pos) {
	   if(tail==null) {
		   return;
	   }else if(tail.next==tail) {
		   tail=null;
	   }else {
		   Node trav=tail.next;
		   for(int i=1;i<pos-1;i++) {
			   trav=trav.next;
		   }
		   trav.next=trav.next.next;
	   }
   }
   
   public void display() { 
		   Node trav=tail.next;
		   System.out.print("list :: ");
		   do {
			   System.out.print(" "+trav.data);
			   trav=trav.next;
		   }while(trav != tail.next);
		   System.out.println();
	   
   }
   public static void main(String[] args) {
	   LinkedList list= new LinkedList();
	   list.addLast(10);
	   list.addLast(20);
	   list.addLast(30);
	   list.addLast(40);
	   list.addLast(50);
	   list.addLast(60);
	   list.addLast(70);
	   list.addFirst(100);
//	   list.deleteFirst();
//	   list.deleteLast();
//	   list.addPosition(200, 3);
	   list.deletePosition(3);
	   list.display();
   }
}
