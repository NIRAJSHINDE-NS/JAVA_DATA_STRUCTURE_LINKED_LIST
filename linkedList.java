public class LinkedList {
	int data;
	Node next;
	Node head;

	//Node Class
	class Node {
		int data;
		Node next;

		//Parameterized Constructor
		Node(int x) {
			data = x;
			next = null;
		}
	}
	
	public Node insertNode(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
		return head;
	}
	
	public void display() 
	{
		Node node = head;
		while(node!=null) {
			System.out.print(node.data + " -> ");
			node = node.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		System.out.println("Creating a Linked List");
		
		l.insertNode(70);
		l.insertNode(30);
		l.insertNode(56);
		
		l.display();

	}
}