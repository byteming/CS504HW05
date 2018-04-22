package homework5;

public class MyLinkedList {

	private Node head;
	
	MyLinkedList(){
		this.head = null;
	}
	
	//add a Node to end of the LinkedList 
	public void addNode(Node n) {
		if(head == null) {
			head = n;
		}else {
			Node trav = head;
			while(trav.next != null) {
				trav = trav.next;
			}
			trav.next = n;
		}
	}
	//print each element in the LinkedList 
	public void printList() {
		
		if(head == null) {
			System.out.println("null");
		}else {
			Node trav = head;
			System.out.print("[");
			while(trav != null) {
				System.out.print(trav.name+" ");
				trav = trav.next;
			}
			System.out.print("]");
		}
		System.out.println();
	}
	
	//adds Node n before index value 
	public void insertBefore(int index, Node n) {
		int counter = 0;
		Node trav = head;
		while(counter < index-1) {
			trav = trav.next;
			counter++;
		}
		n.next = trav.next;
		trav.next = n;
	}
	
	//adds Node n after index value
	public void insertAfter(int index, Node n) {
		int counter =0;
		Node trav = head;
		while(counter <index) {
			trav = trav.next;
			counter++;
		}
		n.next = trav.next;
		trav.next = n;
	}
	
	//returns index of where String str  is at.  Returns -1 if String str is not in LinkedList 
	public int indexOf(String str) {
		int counter =0;
		Node trav = head;
		while(trav != null) {
			if(trav.name.equals(str))
				break;
			trav = trav.next;
			counter++;
		}
		if(trav == null)
			return -1;
		else
			return counter;
	}
	
	//removes Node at index value
	public void removeNodeAt(int index) {
		if(index == 0) {
			head = head.next;
		}else {
			int counter = 0;
			Node trav = head;
			while(counter < index-1) {
				trav = trav.next;
				counter ++;
			}
			trav.next = trav.next.next;
		}
	}

}
