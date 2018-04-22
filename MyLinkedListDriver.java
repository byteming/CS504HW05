package homework5;

public class MyLinkedListDriver {

	public static void main(String[] args) {
		MyLinkedList arr = new MyLinkedList();
		arr.addNode(new Node("Bill"));
		arr.addNode(new Node("Jill"));
		arr.addNode(new Node("Sill"));
		arr.addNode(new Node("Lill"));
		arr.addNode(new Node("Qill"));
		
		arr.printList();
		
		arr.insertBefore(1, new Node("Tom"));
		arr.printList();
		
		arr.insertAfter(1, new Node("Joe"));
		arr.printList();
		
		arr.removeNodeAt(0);
		arr.printList();
		
		System.out.println(arr.indexOf("Tom"));
		System.out.println(arr.indexOf("leo"));
	}
}
