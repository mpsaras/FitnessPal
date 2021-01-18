/**
 * Calculates the body mass index(bmi) and determines the body mass index level given four individual's parameters
 * @author Michelle Psaras
 * @parameters firstName, lastName, lastNameInitial, age, weight, feet, inches
 * @return a String of "bmi + ":" + bmiLevel"
 *
 */
public class Person {
	
		private String firstName;
		private String lastName;
		private char lastNameInitial;
		private int age;
		private double weight; //Assume weight is in pounds
		private int feet;
		private int inches;
		
		//Overloaded constructors
		Person(String firstName, String lastName, double weight, int feet, int inches) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
		}
		
		Person(String firstName, char lastNameInitial, double weight, int feet, int inches) {
		this.firstName = firstName;
		this.lastNameInitial = lastNameInitial;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;			
		}
		
		Person(String firstName, String lastName, char lastNameInitial, int age, double weight, int feet, int inches) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastNameInitial = lastNameInitial;
		this.age = age;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
		}
		
		//Getter and Setter methods to get values of private variables
		public String getFirstName() {
			return firstName;
		}
		
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		
		public String getLastName() {
			return lastName;
		}
		
		
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		
		public char getLastNameInitial() {
			return lastNameInitial;
		}
		
		
		public void setLastNameInitial(char lastNameInitial) {
			this.lastNameInitial = lastNameInitial;
		}
		
		
		public int getAge() {
			return age;
		}
		
		
		public void setAge(int age) {
			this.age = age;
		}
		
		
		public double getWeight() {
			return weight;
		}
		
		
		public void setWeight(double weight) {
			this.weight = weight;
		}
		
		
		public int getFeet() {
			return feet;
		}
		
		
		public void setFeet(int feet) {
			this.feet = feet;
		}
		
		
		public int getInches() {
			return inches;
		}
		
		
		public void setInches(int inches) {
			this.inches = inches;
		}
		
		//Calculate the body mass index given the weight, feet, and inches of the individual and return the calculated body mass index(bmi)
		//along with the body mass index level
		
		public String calculateBMI() {
			
			int heightInInches;
			String bmiLevel;
			double bmi;
			
			heightInInches = (this.feet * 12) + this.inches;
			
			bmi = (this.weight * 703) / (heightInInches * heightInInches);
			
			if (bmi < 18.5) {
				bmiLevel = "Underweight";
			}
			else if (bmi >= 18.5 && bmi <= 24.9) {
				bmiLevel = "Normal";
			}
			else if (bmi >= 25 && bmi <= 29.9) {
				bmiLevel = "Overweight";
			}
			else {
				bmiLevel = "Obese";
			}
		return bmi + ":" + bmiLevel;
		}
	}

