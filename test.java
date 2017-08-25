// Creating class YourName
public class YourName {

	// Making sure its a string
	public static void main(String[] args) {

		// Printing my name 
		System.out.println("Sakina Shivji");

	}
}

// Doing the same thing with integers
public class DataTypes {
	
	public static void main(String[] args) {

		// Testing to see how large the number can go before I get an error (9)
		System.out.println(552461425);

		// DataTypes.java:4: error: integer number too large: 5524614251

	}

}

// Using Java chars
// char is short for character and can represent a single character.
// All char values must be enclosed in single quotes
public class DataTypesC {
	public static void main(String[] args) {

		System.out.println('s');

	}
}

// Setting primative types in variables
public class Variables {
	public static void main(String[] args) {

		int myNumber = 42;
		boolean isFun = true; 
		char movieRating = 'A'; 

	}
}

// Doing basic math with Java
public class Arithmetic {
	public static void main(String[] args) {

		int myNumber = 2 * 9;
    
		int sum = 34 + 113;
		int difference = 91 - 205;
		int product = 2 * 8; 
		int quotient = 45 / 3;
    
		System.out.println(myNumber);
		System.out.println(sum);
		System.out.println(difference);
		System.out.println(product);
		System.out.println(quotient);

	}
}

// Using modulo operator to print out the remainder of 2
public class Modulo {
	public static void main(String[] args) {

		int myRemainder = 16 % 7;
		System.out.println(myRemainder);

	}
} 

// Using Relational Operators to get booleans
public class RelationalOperators {
	public static void main(String[] args) {

	System.out.println(9 < 7); // false
    System.out.println(2 < 7); // true

	}
}