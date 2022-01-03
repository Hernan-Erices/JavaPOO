package listaSimpleEnlazada;

public class SinglyLinkedList {
	
    public Node head;

    
    //CONSTRUCTOR
    public SinglyLinkedList() { 
    	this.head=null;
    }
    
    //METODO REMOVE
	public void remove() {
		Node remove = head;
            remove.next = remove.getNext();
        Node head = remove.getNext();
        remove.setNext(head.getNext());
	}
    
	//METODO MOSTRAR LISTA EN EL MISMO ORDEN QUE FUE CREADO
	public void printValues() {
		
        System.out.print("");
    	Node NodeA = head;
        while(NodeA != null){
        	System.out.print(NodeA.getValue() + " - ");
        	NodeA = NodeA.getNext();
        }
	}

	//METODO AGREGAR NODE
    public void add(int value) {

        Node newNode = new Node(value);

        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }  
}
