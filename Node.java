package homework5;
/*
 * Node for MyLinklist
 */
public class Node {

	public String name;
	public Node next;
	
	Node(){
		this.name = "";
		this.next = null;
	}
	
	Node(String s){
		this.name=s;
	}
}
