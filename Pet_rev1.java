package petBag;

public class Pet {
	//Instance variables of Pet class
	private String petName;
	private String petType;
	private int petAge; 
	private int dogSpace;
	private int catSpace;
	private int daysStay; 
    private double amountDue; 
    
    //Constructor for Pet class. -1 indicating no data entered.
	public Pet() {  
		petName = "NoNameEnteredYet";    
		petType = "noTypeEnteredYet";        
        petAge = -1;
        dogSpace = -1;
        catSpace = -1;
        daysStay = -1;
        amountDue = -1.00;
	 }	
	//Additional methods required per UML document
	
    public void checkIn() {
        // STUB TODO: Implement later
    }

    public void checkOut() {
        // STUB TODO: Implement later
    }

    public void getPet() {
        // STUB TODO: Implement later
    }

    public void createPet() {
        // STUB TODO: Implement later
    }

    public void updatePet() {
        // STUB TODO: Implement later
    }
    

	
	
	

}
