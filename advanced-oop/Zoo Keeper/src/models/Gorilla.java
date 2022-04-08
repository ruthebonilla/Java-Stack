package models;

public class Gorilla extends Mammal {
	public Gorilla() {
		
		
	}

	
	public void throwSomething() {
		this.energyLevel -= 5;
		System.out.println("The gorilla threw something. His energy level is now at: " + energyLevel);
	}
	
	
	
	public void eatBananas() {
		this.energyLevel += 10;
		System.out.println("The gorilla has eaten a banana and has regained his energy. It's now at: " + energyLevel);
	}
	
	
	
	public void climb() {
		this.energyLevel -= 10;
		System.out.println("The gorilla climbed a tree and is tired, energy is now at: " + energyLevel);
	}
	
}
