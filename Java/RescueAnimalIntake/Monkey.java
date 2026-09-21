
public class Monkey extends RescueAnimal {

	// Instance variables
	private String species;
	private double tailLength;
	private double height;
	private double bodyLength;
	
	// Constructor
    public Monkey(String name, String species, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry, 
	double tailLength, double height, double bodyLength) {
        setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
		setAnimalType("monkey"); // This line ensures animalType is set.
    }

    
    // Access species
    public String getSpecies() {
    	return species;
    }
    
    // Modify species
    public void setSpecies(String species) {
    	this.species = species;
    }
    
    // Access tail length
    public double getTailLength() {
    	return tailLength;
    }
    
    // Modify tail length
    public void setTailLength(double tailLength) {
    	this.tailLength = tailLength;
    }
    
    // Access height
    public double getHeight() {
    	return height;
    }
    
    // Modify height
    public void setHeight(double height) {
    	this.height = height;
    }
    
    // Access body length
    public double getBodyLength() {
    	return bodyLength;
    }
    
    // Modify body length
    public void setBodyLength(double bodyLength) {
    	this.bodyLength = bodyLength;
    }
    
}
