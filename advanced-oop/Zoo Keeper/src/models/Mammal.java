package models;

public class Mammal {

	public int energyLevel;
	
	public Mammal() {
		this.energyLevel = 50;
	}
	
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	
	public int displayEnergy() {
		System.out.println("Mammal energy level is at " + energyLevel);
		return this.energyLevel;
	}

	
	
	
	//Getters and Setters
	public int getEnergyLevel() {
		return energyLevel;
	}
	
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
