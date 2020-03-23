package hw7;

public class AnimalClassTester {
	public boolean testAnimalObject(Object animal) {
		if (animal instanceof AnimalList) {
			AnimalList al = (AnimalList) animal;
			System.out.println("This is the name of the animal "+al.aboutMe());
			if (al.aboutMe() == al.aboutMe()) {
				System.out.println("This is the diet "+al.diet());
				if (al.diet() == al.diet()) {
				return true;
				}
			}
		else
			return false;	
	}		
		return false;
	}
}