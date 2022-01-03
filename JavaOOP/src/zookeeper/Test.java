package zookeeper;

public class Test {

	public static void main(String[] args) {
	//GORILLA
	System.out.println("GORILLA");
	Gorilla gor = new Gorilla();
	
	gor.throwSomething(10);
	gor.eatBananas(3);
	gor.climb(2);	
	
	//Mammal energy = new Mammal();
	//energy.desiplayEnergy();
	
	System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	
	//BAT
	System.out.println("BAT");
	Bat bat = new Bat();
	bat.attackTown(4);
	bat.eatHumans(3);
	bat.fly(1);
	}

}
