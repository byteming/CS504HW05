# CS504HW05
LinkedList class with method add, insertBefore, insertAfter, removeIndexOf.

Question:

Create a LinkedList for the following node:

class Node {
    public String name;
    public Node next;
    Node( ) {  }
    Node(Sting  s) {  // set the name }
}

Implement code for all methods for the LinkedList and create a main program to test each method in the LinkedList.

class MyLinkedList {

      private Node head;

     MyLinkedList( ) {   }
     public void addNode(Node n) { // add a Node to end of the LinkedList }
     public void printList( ) {  // print each element in the LinkedList }
     public void insertBefore (int index,  Node n)  { // 	 } 
     public void insertAfter (int index,  Node n)  { // adds Node n after index value }     
     public int  indexOf (String  str) { //returns index of where String str  is at.  Returns -1 if String str
					  is not in LinkedList }
     public void removeNodeAt(int index) { // removes Node at index value }

}
