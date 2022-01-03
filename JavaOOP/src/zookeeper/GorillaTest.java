package zookeeper;

public class GorillaTest {

	public static void main(String[] args) {
	//GORILLA
	System.out.println("GORILLA");
	Gorilla gor = new Gorilla();
	
	gor.throwSomething(5);
	gor.eatBananas(1);
	gor.climb(11);	
	
	//Mammal energy = new Mammal();
	//energy.desiplayEnergy();
	
	System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	
	//BAT
	System.out.println("BAT");
	Bat bat = new Bat();
	bat.attackTown(2);
	bat.eatHumans(2);
	bat.fly(2);
	}
}
