package models;

public interface HIPPAACompliantUser {

	abstract boolean assignPin(int pin);
	
	abstract boolean accessAuthorized(Integer confirmedAuthID);
	
	
//	abstract boolean assignPinAdmin(Integer confirmedAuthI);



}