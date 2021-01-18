/**
 * 
 * @author Michelle Psaras
 * Prints out 4 different calculated individual's body mass indexes by creating an object from 
 * the Person class with the parameters needed.
 * a
 *
 */
public class Fitness {

	public static void main(String[] args) {
		
		//Creates a person object, calls the getter method to get the first name and prints the name, 
		//bmi, and bmi level of each individual
		
		Person person1 = new Person("Tom", "H", 152.5, 5, 6);
		String firstName = person1.getFirstName();
		System.out.println(firstName + ":" + person1.calculateBMI());
			
		Person leslie = new Person("Leslie", "Knope", 'K', 32, 122.9, 4, 11);
		firstName = leslie.getFirstName();
		System.out.println(firstName + ":" + leslie.calculateBMI());
		
		Person man = new Person("Ron", "Swanson", 222.2, 6, 0);
		firstName = man.getFirstName();
		System.out.println(firstName + ":" + man.calculateBMI());
		
		Person woman = new Person("April", "Ludgate", 110.5, 5, 5);
		firstName = woman.getFirstName();
		System.out.println(firstName + ":" + woman.calculateBMI());
		
				
		
	}
}
