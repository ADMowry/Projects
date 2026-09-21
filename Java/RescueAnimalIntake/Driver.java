import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	private static ArrayList<Dog> dogList = new ArrayList<Dog>(); // List of dogs
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>(); // List of monkeys
    // Instance variables (if needed)
    

    public static void main(String[] args) {

    	// Loads initial list of dogs and monkeys
        initializeDogList();
        initializeMonkeyList();

        // Menu controls
        Scanner scanner = new Scanner(System.in);
        boolean exitProgram = false;

        do {
        	displayMenu();
        	String option = scanner.nextLine();
        	
        	switch(option) {
        		case "1":
        			intakeNewDog(scanner); // Add new dog
        			break;
        		case "2":
        			intakeNewMonkey(scanner); // Add new monkey
        			break;
        		case "3":
        			reserveAnimal(scanner); // Reserve an animal
        			break;
        		case "4":
        			printAnimals("dog"); // Prints a list of all dogs
        			break;
        		case "5":
        			printAnimals("monkey"); // Prints a list of all monkeys
        			break;
        		case "6":
        			printAnimals("available"); //Prints available dogs and monkeys
        			break;
        		case "q":
        			exitProgram = true; // Quits program
        			break;
        			
        		default:
        			System.out.println("Invalid option"); // Input validation
        			break;
        	}
        } while(!exitProgram);
        	
     }
        
    

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Larry", "Capuchin", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States", 5, 50, 5);
        Monkey monkey2 = new Monkey("Frank", "Guenon", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States", 6, 60, 6);
        Monkey monkey3 = new Monkey("Beth", "Macaque", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada", 7, 70, 7);

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }


    // Adds new dog
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) { // Confirms dog is not already in list.
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Prompts user and takes input for dog information   
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
	        
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
	        
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
	        
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
	        
        System.out.println("What is the dog's acquisition date?");
        String acquisitionDate = scanner.nextLine();
	        
        System.out.println("What is the dog's acquisition location?");
        String acquisitionLocation = scanner.nextLine();
	        
        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();
	        
        System.out.println("Is the dog reserved?");
        boolean reserved = scanner.nextBoolean();
        scanner.nextLine();
        		
        System.out.println("What is the dog's service country?");
        String inServiceCountry = scanner.nextLine();
        		
        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionLocation, trainingStatus, reserved, inServiceCountry);
        dogList.add(newDog); // Adds dog to list
        	
     }
    
    	// Adds new monkey
        public static void intakeNewMonkey(Scanner scanner) {
        	System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
            for(Monkey monkey: monkeyList) {
                if(monkey.getName().equalsIgnoreCase(name)) { // Confirms monkey is not already in list
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu
                }
            }
            
            // Prompts user and takes input for monkey information 
            System.out.println("What is the monkey's species?");
            String species = scanner.nextLine();
    	        
            System.out.println("What is the monkey's gender?");
            String gender = scanner.nextLine();
    	        
            System.out.println("What is the monkey's age?");
            String age = scanner.nextLine();
    	        
            System.out.println("What is the monkey's weight?");
            String weight = scanner.nextLine();
    	        
            System.out.println("What is the monkey's acquisition date?");
            String acquisitionDate = scanner.nextLine();
    	        
            System.out.println("What is the monkey's acquisition location?");
            String acquisitionLocation = scanner.nextLine();
    	        
            System.out.println("What is the monkey's training status?");
            String trainingStatus = scanner.nextLine();
    	        
            System.out.println("Is the monkey reserved?");
            boolean reserved = scanner.nextBoolean();
            scanner.nextLine();
            		
            System.out.println("What is the monkey's service country?");
            String inServiceCountry = scanner.nextLine();
            
            System.out.println("What is the monkey's tail length?");
            double tailLength = scanner.nextDouble();
            
            System.out.println("What is the monkey's height?");
           double height = scanner.nextDouble();
            
            System.out.println("What is the monkey's body length?");
            double bodyLength = scanner.nextDouble();
            		
            Monkey newMonkey = new Monkey(name, species, gender, age, weight, acquisitionDate, acquisitionLocation, trainingStatus, reserved, inServiceCountry, tailLength, height, bodyLength);
            monkeyList.add(newMonkey); // Adds monkey to list
        }

        // Reserves an animal
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("What type of animal do you want to reserve?");
            String animalType = scanner.nextLine();
            
            System.out.println("In what country will the animal be in service?");
            String serviceCountry = scanner.nextLine();
            
            // Reserves a dog if dog is available and in the correct country
            if (animalType.equals("dog")) {
            	for (Dog dog : dogList) {
            		if ((dog.getInServiceCountry().equals(serviceCountry)) && (dog.getReserved() == false)) {
            			dog.setReserved(true);
            			return;
            		}
                    else {
                        System.out.println("No dogs available with this criteria.");
                    }
            	}
            }
            
            // Reserves a monkey if monkey is available and in the correct country
            else if (animalType.equals("monkey")) {
            	for (Monkey monkey : monkeyList) {
            		if ((monkey.getInServiceCountry().equals(serviceCountry)) && (monkey.getReserved() == false)) {
            			monkey.setReserved(true);
            			return;
            		}
                    else {
                        System.out.println("No monkeys available with this criteria.");
                    }
            	}
            }
        }

        // Prints various lists of animals with name, training status, acquisition country, and reserve status, depending on list type
        public static void printAnimals(String listType) {
            switch(listType) {
            // Prints a list of dogs
            case "dog":
            	for (Dog dog : dogList) {
            		String name = dog.getName();
            		String trainingStatus = dog.getTrainingStatus();
            		String acquisitionCountry = dog.getAcquisitionLocation();
            		boolean reserved = dog.getReserved();
            		System.out.println(name + ": " + trainingStatus + "/" + acquisitionCountry + "/" + reserved);
            	}
            	break;
            // Prints a list of monkeys
            case "monkey": 
            	System.out.println("This option needs to be implemented.");
            	break;
            // Prints animals that are in service and not reserved
            case "available":
            	for (Dog dog : dogList) {
            		if ((dog.getTrainingStatus().equals("in service")) && (dog.getReserved() == false)) {
            			String name = dog.getName();
                		String trainingStatus = dog.getTrainingStatus();
                		String acquisitionCountry = dog.getAcquisitionLocation();
                		boolean reserved = dog.getReserved();
                		System.out.println(name + ": " + trainingStatus + "/" + acquisitionCountry + "/" + reserved);
            		}
            	}
            	for (Monkey monkey : monkeyList) {
            		if ((monkey.getTrainingStatus().equals("in service")) && (monkey.getReserved() == false)) {
            			String name = monkey.getName();
                		String trainingStatus = monkey.getTrainingStatus();
                		String acquisitionCountry = monkey.getAcquisitionLocation();
                		boolean reserved = monkey.getReserved();
                		System.out.println(name + ": " + trainingStatus + "/" + acquisitionCountry + "/" + reserved);
            		}
            	}
            	break;
            }

        }
}

