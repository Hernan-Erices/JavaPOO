package listaSimpleEnlazada;

public class SinglyLinkedList {
	
	public int tam = 0;
    public Node head;

    public SinglyLinkedList() { }
    
    
    //ELIMINAR EL ULTIMO DE LA LISTA, NO ELIMINA EL ULTIMO:(
	public void remove() {
		
		Node remove = head;
		
        for (int i = 0; i < tam; i--) {
            remove = remove.getNext();
        }
        Node head = remove.getNext();
        remove.setNext(head.getNext());
        tam--;
	}
	
	//VALORES NODO
	public void printValues() {
		
        System.out.print("\n\n");
    	Node aux = head;
        while(aux != null){
        	System.out.print(aux.getValue() + ", ");
        	aux = aux.getNext();
        }
	}
   
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