package hw7;

public class hw7 {

	public static void main(String[] args) {
		AnimalClassTester qa = new AnimalClassTester();
			
		Tyrannosaur tyrannosaur = new Tyrannosaur();
		if (qa.testAnimalObject(tyrannosaur)) {
			System.out.println("Tyrranosaur class passes");
		} else {
			System.out.println(">>>>Tyrranosaur class Failed!<<<<");
		}
		
		Penguin penguin = new Penguin();
		if (qa.testAnimalObject(penguin)) {
			System.out.println("Penguin class passes");
		} else {
			System.out.println(">>>>Penguin class Failed!<<<<");
		}
		
		Cow cow = new Cow();
		if (qa.testAnimalObject(cow)) {
			System.out.println("Cow class passes");
		} else {
			System.out.println(">>>>Cow class Failed!<<<<");
		}
		
		Octopus octopus = new Octopus();
		if (qa.testAnimalObject(octopus)) {
			System.out.println("Octopus class passes");
		} else {
			System.out.println(">>>>Octopus class Failed!<<<<");
		}	
	}
}