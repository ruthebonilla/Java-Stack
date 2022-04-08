package models;
import java.util.*;


public class Physician extends User implements HIPPAACompliantUser  {

	  private ArrayList<String> patientNotes;
	 
	  
		
	    // TO DO: Constructor that takes an ID
	 public Physician(Integer Id) {
			super(Id);
			
		}
	 
	
	    // TO DO: Implement HIPAACompliantUser!

	 	 
	 
	    public void newPatientNotes(String notes, String patientName, Date date) {
	        String report = String.format(
	            "Datetime Submitted: %s \n", date);
	        report += String.format("Reported By ID: %s\n", this.id);
	        report += String.format("Patient Name: %s\n", patientName);
	        report += String.format("Notes: %s \n", notes);
	        this.patientNotes.add(report);
	    }

		

		public ArrayList<String> getPatientNotes() {
			return patientNotes;
		}

		public void setPatientNotes(ArrayList<String> patientNotes) {
			this.patientNotes = patientNotes;
		}



		@Override
		public boolean assignPin(int pin) {
			if(pin>=1000 && pin<=9999) {
				return true;
			}
			return false;

		    }


		@Override
		public boolean accessAuthorized(Integer confirmedAuthID) {
			if(confirmedAuthID !=id) {
			return false;
		}
			return true;
		}
    
	    
	    
}