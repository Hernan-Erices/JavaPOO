package listaSimpleEnlazada;

public class ListTester {

	public static void main(String[] args) {
		
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.add(3);     
        
        sll.add(9); //ELIMINA        
        
        sll.add(10); //ELIMINA      
        
        sll.add(5);
        
        sll.add(15);
   
        sll.add(2);
        
        sll.add(25);
        
        sll.add(8);
        
        sll.remove();
        sll.remove();
        
       

        sll.printValues();

	}

}
