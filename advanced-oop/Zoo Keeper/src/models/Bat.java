package models;

public class Bat extends Mammal {

	public Bat() {
		this.energyLevel = 300;
	}
	
	public void fly() {
		this.energyLevel -= 50;
		System.out.println("1,2,3 aaand we're off! weeee. Energy level: " + energyLevel);
		System.out.println("***ATTACKS TOWN***");
	}
	
	
	public void eatHuman() {
		this.energyLevel += 25;
		System.out.println("Yeah... so... *eats human*  Energy level: " + energyLevel);
	}
	
	
	public void attackTown() {
		this.energyLevel -= 100;
		System.out.println("ahhhh someone call 911!  Energy level: " + energyLevel);
	}
}
