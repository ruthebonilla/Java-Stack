package models;
import java.util.*;
 

public class AdminUser extends User implements HIPPAACompliantUser
, HIPPACompliantAdmin {
//... imports class definition...
    
    // Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents = new ArrayList<String>();
    
    
    // TO DO: Implement a constructor that takes an ID and a role
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
//    HIPPAACompliantUser User();
//    HIPPACompliantAdmin Admin();
  
     public AdminUser(Integer employeeID, String role) {
		super(employeeID);
		this.employeeID = employeeID;
		this.role = role;
	} 
  
    
	public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
  
	public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
	//checking for 6 digit pin
	@Override
	public boolean assignPin(int pin) {
		if(pin>=100000 && pin<=999999) {
			return true;
		}
		return false;

	    }
	
	
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}
	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
	
	

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(confirmedAuthID !=employeeID) {
			authIncident();
			return false;
		}
		return true;
		
    	}


	@Override
	public ArrayList<String> reportSecurityIncidents() {
		return securityIncidents ;

	}
	

}